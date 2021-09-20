package com.epam.training.automation.tests.junit.junitlongnumbers;

import com.epam.training.automation.tests.junit.JunitConfiguration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NegativityLongCalculatorTest extends JunitConfiguration {

  @ParameterizedTest
  @Tag("smoke")
  @Tag("cpt")
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSignNegative")
  @DisplayName("Test of method Calculator.isNegative(double valueNegative)")
  void isNegativeTrueTest(long value) {
    assertTrue(calculator.isNegative(value), "This value is either positive or zero.");
  }

  @ParameterizedTest
  @Tag("cpt")
  @MethodSource("com.epam.training.automation.tests.junit.Providers#testGetSignPositive")
  @DisplayName("Test of method Calculator.isNegative(double valuePositive)")
  void isNegativeFalseTest(long value) {
    assertFalse(calculator.isNegative(value), "This value is not positive.");
  }

  @Test
  @Tag("cpt")
  @DisplayName("Test of method Calculator.isNegative(0)")
  void isNegativeForZeroTest() {
    assertFalse(calculator.isNegative(0));
  }
}
