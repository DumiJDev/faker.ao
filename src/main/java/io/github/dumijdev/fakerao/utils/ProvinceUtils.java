package io.github.dumijdev.fakerao.utils;

import io.github.dumijdev.fakerao.models.Province;

public class ProvinceUtils {
  public static Province randomize() {
    return randomize((int) System.currentTimeMillis());
  }

  public static Province randomize(int seed) {
    switch (Math.abs(seed) % 18) {
      case 1:
        return Province.BIE;
      case 2:
        return Province.BENGUELA;
      case 3:
        return Province.CUNENE;
      case 4:
        return Province.CABINDA;
      case 5:
        return Province.LUNDA_NORTE;
      case 6:
        return Province.LUNDA_SUL;
      case 7:
        return Province.CUANDO_CUBANGO;
      case 8:
        return Province.CUANZA_NORTE;
      case 9:
        return Province.CUANZA_SUL;
      case 10:
        return Province.HUAMBO;
      case 11:
        return Province.HUILA;
      case 12:
        return Province.MALANJE;
      case 13:
        return Province.MOXICO;
      case 14:
        return Province.NAMIBE;
      case 15:
        return Province.UIGE;
      case 16:
        return Province.ZAIRE;
      case 17:
        return Province.BENGO;
      default:
        return Province.LUANDA;
    }
  }
}
