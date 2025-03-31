package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	
	private ChessMatch chessMatch;
	
	
	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch= chessMatch;	
		
	}
	
	private boolean testRookCastling(Position position) { 
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p instanceof Rook &&p.getColor() == getColor() &&p.getMoveCount()==0;
	}
	
	@Override
	public String toString() {
		return "K";
	}
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position (0,0);
		
		//cima
		p.setValues(position.getRow()-1, position.getColumn());
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//abaixo
		p.setValues(position.getRow()+1, position.getColumn());
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//direita
		p.setValues(position.getRow(), position.getColumn()+1);
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//esquerda
		p.setValues(position.getRow(), position.getColumn()-1);
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//NO
		p.setValues(position.getRow()-1, position.getColumn()-1);
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//NE
		p.setValues(position.getRow()-1, position.getColumn()+1);
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SE
		p.setValues(position.getRow()+1, position.getColumn()+1);
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SO
		p.setValues(position.getRow()+1, position.getColumn()-1);
		if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
				
		//Castiling
		
		if(getMoveCount()==0 && !chessMatch.getCheck()) {
			Position pR1 = new Position(position.getRow(),position.getColumn() + 3);
			//king side
			if(testRookCastling(pR1)) {
				Position p1 = new Position(position.getRow(),position.getColumn() + 1);
				Position p2 = new Position(position.getRow(),position.getColumn() + 2);
				if(getBoard().piece(p1)== null && getBoard().piece(p2) == null) {
					mat[position.getRow()][position.getColumn()+2] = true;
				}
			}
			//queen side
			Position pR2 = new Position(position.getRow(),position.getColumn() - 4);
			if(testRookCastling(pR2)) {
				Position p1 = new Position(position.getRow(),position.getColumn() - 1);
				Position p2 = new Position(position.getRow(),position.getColumn() - 2);
				Position p3 = new Position(position.getRow(),position.getColumn() - 3);
				if(getBoard().piece(p1)== null && getBoard().piece(p2) == null && getBoard().piece(p3) == null) {
					mat[position.getRow()][position.getColumn() - 2] = true;
				}
			}

				
		}
		
		return mat;
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
}
