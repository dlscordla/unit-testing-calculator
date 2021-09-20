package com.epam.training.automation.tests.testng.doublenumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionDoubleCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForSubtract")
  public Object[][] testValuesForSubtract() {
    return new Object[][] {
      {-0.0, 0.0, 0},
      {0, 599.99, -599.99},
      {-98.9595834893, 117E-4, -989712834893E-10},
      {-Double.MAX_VALUE, -Double.MAX_VALUE, 0},
      {-Double.MIN_VALUE, -Double.MIN_VALUE, 0},
      {0.0000, -0.00000000049E-314, Double.MIN_VALUE},
      {0, -17976931348623157E292, Double.MAX_VALUE},
      {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN},
      {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY}
    };
  }

  @Test(dataProvider = "testValuesForSubtract")
  public void subtractValues(
      double firstValue, double secondValue, double expectedSubtractResult) {
    double actualSubtractResult = calculator.sub(firstValue, secondValue);
    assertEquals(
        actualSubtractResult, expectedSubtractResult, "Invalid result of subtraction operation");
  }
}
