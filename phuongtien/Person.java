package phuongtien;

import java.util.ArrayList;
import java.util.List;

public class Person {

  private String name;
  private String address;
  private List<Vehicle> vehicleList = new ArrayList<>();

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public void addVehicle(Vehicle vehicle) {
    this.vehicleList.add(vehicle);
  }

  public void removeVehicle(String registrationNumber) {
    vehicleList.removeIf(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber));
  }

  /**
   * getinfo.
   *
   * @return string.
   */
  public String getVehiclesInfo() {
    String result = "";
    if (vehicleList.isEmpty()) {
      result = name + " has no vehicle!";
    } else {
      result = name + " has:" + "\n\n";
      for (Vehicle vehicle : vehicleList) {
        result += vehicle.getInfo() + "\n";
      }
    }
    return result;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
