package com.teddy.algorism.laddergame;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

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
		
		LadderGame ladderGame = new LadderGame(getInputData());
		
		ladderGame.info();
		
		assertThat(ladderGame.getMaxHorizon(), equalTo(12));
		assertThat(ladderGame.getMaxVertical(), equalTo(6));
	}
	
	@Test
	public void testPlayGame() {
		LadderGame ladderGame = new LadderGame(getInputData());
		PlayLadderGame playLadderGame = new PlayLadderGame(ladderGame);
		
		ladderGame.info();
		
		assertThat(ladderGame.getMaxHorizon(), equalTo(12));
		assertThat(ladderGame.getMaxVertical(), equalTo(6));
		
		assertThat(playLadderGame.choice("6"), equalTo("3"));
		assertThat(playLadderGame.choice("1"), equalTo("6"));
		assertThat(playLadderGame.choice("3"), equalTo("5"));
	}
	
	private List<String> getInputData() {
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
		
		return ladderInfo;
	}

}
