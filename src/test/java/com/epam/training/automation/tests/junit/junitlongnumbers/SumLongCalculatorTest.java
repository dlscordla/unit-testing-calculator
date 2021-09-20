package com.epam.training.automation.tests.junit.junitlongnumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumLongCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSumLongNumbers")
  @DisplayName("Test of method Calculator.sum(long firstValue, long secondValue)")
  void sumLongValues(long firstValue, long secondValue, long expectedSumLong) {
    assertEquals(
        expectedSumLong,
        calculator.sum(firstValue, secondValue),
        "For input parameters: " + firstValue + " " + secondValue);
  }
}
