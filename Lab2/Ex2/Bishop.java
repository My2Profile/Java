
public class Bishop extends Piece {
  public Bishop(Color c, Position start) { super(c, start); }

  @Override
  public boolean isLegalMove(Position b) {
    // diagonal: deltaRow == deltaCol
    int dr = Math.abs(b.getRow() - a.getRow());
    int dc = Math.abs(b.getCol() - a.getCol());
    return dr == dc && dr != 0;
  }
}