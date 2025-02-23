package edu.psu.junit_01_intro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class UtilTest {

	private Util calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Util();
	}

	@Test
	@DisplayName("Simple multiplication should work")
	void testMultiply() {
		assertEquals(20, calculator.multiply(4,5), "Regular multiplication should work");
	}

	@RepeatedTest(5)
	@DisplayName("Ensure correct handling of zero")
	void testMultiplyWithZero() {
		assertEquals(0, calculator.multiply(0,5), "Multiple with zero should be zero");
		assertEquals(0, calculator.multiply(5,0), "Multiple with zero should be zero");
	}
	
}
