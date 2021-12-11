package laptrinhtongquat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week11 {

  /**
   * sap xep mang.
   *
   * @param arr mang.
   * @param <T> kieu.
   * @return mang da sap xep.
   */
  public static <T> List<T> sortGeneric(List<T> arr) {
    Collections.sort(arr, new Comparator<T>() {
      @Override
      public int compare(T o1, T o2) {
        if (o1 instanceof Integer && o2 instanceof Integer) {
          return ((Integer) o1).compareTo((Integer) o2);
        } else if (o1 instanceof String && o2 instanceof String) {
          return ((String) o1).compareTo((String) o2);
        } else {
          return ((Person) o1).compareTo((Person) o2);
        }
      }
    });
    return arr;
  }

  public static void main(String[] args) {
    Person person1 = new Person("A", 20, "gdsfdg");
    Person person2 = new Person("A", 22, "gdsfdg");
    Person person3 = new Person("LeB", 20, "gdsfdg");
    List<Person> a = new ArrayList<>();
    a.add(person1);
    a.add(person2);
    a.add(person3);
    a = sortGeneric(a);
    for (Person person : a) {
      System.out.println(person.toString());
    }
  }
}
