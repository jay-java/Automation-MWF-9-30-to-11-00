package com.junit;

import org.junit.Ignore;
import org.junit.Test;

public class P001_Basic {

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
//	@Ignore
	public void test2() {
		System.out.println("test 2");
	}

	@Test
	public void test3() {
		System.out.println("test 3");
	}
}
