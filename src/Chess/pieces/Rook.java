package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
//Torre
public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);		
	}
	
	@Override
	public String toString() {
		return "R"; //Torre
	}
}
