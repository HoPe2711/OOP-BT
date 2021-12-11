package bishop;

import java.util.Objects;

public class Bishop extends Piece {

  /**
   * binh.
   *
   * @param coordinatesX binh.
   * @param coordinatesY binh.
   */
  public Bishop(int coordinatesX, int coordinatesY) {
    super(coordinatesX, coordinatesY);
  }

  /**
   * binh.
   *
   * @param coordinatesX binh.
   * @param coordinatesY binh.
   * @param color        binh.
   */
  public Bishop(int coordinatesX, int coordinatesY, String color) {
    super(coordinatesX, coordinatesY, color);
  }

  @Override
  public String getSymbol() {
    return "B";
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
    if (super.getCoordinatesX() - super.getCoordinatesY() != x - y
        && super.getCoordinatesX() + super.getCoordinatesY() != x + y) {
      return false;
    }
    if (board.getAt(x, y) != null) {
      if (Objects.equals(board.getAt(x, y).getColor(), super.getColor())) {
        return false;
      }
    }
    if (super.getCoordinatesX() - super.getCoordinatesY() == x - y) {
      if (super.getCoordinatesX() < x) {
        for (int a = super.getCoordinatesX() + 1; a < x; a++) {
          if (board.getAt(a, a + y - x) != null) {
            return false;
          }
        }
      } else {
        for (int a = x + 1; a < super.getCoordinatesX(); a++) {
          if (board.getAt(a, a + y - x) != null) {
            return false;
          }
        }
      }
    }
    if (super.getCoordinatesX() + super.getCoordinatesY() == x + y) {
      if (super.getCoordinatesY() < y) {
        for (int a = super.getCoordinatesY() + 1; a < y; a++) {
          if (board.getAt(x + y - a, a) != null) {
            return false;
          }
        }
      } else {
        for (int a = y + 1; a < super.getCoordinatesY(); a++) {
          if (board.getAt(x + y - a, a) != null) {
            return false;
          }
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Board board = new Board();
    Game game = new Game(board);
    Piece bishop1 = new Bishop(1, 1, "white");
    Piece bishop2 = new Bishop(4, 4, "black");
    Piece bishop3 = new Bishop(2, 5, "black");
    board.addPiece(bishop1);
    board.addPiece(bishop2);
    board.addPiece(bishop3);
    System.out.println(bishop1.canMove(board, 4, 4));
    System.out.println(bishop1.canMove(board, 1, 1));
    System.out.println(bishop1.canMove(board, 6, 1));
    game.movePiece(bishop1, 4, 4);
    System.out.println(board.getAt(4, 3));
    System.out.println(game.getMoveHistory());
    System.out.println(bishop1.getCoordinatesX() + " " + bishop1.getCoordinatesY());
    System.out.println(game.getBoard().getPieces());
  }
}
