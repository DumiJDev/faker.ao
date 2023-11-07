package io.github.dumijdev.fakerao.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private String name;
  private int age;
  private Province naturality;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;

    Person person = (Person) o;

    if (age != person.age) return false;
    if (!name.equals(person.name)) return false;
    return naturality.equals(person.naturality);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age;
    result = 31 * result + naturality.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
