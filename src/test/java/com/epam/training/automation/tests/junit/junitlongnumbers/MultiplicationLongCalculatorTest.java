package com.epam.training.automation.tests.junit.junitlongnumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationLongCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @MethodSource(
      "com.epam.training.automation.tests.junit.Providers#testGetMultiplicationLongNumbers")
  @DisplayName("Test of method Calculator.mult(long firstValue, long secondValue)")
  void multiplyLongValues(long firstValue, long secondValue, long expectedMultiplyLong) {
    assertEquals(
        expectedMultiplyLong,
        calculator.mult(firstValue, secondValue),
        "For input parameters: " + firstValue + " " + secondValue);
  }
}
