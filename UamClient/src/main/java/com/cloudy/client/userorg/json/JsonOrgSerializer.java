package com.cloudy.client.userorg.json;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudy.common.utils.SpringUtils;
import com.cloudy.uam.userorg.remote.UamUserOrgService;
import com.cloudy.uam.userorg.remote.vo.Org;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonOrgSerializer extends JsonSerializer<String>
{
  private Logger logger;
  private JsonOrg anno;

  public JsonOrgSerializer()
  {
    this.logger = LoggerFactory.getLogger(super.getClass());
  }

  public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
    throws IOException, JsonProcessingException
  {
    Org org = getUamUserOrgService().getOrgById(value);

    if (org == null) {
      jgen.writeString(value);
    }
    else if (!this.anno.expand()) {
      jgen.writeString(org.getOrgName());
    } else {
      jgen.writeStartObject();
      jgen.writeStringField("id", org.getId());
      jgen.writeStringField("orgCode", org.getOrgCode());
      jgen.writeStringField("orgName", org.getOrgName());
      jgen.writeEndObject();
    }
  }

  private UamUserOrgService getUamUserOrgService()
  {
    return (UamUserOrgService)SpringUtils.getBean(UamUserOrgService.class);
  }

  public void setAnno(JsonOrg anno) {
    this.anno = anno;
  }
}