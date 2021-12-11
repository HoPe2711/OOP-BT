package composite;

import java.util.ArrayList;

public class Person {
  public static ArrayList<String> generation = new ArrayList<>();
  public static int generationCount;
  private String name;
  private ArrayList<Person> children = new ArrayList<>();
  private Person marriage;

  public Person(String name) {
    this.name = name;
  }

  public ArrayList<String> findMarriage() {
    ArrayList<String> temp = new ArrayList<>();
    if (this.marriage == null) {
      temp.add(this.name);
      return temp;
    }
    for (Person child : children) {
      temp.addAll(child.findMarriage());
    }
    return temp;
  }

  public void find2Children() {
    if (this.children.size() == 2) {
      System.out.printf("%s and %s has 2 children\n", this.name, this.marriage.getName());
    }
    for (Person child : children) {
      child.find2Children();
    }
  }

  public void findNewGeneration(int k) {
    if (this.children.size() == 0) {
      if (generationCount == k) {
        generation.add(this.name);
      } else if (generationCount < k) {
        generationCount++;
        generation.clear();
        generation.add(this.name);
      }
      return;
    }
    for (Person child : children) {
      child.findNewGeneration(k + 1);
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Person> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<Person> children) {
    this.children = children;
  }

  public Person getMarriage() {
    return marriage;
  }

  public void setMarriage(Person marriage) {
    this.marriage = marriage;
  }
}