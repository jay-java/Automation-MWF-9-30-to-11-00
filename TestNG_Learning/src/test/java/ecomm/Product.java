package ecomm;

import org.testng.annotations.Test;

public class Product {

	@Test
	public void uploadProduct() {
		System.out.println("seller upload product");
	}

	@Test
	public void manageProduct() {
		System.out.println("seller manage product");
	}

	@Test
	public void removeProduct() {
		System.out.println("seller remove product");
	}

	@Test(groups = { "new upi", "xyz" })
	public void searchProduct() {
		System.out.println("customer search product");
	}

	@Test
	public void filterProduct() {
		System.out.println("customer filter product");
	}
}
