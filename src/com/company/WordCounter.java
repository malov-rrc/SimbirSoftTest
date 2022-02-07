package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

  public static Map<String, Integer> counter(List<String> splittedText) {
    Map<String, Integer> counter = new HashMap();
    for (String num : splittedText) {
      int newValue = counter.getOrDefault(num, 0) + 1;
      counter.put(num, newValue);
    }
    return counter;
  }
}