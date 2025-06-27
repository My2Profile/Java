/* 
abstract class Position {

	int row, col;

	public Position(int row, int col) { this.row = row;  this.col = col; }

	public int getRow() { return this.row; }

	public int getCol() { return this.col; }

	public void setRow(int row) { this.row = row; }

	public void setCol(int col) { this.col = col; }

}



abstract class Piece extends Position {

	public abstract boolean isLegalMove(Position b);

}
*/