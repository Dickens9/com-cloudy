package com.cloudy.client.template.engine;

import java.util.Map;

public abstract interface VariableEvaluator
{
  public abstract Map<String, Object> eval(String paramString, Map<String, Object> paramMap);
}