package phuongtien;

public class MotorBike extends Vehicle {

  private boolean hasSidecar;

  public MotorBike(String brand, String model, String registrationNumber, Person owner,
      boolean hasSidecar) {
    super(brand, model, registrationNumber, owner);
    this.hasSidecar = hasSidecar;
  }

  @Override
  public String getInfo() {
    String result = "Motor Bike:";
    result += "\n\t" + "Brand: " + super.getBrand();
    result += "\n\t" + "Model: " + super.getModel();
    result += "\n\t" + "Registration Number: " + super.getRegistrationNumber();
    result += "\n\t" + "Has Side Car: " + hasSidecar;
    result +=
        "\n\t" + "Belongs to " + super.getOwner().getName() + " - " + super.getOwner().getAddress();
    return result;
  }

  public boolean isHasSidecar() {
    return hasSidecar;
  }

  public void setHasSidecar(boolean hasSidecar) {
    this.hasSidecar = hasSidecar;
  }
}
