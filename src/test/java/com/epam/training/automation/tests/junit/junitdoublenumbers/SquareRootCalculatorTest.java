package com.epam.training.automation.tests.junit.junitdoublenumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareRootCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Execution(ExecutionMode.CONCURRENT)
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSquareRootDoubleNumbers")
  @DisplayName("Test of method Calculator.sqrt(double value)")
  void extractSquareRoot(double value, double expectedSquareRoot) {
    assertEquals(expectedSquareRoot, calculator.sqrt(value), "For input parameters: " + value);
  }
}
