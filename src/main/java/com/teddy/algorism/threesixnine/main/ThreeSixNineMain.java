package com.teddy.algorism.threesixnine.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.algorism.threesixnine.process.ThreeSixNineProcess;

public class ThreeSixNineMain {
	
	private static final Logger logger = LoggerFactory.getLogger(ThreeSixNineMain.class);
	
	public static void initialize() {
		logger.info("this is main.");
	}

	public static void main(String[] args) {
		initialize();
		new ThreeSixNineProcess().doProcess();
	}

}
