package com.teddy.algorism.namesort.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.algorism.namesort.process.NameSortProcess;

public class NameSortMain {

	private static final Logger logger = LoggerFactory.getLogger(NameSortMain.class);
	
	/**
	 * 주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
	 * 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
	 * 김씨와 이씨는 각각 몇 명 인가요?
	 * "이재영"이란 이름이 몇 번 반복되나요?
	 * 중복을 제거한 이름을 출력하세요.
	 * 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
	 */
	public static void main(String[] args) {
		
		NameSortProcess nsp = new NameSortProcess();
		
		logger.info(" {}", nsp.howManyKim());
		logger.info(" {}", nsp.howManyLee());
		logger.info(" {}", nsp.howManyLeeJaeYoung());
		nsp.printUniqueNames();
		nsp.printAscendingUniqueNames();
	}

}
