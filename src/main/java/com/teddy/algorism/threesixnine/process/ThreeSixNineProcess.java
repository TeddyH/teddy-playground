package com.teddy.algorism.threesixnine.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreeSixNineProcess {
	
	private static final Logger logger = LoggerFactory.getLogger(ThreeSixNineProcess.class);
	/**
	 * 3,6,9 에 짝을 출력한다.
	 * 순서대로 카운트 
	 * 3,6,9 가 들어가는 지 확인
	 * 들어가면 짝 출력
	 * 
	 */
	private int num = 0;
		
	public void doProcess() {
		
		while (num < 10000) {
			increaseCount();
			printTurn(checkText(num));
		}
	}
		
	public String checkText(int num) {
		String clapping = "";
		
		for (char checkCharacter : String.valueOf(num).toCharArray()) {
			if (isThree(checkCharacter) || isSix(checkCharacter) || isNine(checkCharacter)) {
				clapping = clapping.concat(shoutClap());
			}
		}
		
		return clapping;
	}

	public void increaseCount() {
		num++;
	}
	
	public void printTurn(String clapping) {
		logger.info("count : [{}] {}", num, clapping);
	}
	
	private boolean isThree(char checkCharacter) {
		return "3".equals(String.valueOf(checkCharacter));
	}
	private boolean isSix(char checkCharacter) {
		return "6".equals(String.valueOf(checkCharacter));
	}
	private boolean isNine(char checkCharacter) {
		return "9".equals(String.valueOf(checkCharacter));
	}
	private String shoutClap() {
		return "\t #clap!#";
	}
}

