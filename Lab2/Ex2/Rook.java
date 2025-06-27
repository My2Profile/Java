
public class Rook extends Piece {
  public Rook(Color c, Position start) { super(c, start); }

  @Override
  public boolean isLegalMove(Position b) {
    
    return (a.getRow() == b.getRow() ^ a.getCol() == b.getCol())
        && !a.equals(b);
  }
}