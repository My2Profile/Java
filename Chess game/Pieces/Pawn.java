
public class Pawn extends Piece {
	
	public Pawn(PieceColor color, Position position) {
		super(color, position);
	}

	
	@Override
	public boolean isValidMove(Position newPosition, Piece[][] board) {
		
		int forwardDirection = color == PieceColor.WHITE ? -1 : 1;

		int rowDiff = (newPosition.getRow() - position.getRow()) * forwardDirection;

		int colDiff = newPosition.getColumn() - position.getColumn();


		if(colDiff == 0 && rowDiff == 1 && board[newPosition.getRow()][newPosition.getCol()] == null) { return true; }



		boolean isStartingPosition = (color == Piece.Color.WHITE && position.getRow() == 6) || (color == Piece.Color.BLACK && position.getRow() == 1);

		if(colDiff == 0 && rowDiff == 2 && isStartingPosition && board[newPosition.getRow()][newPosition.getCol()] == null) {
			int middleRow = position.getRow() + forwardDirection;


			if(board[middleRow][position.getCol()] == null) {
				return true;
			}
		
		}



		if(Math.abs(colDiff) == 1 && rowDiff == 1 && board[newPosition.getRow()][newPosition.getCol()] != null && board[newPosition.getRow()][newPosition.getCol()].color != this.color) { return true;}

		return false;


	}

}