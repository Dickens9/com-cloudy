package com.cloudy.client.template.engine.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cloudy.client.template.engine.VariableEvaluator;
import com.cloudy.common.exception.BusinessException;
import com.cloudy.uam.template.remote.UamTemplateService;
import com.cloudy.uam.template.remote.vo.EvalStatus;
import com.cloudy.uam.template.remote.vo.TemplateVariable;
import com.ibm.uam.enumdata.TemplateVariableType;

public class VariableEvaluatorImpl
  implements VariableEvaluator
{
  private Logger logger;
  private static String VARIABLE_PATTERN = "\\$\\{([a-zA-Z1-8_]+)\\}";

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Autowired
  @Qualifier("uamTemplateServiceClient")
  private UamTemplateService uamTemplateService;

  public VariableEvaluatorImpl()
  {
    this.logger = LoggerFactory.getLogger(super.getClass());
  }

  public Map<String, Object> eval(String templateCode, Map<String, Object> inputVars)
  {
    List<TemplateVariable> varsList = this.uamTemplateService.findVariableByTemplateCode(templateCode);
    if ((varsList == null) || (varsList.isEmpty())) {
      varsList = new ArrayList();
    }
    Map evalVars = new HashMap(varsList.size());
    Map defVars = getDefVarsMap(varsList);
    initInputVariable(evalVars, defVars, inputVars);
    StringBuilder errMsgBuilder = new StringBuilder();
    for (TemplateVariable tv : varsList) {
      if (EvalStatus.FAIL.equals(eval(tv.getName(), defVars, evalVars))) {
        this.logger.error(new StringBuilder().append(tv.getName()).append(":计算失败").toString());
        errMsgBuilder.append(new StringBuilder().append(tv.getName()).append(",").toString());
      }
    }
    String errMsg = errMsgBuilder.toString();
    if (!errMsg.isEmpty()) {
      throw new BusinessException("UAM.TEMPLATE.0002", new String[] { errMsg }, "计算变量时失败。");
    }

    return evalVars;
  }

  private EvalStatus eval(String name, Map<String, TemplateVariable> defVars, Map<String, Object> evalVars)
  {
    if ((!defVars.containsKey(name)) && (!evalVars.containsKey(name))) {
      this.logger.error(new StringBuilder().append("计算失败，定义及传入变量中不存在变量，变量名：").append(name).toString());
      return EvalStatus.FAIL;
    }

    TemplateVariable tv = (TemplateVariable)defVars.get(name);
    if ((tv == null) && (evalVars.containsKey(name)))
    {
      return EvalStatus.SUC;
    }

    if (tv.getEvalStatus().equals(EvalStatus.SUC))
      return EvalStatus.SUC;
    if (tv.getEvalStatus().equals(EvalStatus.FAIL))
      return EvalStatus.FAIL;
    if (tv.getEvalStatus().equals(EvalStatus.PENDING)) {
      this.logger.error(new StringBuilder().append("变量存在循环依赖，无法计算，计算失败，变更名：").append(name).toString());
      tv.setEvalStatus(EvalStatus.FAIL);
      return EvalStatus.FAIL;
    }

    tv.setEvalStatus(EvalStatus.PENDING);
    String config = tv.getConfig();
    config = evalConfig(defVars, evalVars, config);
    if (containVar(config))
    {
      this.logger.error(new StringBuilder().append("无法进行下一步运算, name:").append(name).append(" / config:").append(config).toString());
      return EvalStatus.FAIL;
    }

    if (TemplateVariableType.Fixed.getCode().equals(tv.getType())) {
      tv.setValue(config);
      tv.setEvalStatus(EvalStatus.SUC);
      evalVars.put(name, config);
      return EvalStatus.SUC;
    }if (TemplateVariableType.SingleSql.getCode().equals(tv.getType())) {
      try {
        String value = evalSingleSql(config);
        tv.setValue(value);
        evalVars.put(name, value);
      } catch (Exception e) {
        this.logger.error(new StringBuilder().append("name:").append(name).append("/config:").append(config).append("/变量计算错误：").toString(), e);
        return EvalStatus.FAIL;
      }
      tv.setEvalStatus(EvalStatus.SUC);
      return EvalStatus.SUC;
    }if (TemplateVariableType.ListSql.getCode().equals(tv.getType())) {
      try {
        List value = evalListSql(config);
        tv.setValue(value);
        evalVars.put(name, value);
      } catch (Exception e) {
        this.logger.error(new StringBuilder().append("name:").append(name).append("/config:").append(config).append("/变量计算错误：").toString(), e);
        return EvalStatus.FAIL;
      }
      tv.setEvalStatus(EvalStatus.SUC);
      return EvalStatus.SUC;
    }
    return EvalStatus.FAIL;
  }

  private List<Map<String, Object>> evalListSql(String config) {
    return this.jdbcTemplate.queryForList(config);
  }

  private String evalSingleSql(String config) {
    Map result = this.jdbcTemplate.queryForMap(config);
    Iterator i$ = result.keySet().iterator(); if (i$.hasNext()) { String key = (String)i$.next();
      return result.get(key).toString(); }

    return null;
  }

  private boolean containVar(String config)
  {
    Pattern pattern = Pattern.compile(VARIABLE_PATTERN, 2);
    Matcher matcher = pattern.matcher(config);
    return matcher.find();
  }

  private String evalConfig(Map<String, TemplateVariable> defVars, Map<String, Object> evalVars, String config)
  {
    List<String> innerVarNames = extractInnerVarName(config);

    if ((innerVarNames != null) && (!innerVarNames.isEmpty())) {
      for (String varName : innerVarNames) {
        EvalStatus evalStatus = eval(varName, defVars, evalVars);
        if (EvalStatus.SUC.equals(evalStatus)) {
          config = config.replaceAll(new StringBuilder().append("\\$\\{").append(varName).append("\\}").toString(), evalVars.get(varName).toString());
        }
      }
    }
    return config;
  }

  private List<String> extractInnerVarName(String config)
  {
    Pattern pattern = Pattern.compile(VARIABLE_PATTERN, 2);
    Matcher matcher = pattern.matcher(config);
    List innerVarNames = new ArrayList(5);
    while (matcher.find()) {
      innerVarNames.add(matcher.group(1));
    }
    return innerVarNames;
  }

  private Map<String, TemplateVariable> getDefVarsMap(List<TemplateVariable> varsList)
  {
    Map result = new HashMap(varsList.size());
    for (TemplateVariable var : varsList) {
      result.put(var.getName(), var);
    }
    return result;
  }

  private void initInputVariable(Map<String, Object> evalVars, Map<String, TemplateVariable> defVars, Map<String, Object> inputVars)
  {
    for (String key : inputVars.keySet()) {
      Object value = inputVars.get(key);
      evalVars.put(key, value);
      if (defVars.containsKey(key))
        ((TemplateVariable)defVars.get(key)).setEvalStatus(EvalStatus.SUC);
    }
  }
}
