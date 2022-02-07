package com.company;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {

  public static String getText(String url) throws IOException {
    Document doc = Jsoup.connect(url).get();
    return doc.body().text();
  }
}
