package com.cloudy.client.basedata.web.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import com.cloudy.common.utils.SpringUtils;
import com.cloudy.uam.basedata.remote.UamBasedataService;
import com.cloudy.uam.basedata.remote.vo.Dict;

public class DictTag extends BodyTagSupport
{
  private static final long serialVersionUID = 2135103279367180789L;
  private static final String OPTION_TAG = "<option value='%1$s'>%2$s</option>";
  private static final String OPTION_SELECT_TAG = "<option value='%1$s' selected='selected'>%2$s</option>";
  private static final String SELECT_TAG = "<select ltype='select' id='%1$s' name='%2$s' class='%3$s' validate='%5$s' onchange='%6$s' ligerui='%7$s'>%4$s</select>";
  private static final String CHECK_TAG = "<input type='checkbox' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;";
  private static final String CHECK_SELECT_TAG = "<input type='checkbox' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s' checked='checked'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;";
  private static final String RADIO_TAG = "<input type='radio' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;";
  private static final String RADIO_SELECT_TAG = "<input type='radio' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s' checked='checked'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;";
  private String id;
  private String clazz;
  private String name;
  private String dictType;
  private String display;
  private String defaultvalue;
  private String dictCode;
  private String validate;
  private String onclick;
  private String onchange;
  private String ligerui;

  public DictTag()
  {
    this.clazz = "";

    this.validate = "";

    this.onclick = "";

    this.onchange = "";

    this.ligerui = "";
  }
  public String getValidate() {
    return this.validate;
  }

  public void setValidate(String validate) {
    this.validate = validate;
  }

  public String getDefaultvalue() {
    return this.defaultvalue;
  }

  public void setDefaultvalue(String defaultvalue) {
    this.defaultvalue = defaultvalue;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDictCode() {
    return this.dictCode;
  }

  public void setDictCode(String dictCode) {
    this.dictCode = dictCode;
  }

  public String getDictType() {
    return this.dictType;
  }

  public void setDictType(String dictType) {
    this.dictType = dictType;
  }

  public String getDisplay() {
    return this.display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public String getClazz() {
    return this.clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }

  public int doEndTag() throws JspException {
    try {
      this.pageContext.getOut().write(getDictTag());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return 6;
  }

  private String getDictTag() {
    UamBasedataService remoteService = (UamBasedataService)SpringUtils.getBean("uamBasedataServiceClient");
    String result = null;
    if (this.display.endsWith("select")) {
      Dict dict = remoteService.findDictByType(this.dictType);
      result = getSelectDict(dict.getChildren());
    } else if (this.display.endsWith("radio")) {
      Dict dict = remoteService.findDictByType(this.dictType);
      result = getRadio(dict.getChildren());
    } else if (this.display.endsWith("checkbox")) {
      Dict dict = remoteService.findDictByType(this.dictType);
      result = getCheckBox(dict.getChildren());
    } else if (this.display.endsWith("label")) {
      Dict dict = remoteService.findDictByTypeAndCode(this.dictType, this.dictCode);
      result = getLabel(dict);
    }
    return result;
  }

  private String getLabel(Dict dict) {
    if (dict != null) {
      return dict.getName();
    }
    return "";
  }
  private String getCheckBox(List<Dict> dicts) {
    List<String> checkTagList = new ArrayList();
    for (int i = 0; i < dicts.size(); ++i) {
      Dict dict = (Dict)dicts.get(i);
      if (isSelect(dict).booleanValue())
        checkTagList.add(String.format("<input type='checkbox' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s' checked='checked'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;", new Object[] { new StringBuilder().append(this.id).append("_").append(i).toString(), this.name, dict.getCode(), dict.getName(), this.clazz, this.validate, this.onclick }));
      else {
        checkTagList.add(String.format("<input type='checkbox' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;", new Object[] { new StringBuilder().append(this.id).append("_").append(i).toString(), this.name, dict.getCode(), dict.getName(), this.clazz, this.validate, this.onclick }));
      }
    }
    StringBuilder checkTag = new StringBuilder();
    for (String tag : checkTagList) {
      checkTag.append(tag);
    }
    return checkTag.toString();
  }

  private String getRadio(List<Dict> dicts) {
    List<String> checkTagList = new ArrayList();
    for (int i = 0; i < dicts.size(); ++i) {
      Dict dict = (Dict)dicts.get(i);
      if (isSelect(dict).booleanValue())
        checkTagList.add(String.format("<input type='radio' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s' checked='checked'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;", new Object[] { new StringBuilder().append(this.id).append("_").append(i).toString(), this.name, dict.getCode(), dict.getName(), this.clazz, this.validate, this.onclick }));
      else {
        checkTagList.add(String.format("<input type='radio' id='%1$s' name='%2$s' value='%3$s' class='%5$s' validate='%6$s' onclick='%7$s'/><label for='%1$s'>%4$s</label>&nbsp;&nbsp;", new Object[] { new StringBuilder().append(this.id).append("_").append(i).toString(), this.name, dict.getCode(), dict.getName(), this.clazz, this.validate, this.onclick }));
      }
    }
    StringBuilder checkTag = new StringBuilder();
    for (String tag : checkTagList) {
      checkTag.append(tag);
    }
    return checkTag.toString();
  }

  private String getSelectDict(List<Dict> dicts)
  {
    String result = "";
    boolean hasDefault = false;
    StringBuilder optTag = new StringBuilder();
    for (Dict dict : dicts) {
      if (isSelect(dict).booleanValue()) {
        optTag.append(String.format("<option value='%1$s' selected='selected'>%2$s</option>", new Object[] { dict.getCode(), dict.getName() }));
        hasDefault = true;
      } else {
        optTag.append(String.format("<option value='%1$s'>%2$s</option>", new Object[] { dict.getCode(), dict.getName() }));
      }
    }
    if (StringUtils.isNotEmpty(this.validate)) {
      this.validate = new StringBuilder().append("{appointInput:\"").append(this.id).append("_txt_val\"}").toString();
    }
    if (!hasDefault)
      result = String.format("<select ltype='select' id='%1$s' name='%2$s' class='%3$s' validate='%5$s' onchange='%6$s' ligerui='%7$s'>%4$s</select>", new Object[] { this.id, this.name, this.clazz, new StringBuilder().append(String.format("<option value='%1$s' selected='selected'>%2$s</option>", new Object[] { "", "请选择" })).append(optTag.toString()).toString(), this.validate, this.onchange, this.ligerui });
    else {
      result = String.format("<select ltype='select' id='%1$s' name='%2$s' class='%3$s' validate='%5$s' onchange='%6$s' ligerui='%7$s'>%4$s</select>", new Object[] { this.id, this.name, this.clazz, optTag.toString(), this.validate, this.onchange, this.ligerui });
    }

    return result;
  }

  private Boolean isSelect(Dict dict) {
    if (StringUtils.isEmpty(this.defaultvalue)) {
      if (StringUtils.equals("1", dict.getIsDefault())) {
        return Boolean.valueOf(true);
      }
    }
    else if (ArrayUtils.contains(this.defaultvalue.split(","), dict.getCode())) {
      return Boolean.valueOf(true);
    }

    return Boolean.valueOf(false);
  }

  public String getOnclick() {
    return this.onclick;
  }

  public void setOnclick(String onclick) {
    this.onclick = onclick;
  }

  public String getOnchange() {
    return this.onchange;
  }

  public void setOnchange(String onchange) {
    this.onchange = onchange;
  }

  public String getLigerui() {
    return this.ligerui;
  }

  public void setLigerui(String ligerui) {
    this.ligerui = ligerui;
  }
}