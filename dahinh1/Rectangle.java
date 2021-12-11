package dahinh1;

public class Rectangle extends Shape {

  protected double width;
  protected double length;

  public Rectangle() {
  }

  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * constructor.
   *
   * @param width  constructor.
   * @param length constructor.
   * @param color  constructor.
   * @param filled constructor.
   */
  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double getArea() {
    return width * length;
  }

  @Override
  public double getPerimeter() {
    return (width + length) * 2;
  }

  @Override
  public String toString() {
    return new StringBuilder().append("Rectangle[").append("width=").append(width)
        .append(",length=").append(length).append(",color=").append(color).append(",filled=")
        .append(filled).append(']').toString();
  }
}
