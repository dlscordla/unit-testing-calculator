package com.epam.training.automation.tests.testng.doublenumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationDoubleCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForMultiplication")
  public Object[][] testValuesForMultiplication() {
    return new Object[][] {
      {18, 17.568, 316.224},
      {10.0012, 56.18, 561.867416},
      {-12.0, -16.0, 192},
      {0, 0.000, 0.0000000},
      {10E10, 584E-14, 0.584},
      {Double.MIN_VALUE, 1, Double.MIN_VALUE},
      {-Double.MAX_VALUE, -1, Double.MAX_VALUE},
      {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
      {Double.POSITIVE_INFINITY, 0, Double.NaN},
      {Double.NEGATIVE_INFINITY, -1, Double.POSITIVE_INFINITY},
    };
  }

  @Test(dataProvider = "testValuesForMultiplication")
  public void multiplyValues(
      double firstValue, double secondValue, double expectedMultiplicationResult) {
    double actualMultiplicationResult = calculator.mult(firstValue, secondValue);
    assertEquals(
        actualMultiplicationResult,
        expectedMultiplicationResult,
        "Invalid result of multiplication operation");
  }
}
