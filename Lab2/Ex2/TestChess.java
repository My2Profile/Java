public class TestChess {
  public static void main(String[] args) {
    Piece[] pieces = {
      new Rook(Color.WHITE,   new Position(0,0)), // a1
      new Bishop(Color.BLACK, new Position(2,0)), // a3
      new Queen(Color.WHITE,  new Position(3,3)), // d4
      new King(Color.BLACK,   new Position(4,4)), // e5
      new Knight(Color.WHITE, new Position(1,0)), // a2
      new Pawn(Color.BLACK,   new Position(6,4))  // e7
    };

    Position[] tests = {
      new Position(0,7), // a8
      new Position(5,5), // f6
      new Position(6,6), // g7
      new Position(5,4), // e6
      new Position(2,2), // c3
      new Position(4,5)  // f5
    };

    for (int i = 0; i < pieces.length; i++) {
      System.out.printf("%s -> %s ? %s%n",
        pieces[i], tests[i],
        pieces[i].isLegalMove(tests[i]));
    }
  }
}