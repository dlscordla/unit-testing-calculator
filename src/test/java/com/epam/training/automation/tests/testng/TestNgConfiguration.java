package com.epam.training.automation.tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNgConfiguration extends Assert {

  protected Calculator calculator;

  @BeforeClass(alwaysRun = true)
  public void setUp() {
    calculator = new Calculator();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    calculator = null;
  }
}
