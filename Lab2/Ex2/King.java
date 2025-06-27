
public class King extends Piece {
  public King(Color c, Position start) { super(c, start); }

  @Override
  public boolean isLegalMove(Position b) {
    int dr = Math.abs(b.getRow() - a.getRow());
    int dc = Math.abs(b.getCol() - a.getCol());
    
    return dr <= 1 && dc <= 1 && (dr+dc != 0);
  }
}