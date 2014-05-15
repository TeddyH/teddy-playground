package com.teddy.algorism.laddergame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PlayLadderGame {
	
	private static final Logger logger = LoggerFactory.getLogger(PlayLadderGame.class);
	
	public static final String LEFT = "LEFT";
	public static final String RIGHT = "RIGHT";
	
	public enum MOVE_VERTICAL {LEFT, RIGHT};
	
	public LadderGame board;

	private int horizonPosition = 0;
	private int verticalPosition = 0;
	
	public void setVerticalPosition(int verticalPosition) {
		this.verticalPosition = verticalPosition;
		this.horizonPosition = 0;
	}

	private MOVE_VERTICAL verticalMoveWay = MOVE_VERTICAL.RIGHT;
	
	public PlayLadderGame(LadderGame board) {
		this.board = board;
	}
	
	public void moveDownHorizon() {
		horizonPosition++;
	}
	public void moveLeftVertical() {
		verticalPosition--;	
	}
	public void goRightVertical() {
		verticalPosition++;
	}
	
	public boolean isAvailableVerticalMoveWay() {
		return ((verticalPosition == board.getMaxVertical() - 1) || (verticalPosition == 0)) 
				? false : true;
	}

	public String choice(String verticalNumber) {
		int[][] ladderGameBoard = board.getLadderGameBoard();
		setVerticalPosition(Integer.parseInt(verticalNumber) - 1);
		int number = 1; 
		
		while (board.getMaxHorizon() > horizonPosition) {
			logger.info("[{}] position info [{}][{}] ", new Object[] {number++, horizonPosition, verticalPosition});
			
			if ((verticalPosition != board.getMaxVertical())
					&& ladderGameBoard[horizonPosition][verticalPosition] == LadderGame.EXPRESSION) {
				goRightVertical();
			} else if ((verticalPosition != 0)
					&& ladderGameBoard[horizonPosition][verticalPosition - 1] == LadderGame.EXPRESSION) {
				moveLeftVertical();
			} 
			moveDownHorizon();
			
		}
		return String.valueOf(verticalPosition + 1);
	}
}
