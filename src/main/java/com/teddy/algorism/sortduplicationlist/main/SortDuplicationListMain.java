package com.teddy.algorism.sortduplicationlist.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.algorism.sortduplicationlist.process.SortDuplicationListProcess;

public class SortDuplicationListMain {
	
	private static final Logger logger = LoggerFactory.getLogger(SortDuplicationListMain.class);
		
	public static void main(String[] args) {
		logger.info("this is main!");
		
		SortDuplicationListProcess sortDuplicationListProcess = new SortDuplicationListProcess();
		sortDuplicationListProcess.doProcess();
	}

}
