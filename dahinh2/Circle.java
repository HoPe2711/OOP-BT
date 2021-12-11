package dahinh2;

import java.util.Objects;

public class Circle extends Shape {

  protected Point center;
  protected double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  /**
   * circle.
   *
   * @param center a.
   * @param radius a.
   * @param color  a.
   * @param filled a.
   */
  public Circle(Point center, double radius, String color, boolean filled) {
    super(color, filled);
    this.center = center;
    this.radius = radius;
  }

  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public double getPerimeter() {
    return 2.0 * radius * Math.PI;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Circle)) {
      return false;
    }
    Circle circle = (Circle) o;
    return (circle.getRadius() - getRadius() < 0.001) && getCenter().equals(
        circle.getCenter());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCenter(), getRadius());
  }

  @Override
  public String toString() {
    return new StringBuilder().append("interfaceshape.Circle[").append("center=").append(center).append(",radius=")
        .append(radius).append(",color=").append(color).append(",filled=").append(filled)
        .append(']').toString();
  }
}