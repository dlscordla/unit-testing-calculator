package com.epam.training.automation.tests.junit.junitdoublenumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Execution(ExecutionMode.CONCURRENT)
  @MethodSource(
      "com.epam.training.automation.tests.junit.Providers#testGetRaisedToPowerDoubleNumbers")
  @DisplayName("Test of method Calculator.pow(double firstValue, double secondValue)")
  void raiseToPower(double firstValue, double secondValue, double expectedPower) {
    assertEquals(
        expectedPower,
        calculator.pow(firstValue, secondValue),
        "For input parameters: " + firstValue + " " + secondValue);
  }
}
