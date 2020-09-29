package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K"; //Rei
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		//matriz de booleans de mesma dimensão do tabuleiro e iniciada com false
		return mat;
	}
}
