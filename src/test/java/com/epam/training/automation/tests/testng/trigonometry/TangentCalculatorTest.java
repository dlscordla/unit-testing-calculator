package com.epam.training.automation.tests.testng.trigonometry;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testDegreeValuesForTangent")
  public Object[][] testDegreeValuesForTangent() {
    return new Object[][] {
      {0, 0},
      {-0, -0},
      {Math.PI, 0},
      {(Math.PI) / 6, 0.57735026918962576450914878050196},
      {(Math.PI) / 4, 1},
      {(Math.PI) / 3, 1.7320508075688772935274463415059},
      {(Math.PI) / 2, Double.POSITIVE_INFINITY},
      {3 * (Math.PI) / 2, Double.NEGATIVE_INFINITY},
      {Double.NaN, Double.NaN},
      {Double.POSITIVE_INFINITY, Double.NaN},
      {Double.NEGATIVE_INFINITY, Double.NaN}
    };
  }

  @Test(
      dataProvider = "testDegreeValuesForTangent",
      groups = {"tangent"},
      dependsOnGroups = {"sineCosine"})
  public void getTangent(double value, double expectedTanResult) {
    double actualTanResult = calculator.tg(value);
    assertEquals(actualTanResult, expectedTanResult, "Invalid result of calculating the tangent");
  }
}
