
public class Queen extends Piece {
  public Queen(Color c, Position start) { super(c, start); }

  @Override
  public boolean isLegalMove(Position b) {
    
    int dr = Math.abs(b.getRow() - a.getRow());
    int dc = Math.abs(b.getCol() - a.getCol());
    boolean straight = (a.getRow()==b.getRow() ^ a.getCol()==b.getCol());
    boolean diagonal = dr == dc && dr != 0;
    return (straight || diagonal) && !a.equals(b);
  }
}