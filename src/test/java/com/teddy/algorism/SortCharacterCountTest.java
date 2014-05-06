package com.teddy.algorism;


import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import com.teddy.algorism.sortcharactercount.process.SortCharacterCountProcess;


public class SortCharacterCountTest {
	
	//private static final Logger logger = LoggerFactory.getLogger(SortCharacterCountTest.class);
	
	public SortCharacterCountProcess sortCharacterCount = new SortCharacterCountProcess();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAnalysisCharacterCount() {
		String editorial = "예전엔 HashMap에 바로 지원해 주는 메소드가 없어서 그냥 루프 돌리면서 List에 넣었었는데,오늘에서야 다시 한번 찾아보니 방법이 있었다. ";
		this.sortCharacterCount.analysisCharacterCount(editorial);
	}
	
	@Test
	public void testSortDescendingCharacterCount() {
		this.testAnalysisCharacterCount();
		this.testSortingValue();
		this.sortCharacterCount.sortDescendingCharacterCount();
	}
	
	@Test
	public void testSortAscendingCharacterCount() {
		this.testAnalysisCharacterCount();
		this.testSortingValue();
		this.sortCharacterCount.sortAscendingCharacterCount();
	}

	@Test 
	public void testSortingValue( ) {
		this.testAnalysisCharacterCount();
		List<Integer> sortedValues = this.sortCharacterCount.sortingValue();
		
		assertThat(sortedValues, notNullValue());
	}
	
	@Test
	public void testGetCharacterCountMap() {
		this.testAnalysisCharacterCount();
		assertThat(sortCharacterCount.getCharacterCountMap(), notNullValue());;
	}
}
