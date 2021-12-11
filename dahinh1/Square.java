package dahinh1;

public class Square extends Rectangle {

  public Square() {
  }

  /**
   * constructor.
   *
   * @param side constructor.
   */
  public Square(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public double getSide() {
    return super.getLength();
  }

  /**
   * setter.
   *
   * @param side setter.
   */
  public void setSide(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  public void setWidth(double side) {
    super.setWidth(side);
    super.setLength(side);
  }

  public void setLength(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  @Override
  public String toString() {
    return "exception1.Square[" + "side=" + getSide() + ",color=" + color + ",filled=" + filled + ']';
  }
}
