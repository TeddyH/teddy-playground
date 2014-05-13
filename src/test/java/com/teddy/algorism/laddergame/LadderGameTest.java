package com.teddy.algorism.laddergame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LadderGameTest {
	
	private static final Logger logger = LoggerFactory
			.getLogger(LadderGameTest.class);

	private LadderGameController ladderGameProcess = new LadderGameController();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInputLadderInfo() {
		List<String> ladderInfo = new ArrayList<String>();
		ladderInfo.add("1 1");
		ladderInfo.add("6 1");
		ladderInfo.add("9 1");
		ladderInfo.add("3 2");
		ladderInfo.add("5 2");
		ladderInfo.add("8 2");
		ladderInfo.add("4 3");
		ladderInfo.add("7 3");
		ladderInfo.add("10 3");
		ladderInfo.add("2 4");
		ladderInfo.add("6 4");
		ladderInfo.add("8 4");
		ladderInfo.add("3 5");
		ladderInfo.add("5 5");
		ladderInfo.add("7 5");
		
		LadderGame ladderGame = new LadderGame(ladderInfo);
	}

}
