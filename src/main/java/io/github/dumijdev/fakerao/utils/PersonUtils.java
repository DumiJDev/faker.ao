package io.github.dumijdev.fakerao.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.dumijdev.fakerao.models.Person;

import java.io.InputStream;
import java.util.List;
import java.util.Random;

public class PersonUtils {

  private static String location = "/data/names.json";

  public static void setLocation(String location) {
    PersonUtils.location = location;
  }

  public static Person generate() {
    return generate(new Random(System.currentTimeMillis()).nextInt());
  }

  public static Person generate(int seed) {
    return new Person(fakeName(seed), reduceSeed(seed, 70), ProvinceUtils.randomize(seed));
  }

  public static int generateSeedFromPersonName(String name) {

    int seed = 0;

    for (int i = 0; i < name.length(); i++) {
      seed += (i + 1) * name.charAt(i);
    }

    return seed;
  }

  public static String fakeName(int seed) {
    try (InputStream is = PersonUtils.class.getResourceAsStream(location.isEmpty() ? "/data/names.json" : location)) {
      if (is != null) {
        List<String> names = new ObjectMapper().readValue(is, new TypeReference<List<String>>() {
        });

        int index = reduceSeed(seed, names.size());

        StringBuilder name = new StringBuilder();

        while (index != -1) {
          name.append(names.get(index)).append(' ');

          index = (index / 10) != 0 ? index / 10 : -1;
        }

        if (name.length() > 0)
          name.deleteCharAt(name.length() - 1);

        return name.toString();
      }
    } catch (Exception ignored) {
    }
    return "Kurosaki Ichigo";
  }

  public static int reduceSeed(int seed, int limit) {
    if (seed <= limit) return seed;
    if (limit <= 0) return 0;
    if (seed < 10) return seed - limit;

    int lastNumber = seed % 10;

    int number = seed / 10 + lastNumber;

    return reduceSeed(number, limit);
  }

}
