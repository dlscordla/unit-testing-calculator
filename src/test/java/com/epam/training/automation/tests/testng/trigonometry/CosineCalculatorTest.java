package com.epam.training.automation.tests.testng.trigonometry;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testDegreeValuesForCosine")
  public Object[][] testDegreeValuesForCosine() {
    return new Object[][] {
      {0, 1},
      {(Math.PI) / 6, 0.8660254037844386},
      {(Math.PI) / 4, 0.7071067811865475},
      {(Math.PI) / 3, 0.5},
      {(Math.PI) / 2, 0},
      {Math.PI, -1},
      {Double.NaN, Double.NaN},
      {Double.POSITIVE_INFINITY, Double.NaN},
      {Double.NEGATIVE_INFINITY, Double.NaN}
    };
  }

  @Test(dataProvider = "testDegreeValuesForCosine", groups = "sineCosine")
  public void getCosine(double value, double expectedCosResult) {
    double actualCosResult = calculator.cos(value);
    assertEquals(actualCosResult, expectedCosResult, "Invalid result of calculating the cosine");
  }
}
