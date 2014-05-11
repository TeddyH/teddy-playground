package com.teddy.refactoring.example;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerTest {
	private static final Logger logger = LoggerFactory.getLogger(CustomerTest.class);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStatementRegular() {
	
		Customer customer = new Customer("홍길동");
		customer.addRental(new Rental(new Movie("스파이더맨", Movie.REGULAR), 5));
		
		String result = customer.statement();
		printResult(result);
		assertThat(result, containsString("누적 대여료 : 6.5"));
		assertThat(result, containsString("적립 포인트 : 1"));
	}
	@Test
	public void testStatementNewRelease() {
		
		Customer customer = new Customer("홍길동");
		customer.addRental(new Rental(new Movie("역린", Movie.NEW_RELEASE), 10));
		
		String result = customer.statement();
		printResult(result);
		assertThat(result, containsString("누적 대여료 : 30.0"));
		assertThat(result, containsString("적립 포인트 : 2"));
	}
	@Test
	public void testStatementChildrens() {
		
		Customer customer = new Customer("홍길동");
		customer.addRental(new Rental(new Movie("RIO2", Movie.CHILDRENS), 15));
		
		String result = customer.statement();
		printResult(result);
		
		assertThat(result, containsString("누적 대여료 : 19.5"));
		assertThat(result, containsString("적립 포인트 : 1"));
	}
	
	private void printResult(String result) {
		logger.debug("{}", result);
	}

}
