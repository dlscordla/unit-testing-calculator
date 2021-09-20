package com.epam.training.automation.tests.testng.longnumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PositivityOfNumberCalculatorTest extends TestNgConfiguration {

  @Test(groups = {"smoke"})
  @Parameters({"valueIsTrulyPositive"})
  public void isValueTrulyPositive(long valueIsPositive) {
    assertTrue(
        calculator.isPositive(valueIsPositive),
        "Invalid result of checking if the number is positive");
  }

  @Test(dependsOnGroups = "smoke")
  @Parameters({"valueIsZero"})
  public void isValueZero(long valueIsZero) {
    assertFalse(
        calculator.isPositive(valueIsZero), "Invalid result of checking if the number is positive");
  }

  @Test(dependsOnGroups = "smoke")
  @Parameters({"valueIsTrulyNegative"})
  public void isValueTrulyNegative(long valueIsNegative) {
    assertFalse(
        calculator.isPositive(valueIsNegative),
        "Invalid result of checking if the number is positive");
  }
}
