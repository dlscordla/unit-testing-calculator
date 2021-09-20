package com.epam.training.automation.tests.testng.doublenumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareRootCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "valuesForSqrtTest")
  public Object[][] testValuesForExtractingSquareRoot() {
    return new Object[][] {
      {16, 4},
      {5.965, 2.4423349483639626287384090621631},
      {0, 0},
      {-1, Double.NaN},
      {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY},
      {Double.NEGATIVE_INFINITY, Double.NaN}
    };
  }

  @Test(dataProvider = "valuesForSqrtTest")
  public void extractSquareRoot(double value, double expectedSqrtResult) {
    double actualSqrtResult = calculator.sqrt(value);
    assertEquals(
        actualSqrtResult, expectedSqrtResult, "Invalid result of extracting the square root");
  }
}
