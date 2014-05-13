package com.teddy.algorism.laddergame;

import java.util.List;

public class LadderGame {
	
	private List<String> ladderInfo;
	
	public LadderGame(List<String> userInput) {
		this.ladderInfo = userInput;
		makeLadderGame();
	}
	
	private void makeLadderGame() {
		for (String linePosition : ladderInfo) {
			String[] position = linePosition.split(" ");
			isMaxHorizon(Integer.parseInt(position[0]));
			isMaxVertical(Integer.parseInt(position[1]));
		}
		
	}
	
	private int[][] ladderGameboard;
	
	private int horizonPosition = 0;
	private int verticalPosition = 1;
	
	private int maxHorizon = -1;
	private int maxVertical = -1;

	
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
	
	public void goHorizon() {
		horizonPosition++;
	}
	
	public void goVertical() {
		verticalPosition++;
	}
}
