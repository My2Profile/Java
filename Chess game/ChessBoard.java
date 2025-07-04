
public class ChessBoard {
	
	private Piece[][] board;


	public ChessBoard() {
		this.board = new Piece[8][8];
		setupPieces();
	}


	public void setupPieces() {
		
		board[0][0] = new Rook(PieceColor.BLACK, new Position(0, 0));
		board[0][7] = new Rook(PieceColor.BLACK, new Position(0, 7));
		board[7][0] = new Rook(PieceColor.WHITE, new Position(7, 0));
		board[7][7] = new Rook(PieceColor.WHITE, new Position(7, 7));
		
		// Place Knights
		board[0][1] = new Knight(PieceColor.BLACK, new Position(0, 1));
		board[0][6] = new Knight(PieceColor.BLACK, new Position(0, 6));
		board[7][1] = new Knight(PieceColor.WHITE, new Position(7, 1));
		board[7][6] = new Knight(PieceColor.WHITE, new Position(7, 6));
		
		// Place Bishops
		board[0][2] = new Bishop(PieceColor.BLACK, new Position(0, 2));
		board[0][5] = new Bishop(PieceColor.BLACK, new Position(0, 5));
		board[7][2] = new Bishop(PieceColor.WHITE, new Position(7, 2));
		board[7][5] = new Bishop(PieceColor.WHITE, new Position(7, 5));
		
		// Place Queens
		board[0][3] = new Queen(PieceColor.BLACK, new Position(0, 3));
		board[7][3] = new Queen(PieceColor.WHITE, new Position(7, 3));
		
		// Place Kings
		board[0][4] = new King(PieceColor.BLACK, new Position(0, 4));
		board[7][4] = new King(PieceColor.WHITE, new Position(7, 4));
		
		// Place Pawns
		for (int i = 0; i < 8; i++) {
		  board[1][i] = new Pawn(PieceColor.BLACK, new Position(1, i));
		  board[6][i] = new Pawn(PieceColor.WHITE, new Position(6, i));
  		}

	}


	public void movePiece(Position start, Position end) {

		if(board[start.getRow()][start.getCol()] != null 
		   && board[start.getRow][start.getCol()].isValidMove(end, board)) {

			board[end.getRow()][end.getCol()] = board[start.getRow()][start.getCol()];

			board[end.getRow()][end.getCol()].setPosition(end);

			board[start.getRow()][start.getCol()] = null;
		}
	}


}