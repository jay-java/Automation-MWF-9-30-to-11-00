package com.junit;

import org.junit.Test;

public class P002_Exception {
	@Test(expected = ArithmeticException.class)
	public void test1() {
		int i = 10 / 0;
		System.out.println("i = " + i);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		int i[] = { 1, 2, 3, 4, 5 };
		System.out.println(i[20]);
	}
}
