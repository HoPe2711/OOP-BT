package covua;

public abstract class Piece {

  private int coordinatesX;
  private int coordinatesY;
  private String color;

  /**
   * binh.
   *
   * @param coordinatesX binh.
   * @param coordinatesY binh.
   */
  public Piece(int coordinatesX, int coordinatesY) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    this.color = "white";
  }

  /**
   * binh.
   *
   * @param coordinatesX binh.
   * @param coordinatesY binh.
   * @param color        binh.
   */
  public Piece(int coordinatesX, int coordinatesY, String color) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    this.color = color;
  }

  public abstract String getSymbol();

  public abstract boolean canMove(Board board, int x, int y);

  public int getCoordinatesX() {
    return coordinatesX;
  }

  public void setCoordinatesX(int coordinatesX) {
    this.coordinatesX = coordinatesX;
  }

  public int getCoordinatesY() {
    return coordinatesY;
  }

  public void setCoordinatesY(int coordinatesY) {
    this.coordinatesY = coordinatesY;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean checkPosition(Piece piece) {
    return true;
  }
}
