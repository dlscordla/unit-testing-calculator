package com.epam.training.automation.tests.junit.junitlongnumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionLongCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSubtractionLongNumbers")
  @DisplayName("Test of method Calculator.sub(long firstValue, long secondValue)")
  void subtractLongValues(long firstValue, long secondValue, long expectedSubtractLong) {
    assertEquals(
        expectedSubtractLong,
        calculator.sub(firstValue, secondValue),
        "For input parameters: " + firstValue + " " + secondValue);
  }
}
