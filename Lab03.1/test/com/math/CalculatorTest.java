/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void add() {
    System.out.println("Testing Add method");
    Calculator calc = new Calculator();
    assertEquals(5, calc.add(1, 4));  // expected, actual
    assertEquals(12, calc.add(4, 8));
  }

  @Test
  public void divide() {
    System.out.println("Testing Divide method");
    Calculator calc = new Calculator();
    assertEquals(2.5, calc.divide(5, 2), 0.00000001);
    assertEquals(10, calc.divide(20, 2), 0.00000001);
  }

  @Test
  public void isEven() {
    System.out.println("Testing Even method");
    Calculator calc = new Calculator();
    assertEquals(true, calc.isEven(8));
  }
}