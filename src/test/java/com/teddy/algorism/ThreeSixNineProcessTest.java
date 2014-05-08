package com.teddy.algorism;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.algorism.threesixnine.process.ThreeSixNineProcess;

public class ThreeSixNineProcessTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ThreeSixNineProcessTest.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckText() {
		ThreeSixNineProcess threeSixNineProcess = new ThreeSixNineProcess();
		String clapping = threeSixNineProcess.checkText(3);
		assertThat(clapping, notNullValue());

		logger.info("{}", clapping);
	}

}
