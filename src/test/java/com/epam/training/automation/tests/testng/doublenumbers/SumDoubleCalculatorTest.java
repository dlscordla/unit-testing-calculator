package com.epam.training.automation.tests.testng.doublenumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForSum")
  public Object[][] testValuesForSum() {
    return new Object[][] {
      {1.0398, 35.66668547382, 36.70648547382},
      {-0.0, 0, -0.0},
      {599.99, 0, 599.99},
      {-Double.MAX_VALUE, Double.MAX_VALUE, 0},
      {-Double.MIN_VALUE, Double.MIN_VALUE, 0},
      {-5.983E3, 78E10, 779999994017d},
      {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
      {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN},
    };
  }

  @Test(dataProvider = "testValuesForSum")
  public void sumValues(double firstValue, double secondValue, double expectedSumResult) {
    double actualSumResult = calculator.sum(firstValue, secondValue);
    assertEquals(actualSumResult, expectedSumResult, "Invalid result of sum operation");
  }
}
