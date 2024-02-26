package org.lesson1;

import org.lesson1.calculate.Calculate;
import org.lesson1.calculate.OutputOfResults;

public class Program {

  public static void main(String[] args) {
    OutputOfResults.writer(Calculate.add(4, 10));
    OutputOfResults.writer(Calculate.sub(4, 10));
    OutputOfResults.writer(Calculate.mul(4, 10));
    OutputOfResults.writer(Calculate.div(4, 10));
  }
}