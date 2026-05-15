package com.testng;

import org.testng.annotations.Test;

public class P003_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
	public void test() {
		int i = 10 / 0;
		System.out.println("i = " + i);
		System.out.println("test method");
	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void test1() {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a[10]);
	}
}
