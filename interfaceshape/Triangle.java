package interfaceshape;

public class Triangle implements GeometricObject {

  private Point p1;
  private Point p2;
  private Point p3;

  /**
   * constructor.
   *
   * @param p1 constructor.
   * @param p2 constructor.
   * @param p3 constructor.
   * @throws RuntimeException constructor.
   */
  public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
    double a = p1.distance(p2);
    double b = p2.distance(p3);
    double c = p3.distance(p1);
    if (a + b <= c || a + c <= b || b + c <= a) {
      throw new RuntimeException();
    }
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public Point getP1() {
    return p1;
  }

  public Point getP2() {
    return p2;
  }

  public Point getP3() {
    return p3;
  }

  /**
   * dientich.
   *
   * @return dientich.
   */
  @Override
  public double getArea() {
    return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
        + p2.getPointX() * (p3.getPointY() - p1.getPointY())
        + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
  }

  /**
   * chuvi.
   *
   * @return chuvi.
   */
  @Override
  public double getPerimeter() {
    return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
  }

  @Override
  public String getInfo() {
    return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
        p1.getPointX(), p1.getPointY(),
        p2.getPointX(), p2.getPointY(),
        p3.getPointX(), p3.getPointY());
  }
}
