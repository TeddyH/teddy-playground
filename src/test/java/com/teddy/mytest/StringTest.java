package com.teddy.mytest;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringTest {
	
	private static final Logger logger = LoggerFactory.getLogger(StringTest.class);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConcat() {
		
		String str = "alfkjqweoijfovjnw";
		
		str = str.concat("모르지요.");
		
		logger.info("{}", str);		
	}

}
