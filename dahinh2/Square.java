package dahinh2;

import java.util.Objects;

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

  public Square(Point topLeft, double side, String color, boolean filled) {
    super(topLeft, side, side, color, filled);
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Rectangle)) {
      return false;
    }
    Square square = (Square) o;
    return (square.getWidth() - getWidth() < 0.001)
        && (square.getLength() - getLength() < 0.001)
        && Objects.equals(getTopLeft(), square.getTopLeft());
  }

  @Override
  public String toString() {
    return new StringBuilder().append("exception1.Square[").append("topLeft=").append(topLeft).append(",side=")
        .append(getSide()).append(",color=").append(color).append(",filled=").append(filled)
        .append(']').toString();
  }
}
