package com.testng;

import org.testng.annotations.Test;

public class P004_Depedency {
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create account");
	}

	@Test(priority = 2)
	public void login() {
		int i = 10 / 0;
		System.out.println("login");
	}

	@Test(priority = 3, dependsOnMethods = { "login" })
	public void changePassword() {
		System.out.println("change password");
	}
}
