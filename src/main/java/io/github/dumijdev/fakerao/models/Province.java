package io.github.dumijdev.fakerao.models;

import lombok.Getter;

@Getter
public class Province {

  private final String name;
  private final String code;
  private final String capital;

  public final static Province BIE = new Province("Bié", "BIE", "Kuito");
  public final static Province BENGUELA = new Province("Benguela", "BGU", "Benguela");
  public final static Province CABINDA = new Province("Cabinda", "CAB", "Cabinda");
  public final static Province CUANDO_CUBANGO = new Province("Cuando Cubango", "CCU", "Menongue");
  public final static Province CUANZA_NORTE = new Province("Cuanza Norte", "CNO", "N'dalatando");
  public final static Province CUANZA_SUL = new Province("Cuanza Sul", "CSU", "Sumbe");
  public final static Province CUNENE = new Province("Cunene", "CNN", "Ondjiva");
  public final static Province HUAMBO = new Province("Huambo", "HUI", "Huambo");
  public final static Province HUILA = new Province("Huíla", "HUL", "Lubango");
  public final static Province LUANDA = new Province("Luanda", "LUA", "Luanda");
  public final static Province LUNDA_NORTE = new Province("Lunda Norte", "LNO", "Saurimo");
  public final static Province LUNDA_SUL = new Province("Lunda Sul", "LSU", "Saurimo");
  public final static Province MALANJE = new Province("Malanje", "MAL", "Malanje");
  public final static Province MOXICO = new Province("Moxico", "MOX", "Luena");
  public final static Province NAMIBE = new Province("Namibe", "NAM", "Namibe");
  public final static Province UIGE = new Province("Uíge", "UIG", "Uíge");
  public final static Province ZAIRE = new Province("Zaire", "ZAI", "Mbanza Congo");
  public static final Province BENGO = new Province("Bengo", "BGO", "Caxito");

  private Province(String name, String code, String capital) {
    this.name = name;
    this.code = code;
    this.capital = capital;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Province)) return false;

    Province province = (Province) o;

    if (!name.equals(province.name)) return false;
    if (!code.equals(province.code)) return false;
    return capital.equals(province.capital);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + code.hashCode();
    result = 31 * result + capital.hashCode();
    return result;
  }
}
