package com.cloudy.client.template.remote.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloudy.client.template.engine.Template;
import com.cloudy.client.template.engine.VariableEvaluator;
import com.cloudy.uam.template.remote.UamTemplateService;
import com.cloudy.uam.template.remote.vo.TemplateVariable;

public class UamTemplateServiceClient
  implements UamTemplateService
{

  @Autowired
  private VariableEvaluator variableEvaluator;
  private UamTemplateService uamTemplateServiceServer;

  public void setUamTemplateServiceServer(UamTemplateService uamTemplateServiceServer)
  {
    this.uamTemplateServiceServer = uamTemplateServiceServer;
  }

  public String mergeTemplate(String templateCode, Map<String, Object> variableAndValue)
  {
    return this.uamTemplateServiceServer.mergeTemplate(templateCode, this.variableEvaluator.eval(templateCode, variableAndValue));
  }

  public List<TemplateVariable> findVariableByTemplateCode(String templateCode)
  {
    return this.uamTemplateServiceServer.findVariableByTemplateCode(templateCode);
  }

  public List<Template> findTemplateByType(String templateType)
  {
    //return this.uamTemplateServiceServer.findTemplateByType(templateType);
	  return null;
  }
}