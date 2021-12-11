package covua;

import java.util.Objects;

public class Rook extends Piece {

  /**
   * binh.
   *
   * @param coordinatesX binh.
   * @param coordinatesY binh.
   */
  public Rook(int coordinatesX, int coordinatesY) {
    super(coordinatesX, coordinatesY);
  }

  /**
   * binh.
   *
   * @param coordinatesX binh.
   * @param coordinatesY binh.
   * @param color        binh.
   */
  public Rook(int coordinatesX, int coordinatesY, String color) {
    super(coordinatesX, coordinatesY, color);
  }

  @Override
  public String getSymbol() {
    return "R";
  }

  /**
   * binh.
   *
   * @param board binh.
   * @param x     binh.
   * @param y     binh.
   * @return binh.
   */
  public boolean canMove(Board board, int x, int y) {
    if (!board.validate(x, y)) {
      return false;
    }
    if (super.getCoordinatesX() == x && super.getCoordinatesY() == y) {
      return false;
    }
    if (super.getCoordinatesX() != x && super.getCoordinatesY() != y) {
      return false;
    }
    if (board.getAt(x, y) != null) {
      if (Objects.equals(board.getAt(x, y).getColor(), super.getColor())) {
        return false;
      }
    }
    if (super.getCoordinatesX() < x) {
      for (int a = super.getCoordinatesX() + 1; a < x; a++) {
        if (board.getAt(a, y) != null) {
          return false;
        }
      }
    } else {
      for (int a = x + 1; a < super.getCoordinatesX(); a++) {
        if (board.getAt(a, y) != null) {
          return false;
        }
      }
    }
    if (super.getCoordinatesY() < y) {
      for (int a = super.getCoordinatesY() + 1; a < y; a++) {
        if (board.getAt(x, a) != null) {
          return false;
        }
      }
    } else {
      for (int a = y + 1; a < super.getCoordinatesY(); a++) {
        if (board.getAt(x, a) != null) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Board board = new Board();
    Game game = new Game(board);
    Piece rook1 = new Rook(3, 4, "white");
    Piece rook2 = new Rook(3, 5, "black");
    Piece rook3 = new Rook(3, 3, "white");
    board.addPiece(rook1);
    board.addPiece(rook2);
    board.addPiece(rook3);
    //System.out.println(board.getAt(1, 1));
    //System.out.println(board.getAt(1, 1));
    System.out.println(rook1.canMove(board, 3, 6));
    game.movePiece(rook1, 3, 1);
    System.out.println(board.getAt(1, 1));
    System.out.println(game.getMoveHistory());
    System.out.println(rook1.getCoordinatesX() + " " + rook1.getCoordinatesY());
    System.out.println(game.getBoard().getPieces());
  }
}
