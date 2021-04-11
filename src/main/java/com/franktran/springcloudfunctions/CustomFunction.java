package com.franktran.springcloudfunctions;

import java.util.function.Function;

public class CustomFunction implements Function<String, String> {

  @Override
  public String apply(String s) {
    return s.toLowerCase();
  }
}
