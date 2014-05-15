package com.teddy.algorism.laddergame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LadderGameMain {
	
	private static final Logger logger = LoggerFactory.getLogger(LadderGameMain.class);

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		List<String> positions = new ArrayList<String>();
		String command = "";
		
		logger.info("사다리 정보를 입력하세요(x는 입력 완료).");
		while (true) {
			System.out.print("> " );
			command = scanner.nextLine();
			
			if ("X".equalsIgnoreCase(command)) {
				break;
			}
			
			if (!command.trim().equals("")) {
				positions.add(command);
			}
		}
		
		LadderGame ladderGame = new LadderGame(positions);
		PlayLadderGame playLadderGame = new PlayLadderGame(ladderGame);
		
		System.out.println("사다리 게임을 시작할 출발 지점을 입력하세요(x는 입력 완료).");
		while (true) {
			System.out.print("> " );
			command = scanner.nextLine();
			if ("X".equalsIgnoreCase(command)) {
				break;
			}
			
			logger.info("{}", playLadderGame.choice(command));
		}
		
		scanner.close();
	}

}
