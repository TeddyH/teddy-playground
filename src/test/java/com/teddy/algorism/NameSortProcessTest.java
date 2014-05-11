package com.teddy.algorism;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.algorism.namesort.process.NameSortProcess;

public class NameSortProcessTest {
	
	private static final Logger logger = LoggerFactory.getLogger(NameSortProcessTest.class);
	
	public NameSortProcess nameSortProcess = new NameSortProcess();

	@Before
	public void setUp() throws Exception {
//		logger.info("test start");
	}

	@Test
	public void testGetArrayString() {
		
		String[] arrayName = nameSortProcess.getArrayString();
		
		for (String name : arrayName) {
			logger.info("name : {}", name);
		}
	}
	
	@Test
	public void testGetKim() {
		assertThat(nameSortProcess.howManyKim(), greaterThan(0));
	}
	
	@Test
	public void testGetLee() {
		assertThat(nameSortProcess.howManyLee(), greaterThan(0));
	}
	
	@Test 
	public void testHowManyLeeJaeYoung() {
		assertThat(nameSortProcess.howManyLeeJaeYoung(), greaterThan(0));
	}
	
	@Test 
	public void testPrintUniqueNames() {
		nameSortProcess.printUniqueNames();
	}
	
	@Test 
	public void testPrintAscendingUniqueNames() {
		nameSortProcess.printAscendingUniqueNames();
	}

}
