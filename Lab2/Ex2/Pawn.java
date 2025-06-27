
public class Pawn extends Piece {
  private boolean hasMoved = false;

  public Pawn(Color c, Position start) {
    super(c, start);
  }

  @Override
  public boolean isLegalMove(Position b) {
    int dir = (color == Color.WHITE ? +1 : -1);  
    int dr  = (b.getRow() - a.getRow()) * dir;
    int dc  = Math.abs(b.getCol() - a.getCol());

    // advance straight
    if (dc == 0) {
      if (!hasMoved && dr == 2) return true;   
      return dr == 1;                          
    }
    
    return dr == 1 && dc == 1;
  }

  
  public void onMove() {
    hasMoved = true;
  }
}