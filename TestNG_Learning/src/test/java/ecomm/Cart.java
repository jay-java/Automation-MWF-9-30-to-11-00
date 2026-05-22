package ecomm;

import org.testng.annotations.Test;

public class Cart {
	@Test(groups = {"new upi"})
	public void addtocart() {

		System.out.println("add to cart");
	}

	@Test
	public void manageCart() {
		System.out.println("manage cart");
	}

	@Test
	public void removeFromCart() {
		System.out.println("remove from cart");
	}
}
