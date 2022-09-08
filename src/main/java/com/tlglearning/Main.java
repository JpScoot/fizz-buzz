package com.tlglearning;

import java.util.Set;

public class Main {

  public static void main(String[] args) {
    int i = 1;
    //for loop i iteration
    while (i <= 100) {
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.printf("%d: %s%n", i, value);
      i++;
    }
    while (i <= 100)
      ;
  }

}
