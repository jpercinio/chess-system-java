package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Queen extends ChessPiece{

	public Queen(Board board, Color color) {
		super(board, color);		
	}
	
	@Override
	public String toString() {
		return "Q"; //Rainha
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		//matriz de booleans de mesma dimens�o do tabuleiro e iniciada com false
		
		Position p = new Position(0,0);
		
		//above
		p.setValues(position.getRow() - 1, position.getColumn());
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Left
		p.setValues(position.getRow(), position.getColumn() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Right
		p.setValues(position.getRow(), position.getColumn() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//Below
		p.setValues(position.getRow() + 1, position.getColumn());
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//nw (noroeste)
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);;
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//ne (nordeste)
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() + 1);;
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//se (sudeste)
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() + 1);;
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//sw (sudoeste)
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() -1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}
}
