package com.epam.training.automation.tests.testng.trigonometry;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangentCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testDegreeValuesForCotangent")
  public Object[][] testDegreeValuesForForCotangent() {
    return new Object[][] {
      {0, Double.POSITIVE_INFINITY},
      {Math.PI, Double.NEGATIVE_INFINITY},
      {(Math.PI) / 6, 1.7320508075688772935274463415059},
      {(Math.PI) / 4, 1},
      {(Math.PI) / 3, 0.57735026918962576450914878050196},
      {(Math.PI) / 2, 0},
      {3 * (Math.PI) / 2, 0},
      {Double.NaN, Double.NaN},
      {Double.POSITIVE_INFINITY, Double.NaN},
      {Double.NEGATIVE_INFINITY, Double.NaN}
    };
  }

  @Test(
      dataProvider = "testDegreeValuesForCotangent",
      dependsOnGroups = {"tangent"})
  public void getCotangent(double value, double expectedCotangentResult) {
    double actualCotangentResult = calculator.ctg(value);
    assertEquals(
        actualCotangentResult,
        expectedCotangentResult,
        "Invalid result of calculating the cotangent");
  }
}
