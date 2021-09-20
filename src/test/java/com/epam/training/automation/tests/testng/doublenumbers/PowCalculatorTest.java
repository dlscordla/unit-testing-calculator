package com.epam.training.automation.tests.testng.doublenumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "valuesForPowerTest")
  public Object[][] testValuesForRaisingToPower() {
    return new Object[][] {
      {18.08E-5, 2, 3.268864E-8},
      {8, 5.087, 3.9266190011250072484810212793677E4},
      {45.78, 26.19, 3.1124250110044480578498660819491E43},
      {-5.46, 0, 1},
      {-56.0909, 1, -56.0909},
      {0, 127E109, 0},
      {0, 0, 1},
      {0, -2.568, Double.POSITIVE_INFINITY},
      {Double.MAX_VALUE, Double.MIN_VALUE, 1},
      {Double.MIN_VALUE, Double.MAX_VALUE, 0},
      {Double.POSITIVE_INFINITY, -1, 0},
    };
  }

  @Test(dataProvider = "valuesForPowerTest")
  public void raiseNumberToPower(double firstValue, double secondValue, double expectedPowResult) {
    double actualPowResult = calculator.pow(firstValue, secondValue);
    assertEquals(
        actualPowResult, expectedPowResult, "Invalid result of raising to power operation");
  }
}
