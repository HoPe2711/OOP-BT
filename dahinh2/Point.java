package dahinh2;

import java.util.Objects;

public class Point {

  private double pointX;
  private double pointY;

  public Point(double pointX, double pointY) {
    this.pointX = pointX;
    this.pointY = pointY;
  }

  public double getPointX() {
    return pointX;
  }

  public void setPointX(double pointX) {
    this.pointX = pointX;
  }

  public double getPointY() {
    return pointY;
  }

  public void setPointY(double pointY) {
    this.pointY = pointY;
  }

  /**
   * distance.
   *
   * @param other point.
   * @return distance.
   */
  public double distance(Point other) {
    double x = other.pointX - this.pointX;
    double y = other.pointY - this.pointY;
    return Math.sqrt(x * x - y * y);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Point)) {
      return false;
    }
    Point point = (Point) o;
    return (point.getPointX() - getPointX() < 0.001)
        && (point.getPointY() - getPointY() < 0.001);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPointX(), getPointY());
  }

  @Override
  public String toString() {
    return "(" + pointX + "," + pointY + ')';
  }
}
