package io.github.dumijdev.fakerao.utils;

import io.github.dumijdev.fakerao.models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonUtilsTests {

  private int seed1;
  private int seed2;

  @BeforeEach
  void initialize() {
    seed1 = PersonUtils.generateSeedFromPersonName("Diboba");
    seed2 = PersonUtils.generateSeedFromPersonName("Diboba0");
  }

  @Test
  public void shouldReturnsSameSeedForSameName_ExpectedTrue() {
    int seed1 = PersonUtils.generateSeedFromPersonName("Diboba");
    int seed2 = PersonUtils.generateSeedFromPersonName("Diboba");

    assertEquals(seed1, seed2);
  }

  @Test
  public void shouldReturnsDifferentSeedForDifferentName_ExpectedFalse() {
    assertNotEquals(seed1, seed2);
  }

  @Test
  public void shouldReturnsSameNameForSameSeed_ExpectedTrue() {
    String name1 = PersonUtils.fakeName(seed1);
    String name2 = PersonUtils.fakeName(seed1);

    assertEquals(name1, name2);
  }

  @Test
  public void shouldReturnsDifferentNameForDifferentSeed_ExpectedTrue() {
    String name1 = PersonUtils.fakeName(seed2);
    String name2 = PersonUtils.fakeName(seed1);

    assertNotEquals(name1, name2);
  }

  @Test
  public void shouldReturnsSamePersonForSameSeed_ExpectedTrue() {
    Person person1 = PersonUtils.generate(seed1);
    Person person2 = PersonUtils.generate(seed1);

    assertEquals(person1, person2);
  }

  @Test
  public void shouldReturnsDifferentPersonForDifferentSeed_ExpectedTrue() {
    Person person1 = PersonUtils.generate(seed2);
    Person person2 = PersonUtils.generate(seed1);

    assertNotEquals(person1, person2);
  }

  @Test
  public void shouldReturnsDifferentPerson_ExpectedTrue() {
    Person person1 = PersonUtils.generate();
    Person person2 = PersonUtils.generate();

    assertNotEquals(person1, person2);
  }

}
