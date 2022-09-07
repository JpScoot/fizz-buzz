package com.tlglearning;

public class Main {

  public static void main(String[] args) {
    //for loop i iteration
    for (int i = 1; i <= 100; i++) {
      //invoke static method
      System.out.println(FizzBuzz.valueOf(i));
    }
  }

}
