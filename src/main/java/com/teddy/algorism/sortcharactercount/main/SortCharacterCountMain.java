package com.teddy.algorism.sortcharactercount.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.algorism.sortcharactercount.biz.SortCharacterCount;

public class SortCharacterCountMain {
	
	private static final Logger logger = LoggerFactory.getLogger(SortCharacterCountMain.class);
	
	private SortCharacterCount sortCharacterCount = null;
	
	public SortCharacterCountMain() {
		sortCharacterCount = new SortCharacterCount();
	}

	public void initialize() {
		logger.info("## RUN MAIN! ##");
	}
	
	public void doit() {
		sortCharacterCount.doHashMapSort();
	}
	
	public static void main(String[] args) {
		SortCharacterCountMain main = new SortCharacterCountMain();
		main.initialize();
		main.doit();
	}

}
