package com.company;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите адрес сайта:");
    //ввод адреса сайта
    String url = scanner.next();

    //Извлечение HTML кода сайта
    String siteText = Parser.getText(url);

    //Разделение получившейся строки в массив слов
    List<String> splittedText = Splitter.split(siteText);

    //Подсчёт уникальных слов, сортировка и вывод статистики
    System.out.println("Количество уникальных слов:");
    Map<String, Integer> counter = WordCounter.counter(splittedText);
    counter.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);
    System.out.println("Общее количество слов: " + splittedText.size());
  }
}
