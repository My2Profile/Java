public class Knight extends Piece {
  public Knight(Color c, Position start) { super(c, start); }

  @Override
  public boolean isLegalMove(Position b) {
    int dr = Math.abs(b.getRow() - a.getRow());
    int dc = Math.abs(b.getCol() - a.getCol());
    
    return (dr == 2 && dc == 1) || (dr == 1 && dc == 2);
  }
}