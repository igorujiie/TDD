/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	Calculator calculator = new Calculator();

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}

	@Test
	@DisplayName("2 - 1 = 1")
	void subTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.sub(1, 1), "1 - 1 should equal 0");
	}

	@ParameterizedTest(name = "{0} - {1} = {2}")
	@CsvSource({
			"5,    2,   3",
			"4,    2,   2",
			"200,  100, 100",
			"1,  100, -99"
	})

	void sub(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.sub(first, second),
				() -> first + " - " + second + " should equal " + expectedResult);
	}


	@Test
	@DisplayName("2 * 1 = 2" )
	void multTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.mult(1, 1), "1 * 1 should equal 1");
	}

	@ParameterizedTest(name = "{1} * {1} = {1}")
	@CsvSource({
			"5,    2,   10",
			"4,    2,   8",
			"20,  10, 200",
			"5,  100, 500"
	})

	void mult(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.mult(first, second),
				() -> first + " * " + second + " should equal " + expectedResult);
	}



	@Test
	@DisplayName("2 / 1 = 2")
	void divTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.div(1, 1), "1 / 1 should equal 1");
	}

	@ParameterizedTest(name = "{1} / {1} = {1}")
	@CsvSource({
			"4,    4,   1",
			"4,    2,   2",
			"20,  10, 2",
			"35,  5, 7"
	})

	void div(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.div(first, second),
				() -> first + " / " + second + " should equal " + expectedResult);
	}







}
