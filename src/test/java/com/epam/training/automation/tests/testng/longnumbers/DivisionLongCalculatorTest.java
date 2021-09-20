package com.epam.training.automation.tests.testng.longnumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionLongCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForDivision")
  public Object[][] testValuesForDivision() {
    return new Object[][] {{10, 2, 5}, {10, 100, 0}, {-50, -5, 10}, {1506, 13, 115}};
  }

  @Test(dataProvider = "testValuesForDivision")
  public void divideValues(long firstValue, long secondValue, long expectedDivisionResult) {
    long actualDivisionResult = calculator.div(firstValue, secondValue);
    assertEquals(
        actualDivisionResult, expectedDivisionResult, "Invalid result of divide operation");
  }

  @Test(expectedExceptions = ArithmeticException.class)
  public void divideByZero() {
    long randomLongValue = (long) getRandomLongNumber(-9223372036854775808L, 9223372036854775807L);
    calculator.div(randomLongValue, 0);
  }

  public static double getRandomLongNumber(double min, double max) {
    return (long) (Math.random() * ((max - min) + 1)) + min;
  }
}
