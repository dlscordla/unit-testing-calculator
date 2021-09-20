package com.epam.training.automation.tests.testng.longnumbers;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativityOfNumberCalculatorTest extends TestNgConfiguration {

  @Test(groups = {"smoke"})
  @Parameters({"valueIsTrulyNegative"})
  public void isValueTrulyNegative(long valueIsNegative) {
    assertTrue(
        calculator.isNegative(valueIsNegative),
        "Invalid result of checking if the number is negative");
  }

  @Test(dependsOnGroups = "smoke")
  @Parameters({"valueIsTrulyPositive"})
  public void isValueTrulyPositive(long valueIsPositive) {
    assertFalse(
        calculator.isNegative(valueIsPositive),
        "Invalid result of checking if the number is negative");
  }

  @Test(dependsOnGroups = "smoke")
  @Parameters({"valueIsZero"})
  public void isValueZero(long valueIsZero) {
    assertFalse(
        calculator.isNegative(valueIsZero), "Invalid result of checking if the number is negative");
  }
}
