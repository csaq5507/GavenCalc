package org.gradle;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class CalcTest {
	@Test
	public void testFactorial() {
		GuavaCalc person = new GuavaCalc();
		assertEquals(new BigInteger("479001600"), person.calc("12!"));
	}

	@Test
	public void testBinomial() {
		GuavaCalc person = new GuavaCalc();
		assertEquals(new BigInteger("8145060"), person.calc("45 choose 6"));
	}
}
