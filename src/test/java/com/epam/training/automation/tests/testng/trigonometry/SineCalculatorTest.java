package com.epam.training.automation.tests.testng.trigonometry;

import com.epam.training.automation.tests.testng.TestNgConfiguration;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SineCalculatorTest extends TestNgConfiguration {

  @DataProvider(name = "testDegreeValuesForSine")
  public Object[][] testDegreeValuesForSine() {
    return new Object[][] {
      {0, 0}, // 0 degrees
      {(Math.PI) / 6, 0.5}, // 30 degrees
      {(Math.PI) / 4, 0.7071067811865475}, // 45 degrees
      {(Math.PI) / 3, 0.8660254037844386}, // 60 degrees
      {(Math.PI) / 2, 1}, // 90 degrees
      {Math.PI, 0}, // 180 degrees
      {3 * (Math.PI) / 2, -1}, // 270 degrees
      {58 * (Math.PI) / 180, 0.8480480961564260}, // 58 degrees
      {Double.NaN, Double.NaN},
      {Double.POSITIVE_INFINITY, Double.NaN},
      {Double.NEGATIVE_INFINITY, Double.NaN}
    };
  }

  @Test(dataProvider = "testDegreeValuesForSine", groups = "sineCosine")
  public void getSine(double value, double expectedSinResult) {
    double actualSinResult = calculator.sin(value);
    assertEquals(actualSinResult, expectedSinResult, "Invalid result of calculating the sine");
  }
}
