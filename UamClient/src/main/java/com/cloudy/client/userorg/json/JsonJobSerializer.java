package com.cloudy.client.userorg.json;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cloudy.common.utils.SpringUtils;
import com.cloudy.uam.userorg.remote.UamUserOrgService;
import com.cloudy.uam.userorg.remote.vo.Job;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonJobSerializer extends JsonSerializer<String>
{
  private Logger logger;
  private JsonJob anno;

  public JsonJobSerializer()
  {
    this.logger = LoggerFactory.getLogger(super.getClass());
  }

  public void serialize(String value, JsonGenerator jgen, SerializerProvider provider)
    throws IOException, JsonProcessingException
  {
    Job job = getUamUserOrgService().getJobById(value);

    if (job == null) {
      jgen.writeString(value);
    }
    else if (!this.anno.expand()) {
      jgen.writeString(job.getJobName());
    } else {
      jgen.writeStartObject();
      jgen.writeStringField("id", job.getId());
      jgen.writeStringField("jobCode", job.getJobCode());
      jgen.writeStringField("jobName", job.getJobName());
      jgen.writeEndObject();
    }
  }

  private UamUserOrgService getUamUserOrgService()
  {
    return (UamUserOrgService)SpringUtils.getBean(UamUserOrgService.class);
  }

  public void setAnno(JsonJob anno) {
    this.anno = anno;
  }
}