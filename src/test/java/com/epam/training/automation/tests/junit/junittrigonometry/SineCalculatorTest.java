package com.epam.training.automation.tests.junit.junittrigonometry;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SineCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Execution(ExecutionMode.CONCURRENT)
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSine")
  @DisplayName("Test of method Calculator.sin(double value)")
  void getSine(double value, double expectedSineResult) {
    assertEquals(expectedSineResult, calculator.sin(value), "For input parameters: " + value);
  }
}
