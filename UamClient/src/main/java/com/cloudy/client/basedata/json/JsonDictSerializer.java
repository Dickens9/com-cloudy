package com.cloudy.client.basedata.json;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudy.common.utils.SpringUtils;
import com.cloudy.uam.basedata.remote.UamBasedataService;
import com.cloudy.uam.basedata.remote.vo.Dict;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDictSerializer extends JsonSerializer<String>
{
  private Logger logger = LoggerFactory.getLogger(super.getClass());
  private JsonDict anno;
  private static int count = 0;

  public JsonDictSerializer() {
  }

  public JsonDictSerializer(JsonDict anno) {
    this.anno = anno;
    count += 1;
  }

  public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
    throws IOException, JsonProcessingException
  {
    Dict dict = getUamBasedataService().findDictByTypeAndCode(this.anno.value(), value);

    if (dict == null) {
      jgen.writeString(value);
    }
    else if (!this.anno.expand()) {
      jgen.writeString(dict.getName());
    } else {
      jgen.writeStartObject();
      jgen.writeStringField("code", value);
      jgen.writeStringField("name", dict.getName());
      jgen.writeEndObject();
    }
  }

  private UamBasedataService getUamBasedataService()
  {
    return (UamBasedataService)SpringUtils.getBean("uamBasedataServiceClient");
  }

  public void setAnno(JsonDict anno) {
    this.anno = anno;
  }
}
