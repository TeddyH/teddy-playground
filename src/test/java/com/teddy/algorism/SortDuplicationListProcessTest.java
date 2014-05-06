package com.teddy.algorism;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.teddy.algorism.sortduplicationlist.process.SortDuplicationListProcess;

public class SortDuplicationListProcessTest {

	private SortDuplicationListProcess sdlp = new SortDuplicationListProcess();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLoadData() {
		sdlp.loadData();
	}

	@Test
	public void testFindUniqueData() {
		List<Integer> uniqueIntegers = sdlp.findUniqueData(sdlp.loadData());
		
		assertThat(uniqueIntegers, notNullValue());
	}

}
