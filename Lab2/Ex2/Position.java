
public class Position {
  private final int row, col; 

  public Position(int row, int col) {
    if (row < 0 || row > 7 || col < 0 || col > 7)
      throw new IllegalArgumentException("Off‐board");
    this.row = row;
    this.col = col;
  }

  public int getRow() { return row; }
  public int getCol() { return col; }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Position)) return false;
    Position p = (Position)o;
    return row == p.row && col == p.col;
  }
  

  @Override
  public String toString() {
    // e.g. (0,0)->"a1", (7,7)->"h8"
    return "" + (char)('a' + col) + (row + 1);
  }
}