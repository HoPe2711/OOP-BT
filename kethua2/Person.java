package kethua2;

public class Person {

  private String name;
  private String address;

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "laptrinhtongquat.Person[" +
        "name=" + name +
        ",address=" + address +
        ']';
  }

  public static void main(String[] args) {
    Person person = new Person("Trung", "Hoang");
    Student student = new Student("Trung", "Hoang", "Nguyen", 5, 3);
    Staff staff = new Staff("Trung", "Hoang", "Nguyen", 4);
    System.out.println(person.toString());
    System.out.println(student.toString());
    System.out.println(staff.toString());
  }
}
