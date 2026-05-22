package ecomm;

import org.testng.annotations.Test;

public class Customer {
	@Test
	public void createAccount() {
		System.out.println("customer create account");
	}

	@Test(groups = {"new upi"})
	public void login() {
		System.out.println("customer login");
	}

	@Test
	public void profileMange() {
		System.out.println("customer profile manage");
	}

	@Test
	public void changePassword() {
		System.out.println("customer password");
	}

	@Test
	public void logout() {
		System.out.println("customer logout");
	}
}
