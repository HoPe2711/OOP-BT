package bishop;

import java.util.ArrayList;

public class Board {

  public static final int WIDTH = 8;
  public static final int HEIGHT = 8;
  private ArrayList<Piece> pieces = new ArrayList<>();

  public Board() {
  }

  /**
   * binh.
   *
   * @param piece binh.
   */
  public void addPiece(Piece piece) {
    if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
      return;
    }
    if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
      pieces.add(piece);
    }
  }

  /**
   * binh.
   *
   * @param x binh.
   * @param y binh.
   * @return binh.
   */
  public boolean validate(int x, int y) {
    return 1 <= x && x <= 8 && 1 <= y && y <= 8;
  }

  /**
   * binh.
   *
   * @param x binh.
   * @param y binh.
   */
  public void removeAt(int x, int y) {
    pieces.remove(getAt(x, y));
  }

  /**
   * binh.
   *
   * @param x binh.
   * @param y binh.
   * @return binh.
   */
  public Piece getAt(int x, int y) {
    Piece a = pieces.stream()
        .filter(piece -> piece.getCoordinatesX() == x && piece.getCoordinatesY() == y)
        .findAny()
        .orElse(null);
    return a;
  }

  public ArrayList<Piece> getPieces() {
    return pieces;
  }

  public void setPieces(ArrayList<Piece> pieces) {
    this.pieces = pieces;
  }
}
