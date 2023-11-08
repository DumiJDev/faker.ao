package io.github.dumijdev.fakerao.utils;

import io.github.dumijdev.fakerao.models.Province;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProvinceUtilsTests {

  @Test
  public void shouldReturnsSameProvinceFromSameSeed() {
    Province province1 = ProvinceUtils.randomize(5);
    Province province2 = ProvinceUtils.randomize(5);

    Assertions.assertEquals(province1, province2);
  }

  @Test
  public void shouldReturnsDifferentProvinceFromDifferentSeed() {
    Province province1 = ProvinceUtils.randomize(5);
    Province province2 = ProvinceUtils.randomize(7);

    assertNotEquals(province1, province2);
  }

  @Test
  public void shouldReturnsDifferentProvince() {
    Province province1 = ProvinceUtils.randomize();
    Province province2 = ProvinceUtils.randomize(1);

    System.out.println(province1);

    System.out.println(province2);

    assertNotEquals(province1, province2);
  }
}
