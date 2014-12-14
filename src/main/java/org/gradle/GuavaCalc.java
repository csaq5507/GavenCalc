package org.gradle;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.common.math.BigIntegerMath;

public class GuavaCalc {

	private final static String FACT = "!";
	private final static String BIN = "choose";

	public String getInput() {
		System.out.println("-Guava simple calculator-");
		System.out
				.println("Insert a expression to be calculated[k!: Factorial, n choose k: binomial]");
		Scanner s = new Scanner(System.in);
		String exp = s.nextLine();
		return exp;
	}

	public BigInteger calc(String input) {
		if (input.indexOf(FACT) != -1) {
			return BigIntegerMath
					.factorial(Integer.valueOf(input.split(FACT)[0]));
		}
		if (input.indexOf(BIN) != -1)
			return BigIntegerMath
					.binomial(Integer.valueOf(input.split(BIN)[0].replace(' ',
							'0')) / 10, Integer.valueOf(input.split(BIN)[1]
							.replace(' ', '0')));
		throw new InputMismatchException(
				"Only following input is allowed: k!: Factorial, n choose k: binomial");
	}
}
