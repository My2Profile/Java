
public abstract class Piece {
  protected Position a;     // current square
  protected final Color color;

  public Piece(Color color, Position start) {
    this.color = color;
    this.a = start;
  }

  public Color getColor()       { return color; }
  public Position getPosition(){ return a; }

  
  public abstract boolean isLegalMove(Position b);

  @Override
  public String toString() {
    return color + " " + getClass().getSimpleName() + "@" + a;
  }
}