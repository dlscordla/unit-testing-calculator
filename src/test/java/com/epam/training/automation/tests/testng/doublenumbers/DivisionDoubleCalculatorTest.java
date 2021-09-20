package com.epam.training.automation.tests.testng.doublenumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionDoubleCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForDivision")
  public Object[][] testValuesForDivision() {
    return new Object[][] {
      {10.14, 2.496, 4.0625},
      {-10, 100, -0.1},
      {35.895486702028571E192, 0, Double.POSITIVE_INFINITY},
      {-1E-40, 0, Double.NEGATIVE_INFINITY},
      {0, -0, Double.NaN},
      {5, Double.POSITIVE_INFINITY, 0},
      {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN},
    };
  }

  @Test(dataProvider = "testValuesForDivision")
  public void divideValues(double firstValue, double secondValue, double expectedDivisionResult) {
    double actualDivisionResult = calculator.div(firstValue, secondValue);
    assertEquals(
        actualDivisionResult, expectedDivisionResult, "Invalid result of divide operation");
  }
}
