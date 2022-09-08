package com.tlglearning;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {
  //enuminated values
  FIZZ, BUZZ;

  //Set of FizzBuzz
  public static Set<FizzBuzz> valueOf(int num) {
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
    if (num % 3 == 0) {
      result.add(FIZZ);
    }
    if (num % 5 == 0){
      result.add(BUZZ);
    }
    return result;
  }

}
