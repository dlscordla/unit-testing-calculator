package com.epam.training.automation.tests.junit.junittrigonometry;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CosineCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Execution(ExecutionMode.CONCURRENT)
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetCosine")
  @DisplayName("Test of method Calculator.cos(double value)")
  void getCosine(double value, double expectedCosineResult) {
    assertEquals(expectedCosineResult, calculator.cos(value), "For input parameters: " + value);
  }
}
