package com.epam.training.automation.tests.testng.longnumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionLongCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForSubtract")
  public Object[][] testValuesForSubtract() {
    return new Object[][] {
      {1460, 60, 1400},
      {17, -88, 105},
      {-24, 589, -613},
      {-250, -260, 10},
      {0, 0, 0},
      {Long.MIN_VALUE, Long.MIN_VALUE, 0},
      {Long.MAX_VALUE, Long.MAX_VALUE, 0},
      {0b11110100001, 0b0101000001, 1632},
      {-3511, -04545210, 04536321},
      {0xABC, -0x1982, 0x243E},
    };
  }

  @Test(dataProvider = "testValuesForSubtract")
  public void subtractValues(long firstValue, long secondValue, long expectedSubtractResult) {
    long actualSubtractResult = calculator.sub(firstValue, secondValue);
    assertEquals(
        actualSubtractResult, expectedSubtractResult, "Invalid result of subtraction operation");
  }
}
