package composite;
public class Main {
  public static void main(String[] args) {
    Person james = new Person("James");
    Person hana = new Person("Hana");
    Person ryan = new Person("Ryan");
    Person kai = new Person("Kai");
    james.setMarriage(hana);
    james.getChildren().add(ryan);
    james.getChildren().add(kai);

    Person jennifer = new Person("Jennifer");
    Person a = new Person("chau1");
    Person b = new Person("chau2");
    Person c = new Person("chau3");
    Person d = new Person("chau4");
    kai.setMarriage(jennifer);
    kai.getChildren().add(a);
    kai.getChildren().add(b);
    kai.getChildren().add(c);
    kai.getChildren().add(d);
    System.out.println("Find person kai marriage");
    System.out.println(kai.getMarriage().getName());
    System.out.println();
    System.out.println("Find person no marriage");
    System.out.println(james.findMarriage());
    System.out.println();
    System.out.println("Find person with 2 children");
    james.find2Children();
    System.out.println();
    System.out.println("Find latest generation");
    james.findNewGeneration(0);
    System.out.println(Person.generation);
  }
}