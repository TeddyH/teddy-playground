package com.teddy.algorism.laddergame;


public class PlayLadderGame {
	
	public static final String LEFT = "LEFT";
	public static final String RIGHT = "RIGHT";
	
	public enum  MOVE_VERTICAL {LEFT, RIGHT};
	
	public LadderGame board;

	private int horizonPosition = 0;
	private int verticalPosition = 0;
	
	private MOVE_VERTICAL verticalMoveWay = MOVE_VERTICAL.RIGHT;
	
	
	public PlayLadderGame(LadderGame board) {
		this.board = board;
	}
	
	public void goHorizon() {
		horizonPosition++;
	}
	
	public void goVertical() {
		if (verticalMoveWay.equals(MOVE_VERTICAL.RIGHT)) {
			verticalPosition++;	
		} else {
			verticalPosition--;
		}
	}
	
	public void isChangeVerticalMoveWay() {
		if (verticalPosition == board.getMaxVertical() - 1) {
			verticalMoveWay = MOVE_VERTICAL.LEFT;
		} else if (verticalPosition == 0) {
			verticalMoveWay = MOVE_VERTICAL.RIGHT;
		}
	}
	
}
