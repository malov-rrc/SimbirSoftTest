package com.company;

import java.util.ArrayList;
import java.util.List;

public class Splitter {

  public static List<String> split(String StringToSplit) {     //Разделение строки в массив слов
    String[] words = StringToSplit.toLowerCase().split(splitRegex());
    var editedWords = new ArrayList<String>();
    for(String word:words){
      if (!word.equals("") && word.length() > 1) {
        editedWords.add(word);
      }
    }
    return editedWords;
  }

  private static String splitRegex() {     //Формирование регулярного выражения из массива символов
    StringBuilder builder = new StringBuilder();
    String[] charsToSplit = {" ","\\,","\\.","\\!", "\\?", "\"","\\;","\\:","\\[","\\]","\\(","\\)","\n","\r","\t","\\»","\\«","\\'","\\-","\\‑","\\/","[0-9]"};       //массив символов
      for (String stuff : charsToSplit) {
          builder.append(stuff).append("|");
      }
    builder.setLength(builder.length() - 1);
    return builder.toString();
  }
}
