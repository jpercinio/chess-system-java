package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // redundância. Por default position recebe null
	}

	protected Board getBoard() { //acessado por somentes classes dentro do mesmo pacote e sub classe
		return board;
	}

}
