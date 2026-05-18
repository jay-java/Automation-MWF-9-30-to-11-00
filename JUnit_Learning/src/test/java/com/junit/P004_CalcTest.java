package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P004_CalcTest {
	@Test
	public void addTest() {
		Calc c = new Calc();
		int actual = c.add(12, 34);
		int expected = 30;
		assertEquals(expected, actual);
	}
}
