package com.epam.training.automation.tests.testng.longnumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationLongCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testValuesForMultiplication")
  public Object[][] testValuesForMultiplication() {
    return new Object[][] {
      {9, 7, 63},
      {10, -165, -1650},
      {-167, 48, -8016},
      {-0, 0, -0},
      {-72, -13, 936},
      {Long.MIN_VALUE, 0, 0},
      {Long.MAX_VALUE, 0, 0},
      {Long.MIN_VALUE, 1, Long.MIN_VALUE},
      {Long.MAX_VALUE, -1, Long.MIN_VALUE + 1},
      {
        0b101010101001010101000101010010101L,
        -0b010100110,
        -0b1101110100111001100101011101110010011110L
      },
      {05, 503, 04723},
      {-0xFFFFF, 0x10BD, -0x10BCFEF43L},
    };
  }

  @Test(dataProvider = "testValuesForMultiplication")
  public void multiplyValues(long firstValue, long secondValue, long expectedMultiplicationResult) {
    long actualMultiplicationResult = calculator.mult(firstValue, secondValue);
    assertEquals(
        actualMultiplicationResult,
        expectedMultiplicationResult,
        "Invalid result of multiplication operation");
  }
}
