package com.teddy.algorism.laddergame;

import java.util.List;

public class LadderGame {
	
	private List<String> ladderInfo;
	
	public LadderGame(List<String> userInput) {
		this.ladderInfo = userInput;
		makeLadderGameBoard();
		makeLadderGame();
	}
	
	private void makeLadderGameBoard() {
		for (String linePosition : ladderInfo) {
			String[] position = linePosition.split(" ");
			isMaxHorizon(Integer.parseInt(position[0]));
			isMaxVertical(Integer.parseInt(position[1]));
		}
		
		ladderGameBoard = new int[maxHorizon][maxVertical];
	}
	
	private void makeLadderGame() {
		for (String linePosition : ladderInfo) {
			String[] position = linePosition.split(" ");
			ladderGameBoard[Integer.parseInt(position[0]) - 1][Integer.parseInt(position[1]) - 1] = 1000;
		}
	}
	
	private int[][] ladderGameBoard;
	private int maxHorizon = -1;
	private int maxVertical = -1;
	
	public int[][] getLadderGameBoard() {
		return ladderGameBoard;
	}
	
	
	
	public int getMaxHorizon() {
		return maxHorizon;
	}

	public int getMaxVertical() {
		return maxVertical;
	}

	

	
	public void setMaxHorizon(int maxHorizon) {
		this.maxHorizon = maxHorizon;
	}
	public void setMaxVertical(int maxVertical) {
		this.maxVertical = maxVertical;
	}
			
	private void isMaxHorizon(int horizonPosition) {
		if (maxHorizon < horizonPosition) {
			maxHorizon = horizonPosition;
		}
	}
	
	private void isMaxVertical(int verticalPosition) {
		if (maxVertical < verticalPosition) {
			maxVertical = verticalPosition;
		}
	}
	
}
