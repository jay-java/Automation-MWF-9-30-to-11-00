package listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Demo {

	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		assertTrue(false);
		System.out.println("test 2");
	}
}
