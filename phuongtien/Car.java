package phuongtien;

public class Car extends Vehicle {

  private int numberOfDoors;

  public Car(String brand, String model, String registrationNumber, Person owner,
      int numberOfDoors) {
    super(brand, model, registrationNumber, owner);
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  public String getInfo() {
    String result = "Car:";
    result += "\n\t" + "Brand: " + super.getBrand();
    result += "\n\t" + "Model: " + super.getModel();
    result += "\n\t" + "Registration Number: " + super.getRegistrationNumber();
    result += "\n\t" + "Number of Doors: " + numberOfDoors;
    result +=
        "\n\t" + "Belongs to " + super.getOwner().getName() + " - " + super.getOwner().getAddress();
    return result;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }
}
