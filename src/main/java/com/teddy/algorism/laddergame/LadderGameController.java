package com.teddy.algorism.laddergame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LadderGameController {
	
	private static final Logger logger = LoggerFactory.getLogger(LadderGameController.class);

	// 위 그림은 커피 내기를 할 때 유용한 사다리 게임입니다.
	// 잘 생각해 보면, 사다리 게임은 가로선을 (높이, 왼쪽의 세로줄 번호) 형태로 나타낼 수 있습니다.
	// 예컨대, 위 사다리 게임은 (1, 1), (6, 1), (9, 1), (3, 2), (5, 2) ....와 같이 표현할 수 있습니다.
	//
	// 아래 예제와 같이, 사다리 게임의 데이터와 출발 지점을 입력하면 도착 지점을 출력하는 프로그램을 작성하세요.
	
	
	
	public int startHorizon() {
		return 1;
	}
	
	public int startVertical() {
		return 0;
	}
}
