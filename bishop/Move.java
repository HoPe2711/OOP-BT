package bishop;

public class Move {

  private int startX;
  private int endX;
  private int startY;
  private int endY;
  private Piece movedPiece;
  private Piece killedPiece;

  /**
   * binh.
   *
   * @param startX     binh.
   * @param endX       binh.
   * @param startY     binh.
   * @param endY       binh.
   * @param movedPiece binh.
   */
  public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
    this.startX = startX;
    this.endX = endX;
    this.startY = startY;
    this.endY = endY;
    this.movedPiece = movedPiece;
  }

  /**
   * binh.
   *
   * @param startX      binh.
   * @param endX        binh.
   * @param startY      binh.
   * @param endY        binh.
   * @param movedPiece  binh.
   * @param killedPiece binh.
   */
  public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
    this.startX = startX;
    this.endX = endX;
    this.startY = startY;
    this.endY = endY;
    this.movedPiece = movedPiece;
    this.killedPiece = killedPiece;
  }

  @Override
  public String toString() {
    return String.format("%s-%s%s%s",
        movedPiece.getColor(),
        movedPiece.getSymbol(),
        (char) (endX + 96), endY);
  }

  public int getStartX() {
    return startX;
  }

  public void setStartX(int startX) {
    this.startX = startX;
  }

  public int getEndX() {
    return endX;
  }

  public void setEndX(int endX) {
    this.endX = endX;
  }

  public int getStartY() {
    return startY;
  }

  public void setStartY(int startY) {
    this.startY = startY;
  }

  public int getEndY() {
    return endY;
  }

  public void setEndY(int endY) {
    this.endY = endY;
  }

  public Piece getMovedPiece() {
    return movedPiece;
  }

  public void setMovedPiece(Piece movedPiece) {
    this.movedPiece = movedPiece;
  }

  public Piece getKilledPiece() {
    return killedPiece;
  }

  public void setKilledPiece(Piece killedPiece) {
    this.killedPiece = killedPiece;
  }
}
