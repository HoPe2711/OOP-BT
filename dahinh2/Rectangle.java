package dahinh2;

import java.util.Objects;

public class Rectangle extends Shape {

  protected Point topLeft;
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

  /**
   * hcn.
   *
   * @param topLeft hcn.
   * @param width   hcn.
   * @param length  hcn.
   * @param color   hcn.
   * @param filled  hcn.
   */
  public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
    this.topLeft = topLeft;
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

  public Point getTopLeft() {
    return topLeft;
  }

  public void setTopLeft(Point topLeft) {
    this.topLeft = topLeft;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Rectangle)) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return (rectangle.getWidth() - getWidth() < 0.001)
        && (rectangle.getLength() - getLength() < 0.001)
        && Objects.equals(getTopLeft(), rectangle.getTopLeft());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTopLeft(), getWidth(), getLength());
  }

  @Override
  public String toString() {
    return new StringBuilder().append("Rectangle[").append("topLeft=").append(topLeft)
        .append(",width=").append(width).append(",length=").append(length).append(",color=")
        .append(color).append(",filled=").append(filled).append(']').toString();
  }
}
