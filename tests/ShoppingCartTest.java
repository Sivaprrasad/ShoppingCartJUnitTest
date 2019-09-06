import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {
	
	//1.make 1 function per test case
	//2.put the @Test annotation on top of the class
	//3.Write code for your test case
	//4.Call assertEquals() in your test case
	//5.Run the program
	//6.look at the results

	@Test
	public void testCreateCart() {
		//**************************
		//assertEquals(expected,actual)
		//if expected == actual: return true
		//else: return false
		//assertEquals(1,1);
		//assertEquals(1,1);
		//fail("Not yet implemented");
		//****************************
		
		//1. Make a new cart.
		ShoppingCart cart = new ShoppingCart();
		
		//2. Check number of items in the cart
		int a = cart.getItemCount();
		
		//3. Do the asserts
		assertEquals(0,a);
		
	}
	
	@Test
	public void testEmptyTheCart() {
		
		//1. Make a new cart.
		ShoppingCart cart = new ShoppingCart();
		
		//2. Add item to the cart
		Product phone = new Product("iPhone", 1500);
		Product hamburger = new Product("burger", 10);
		
		cart.addItem(phone);
		cart.addItem(hamburger);
				
		//3. Remove item from the cart.
		cart.empty();
		
				
		//4. Check number of items in the cart 
		assertEquals(0, cart.getItemCount());
		
	}
	
	@Test
	public void testAddProductToCart() {
		
		//E1: When a new product is added, 
				//the number of items must be incremented  
		
		//E2: When a new product is added, 
				//the new balance must be the sum of the previous balance 
				//plus the cost of the new product  

	}

}
