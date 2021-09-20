package com.epam.training.automation.tests.junit.junitlongnumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PositivityLongCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Tag("smoke")
  @Tag("cpt")
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSignPositive")
  @DisplayName("Test of method Calculator.isPositive(double valuePositive)")
  void isPositiveTrueTest(long value) {
    assertTrue(calculator.isPositive(value), "This value is either negative or zero.");
  }

  @ParameterizedTest
  @Tag("cpt")
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSignNegative")
  @DisplayName("Test of method Calculator.isPositive(double valueNegative)")
  void isPositiveFalseTest(long value) {
    assertFalse(calculator.isPositive(value), "This value is not negative.");
  }

  @Test
  @Tag("cpt")
  @DisplayName("Test of method Calculator.isPositive(0)")
  void isPositiveForZeroTest() {
    assertFalse(calculator.isPositive(0));
  }
}
