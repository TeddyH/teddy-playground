package com.teddy.algorism.laddergame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PlayLadderGame {

	// 위 그림은 커피 내기를 할 때 유용한 사다리 게임입니다.
	// 잘 생각해 보면, 사다리 게임은 가로선을 (높이, 왼쪽의 세로줄 번호) 형태로 나타낼 수 있습니다.
	// 예컨대, 위 사다리 게임은 (1, 1), (6, 1), (9, 1), (3, 2), (5, 2) ....와 같이 표현할 수 있습니다.
	//
	// 아래 예제와 같이, 사다리 게임의 데이터와 출발 지점을 입력하면 도착 지점을 출력하는 프로그램을 작성하세요.
	private static final Logger logger = LoggerFactory.getLogger(PlayLadderGame.class);
	
	public LadderGame board;

	private int horizonPosition = 0;
	private int verticalPosition = 0;
	
	public void setVerticalPosition(int verticalPosition) {
		this.verticalPosition = verticalPosition;
		this.horizonPosition = 0;
	}

	
	public PlayLadderGame(LadderGame board) {
		this.board = board;
	}
	
	public void moveDownHorizon() {
		horizonPosition++;
	}
	public void moveLeftVertical() {
		verticalPosition--;	
	}
	public void moveRightVertical() {
		verticalPosition++;
	}
	
	public String choice(String verticalNumber) {
		int[][] ladderGameBoard = board.getLadderGameBoard();
		setVerticalPosition(Integer.parseInt(verticalNumber) - 1);
		int number = 0; 
		
		while (board.getMaxHorizon() > horizonPosition) {
			logger.info("[{}] position info [{}][{}] ", new Object[] {++number, horizonPosition, verticalPosition});
			
			if ((verticalPosition != board.getMaxVertical())
					&& ladderGameBoard[horizonPosition][verticalPosition] == LadderGame.EXPRESSION) {
				moveRightVertical();
			} else if ((verticalPosition != 0)
					&& ladderGameBoard[horizonPosition][verticalPosition - 1] == LadderGame.EXPRESSION) {
				moveLeftVertical();
			} 
			moveDownHorizon();
			
		}
		return String.valueOf(verticalPosition + 1);
	}
}
