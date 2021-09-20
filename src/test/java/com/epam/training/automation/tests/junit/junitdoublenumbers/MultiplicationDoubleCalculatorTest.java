package com.epam.training.automation.tests.junit.junitdoublenumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationDoubleCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Execution(ExecutionMode.CONCURRENT)
  @MethodSource(
      "com.epam.training.automation.tests.junit.Providers#testGetMultiplicationDoubleNumbers")
  @DisplayName("Test of method Calculator.mult(double firstValue, double secondValue)")
  void multiplyDoubleValues(double firstValue, double secondValue, double expectedMultiplyDouble) {
    assertEquals(
        expectedMultiplyDouble,
        calculator.mult(firstValue, secondValue),
        "For input parameters: " + firstValue + " " + secondValue);
  }
}
