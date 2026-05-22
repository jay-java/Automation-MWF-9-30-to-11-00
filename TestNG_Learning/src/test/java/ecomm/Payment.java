package ecomm;

import org.testng.annotations.Test;

public class Payment {

	@Test
	public void creditCard() {
		System.out.println("credit card");
	}

	@Test
	public void debitCart() {
		System.out.println("debit card");
	}

	@Test(groups = { "new upi" })
	public void UPI() {
		System.out.println("UPI");
	}
}
