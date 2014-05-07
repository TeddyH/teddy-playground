package com.teddy.algorism.sortcharactercount.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.algorism.sortcharactercount.load.LoadEditorial;
import com.teddy.algorism.sortcharactercount.load.impl.StringBufferLoadEditorial;
import com.teddy.algorism.sortcharactercount.process.SortCharacterCountProcess;

public class SortCharacterCountMain {
	
	private static final Logger logger = LoggerFactory.getLogger(SortCharacterCountMain.class);
	
	private SortCharacterCountProcess sortCharacterCount = null;
	
	private LoadEditorial loadEditorial = null;
	
	public SortCharacterCountMain() {
		sortCharacterCount = new SortCharacterCountProcess();
	}

	public void initialize() {
		logger.info("## RUN MAIN! ##");
		
		// use StringBuffer
		loadEditorial = new StringBufferLoadEditorial();
		// 
		//loadEditorial = new FileLoadEditorial();
		
	}
	
	public void doit() {
		sortCharacterCount.doHashMapSort(loadEditorial);
	}
	
	public static void main(String[] args) {
		SortCharacterCountMain main = new SortCharacterCountMain();
		main.initialize();
		main.doit();
	}

}
