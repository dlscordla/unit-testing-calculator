package com.epam.training.automation.tests.junit.junittrigonometry;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CotangentCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Execution(ExecutionMode.CONCURRENT)
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetCotangent")
  @DisplayName("Test of method Calculator.ctg(double value)")
  void getCotangent(double value, double expectedCotangentResult) {
    assertEquals(expectedCotangentResult, calculator.ctg(value), "For input parameters: " + value);
  }
}
