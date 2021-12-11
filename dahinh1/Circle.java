package dahinh1;

public class Circle extends Shape {

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
  public String toString() {
    return "interfaceshape.Circle[" + "radius=" + radius + ",color=" + color + ",filled=" + filled + ']';
  }
}
