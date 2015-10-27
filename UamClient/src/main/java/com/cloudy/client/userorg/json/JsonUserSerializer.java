package com.cloudy.client.userorg.json;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudy.common.utils.SpringUtils;
import com.cloudy.uam.userorg.remote.UamUserOrgService;
import com.cloudy.uam.userorg.remote.vo.User;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonUserSerializer extends JsonSerializer<String>
{
  private Logger logger;
  private JsonUser anno;

  public JsonUserSerializer()
  {
    this.logger = LoggerFactory.getLogger(super.getClass());
  }

  public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
    throws IOException, JsonProcessingException
  {
    User user = getUamUserOrgService().getUserById(value);

    if (user == null) {
      jgen.writeString(value);
    }
    else if (!this.anno.expand()) {
      jgen.writeString(user.getRealName());
    } else {
      jgen.writeStartObject();
      jgen.writeStringField("id", user.getId());
      jgen.writeStringField("userame", user.getUsername());
      jgen.writeStringField("realName", user.getRealName());
      jgen.writeEndObject();
    }
  }

  private UamUserOrgService getUamUserOrgService()
  {
    return (UamUserOrgService)SpringUtils.getBean(UamUserOrgService.class);
  }

  public void setAnno(JsonUser anno) {
    this.anno = anno;
  }
}