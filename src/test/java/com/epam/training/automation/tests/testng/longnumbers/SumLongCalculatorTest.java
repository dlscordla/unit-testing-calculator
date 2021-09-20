package com.epam.training.automation.tests.testng.longnumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForSum")
  public Object[][] testValuesForSum() {
    return new Object[][] {
      {106, 1368, 1474},
      {1, -165, -164},
      {-1, 10, 9},
      {-724, -10, -734},
      {0, 0, 0},
      {Long.MIN_VALUE, Long.MAX_VALUE, -1},
      {0b1011010, 0b101111, 0b10001001},
      {02452, 066666666, 066671340},
      {0x7FFF, 0x85AB, 0x105AA},
    };
  }

  @Test(dataProvider = "testValuesForSum")
  public void sumValues(long firstValue, long secondValue, long expectedSumResult) {
    long actualSumResult = calculator.sum(firstValue, secondValue);
    assertEquals(actualSumResult, expectedSumResult, "Invalid result of sum operation");
  }
}
