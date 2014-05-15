package com.teddy.algorism.laddergame;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LadderGame {
	
	private static final Logger logger = LoggerFactory.getLogger(LadderGame.class);
	
	private List<String> ladderInfo;
	
	public static int EXPRESSION = 1000000;
	
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
		
		ladderGameBoard = new int[maxHorizon+=2][++maxVertical];
	}
	
	private void makeLadderGame() {
		for (String linePosition : ladderInfo) {
			String[] position = linePosition.split(" ");
			ladderGameBoard[Integer.parseInt(position[0])][Integer.parseInt(position[1]) - 1] = LadderGame.EXPRESSION;
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
	
	public void info() {
		for (int horizon = 0; horizon < ladderGameBoard.length; horizon++) {
			int[] boardVertical = ladderGameBoard[horizon];
			
			StringBuffer verticalString = new StringBuffer();
			for (int vertical = 0; vertical < boardVertical.length; vertical++) {
				verticalString.append(ladderGameBoard[horizon][vertical]).append("\t");
			}
			
			logger.info("gameBoard[{}] : {}", horizon, verticalString.toString());
		}
	}
}
