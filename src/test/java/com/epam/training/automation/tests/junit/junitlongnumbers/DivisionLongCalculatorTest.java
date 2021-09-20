package com.epam.training.automation.tests.junit.junitlongnumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionLongCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetDivisionLongNumbers")
  @DisplayName("Test of method Calculator.div(long firstValue, long secondValue)")
  void divideLongValues(long firstValue, long secondValue, long expectedDivideLong) {
    assertEquals(
        expectedDivideLong,
        calculator.div(firstValue, secondValue),
        "For input parameters: " + firstValue + " " + secondValue);
  }

  @Test
  @DisplayName("Test of method Test Calculator.div(long firstValue, 0)")
  void divideByZeroLongNumbers() {
    long randomLongValue = (long) testDivideByZero(Long.MIN_VALUE, Long.MAX_VALUE);
    assertThrows(
        ArithmeticException.class,
        () -> calculator.div(randomLongValue, 0),
        "Invalid type of exception!");
  }

  double testDivideByZero(double min, double max) {
    return (Math.random() * ((max - min) + 1)) + min;
  }
}
