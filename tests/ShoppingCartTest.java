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

		// ITERATION 2 - OF THE TEST CASE
		 //* *@TODO: NOTE: MUST CHECK BALANCE BEFORE HAND 
		 //* *@TODO: NOTE: CHECK THE NUMBER OF ITEMS BEFORE?
		 // 1. MAKE A SHOPPING CART
		ShoppingCart cart = new ShoppingCart();
				
		 //* 2. MAKE A PRODUCT(X 2!)
		Product phone = new Product("iPhone", 1500);
		
		 //* 3. CHECK BALANCE IN THE CART BEFORE ADDING PRODUCT - PREV BAL
		double startBalance = cart.getBalance();
		assertEquals(0, startBalance, 0.01);
		
		
		 //* 4. CHECK NUM ITEMS IN CART BEFORE ADDING PRODUCT
		int numItems = cart.getItemCount();
		assertEquals(0, numItems);
		
		
		 //* 5. ADD THE PRODUCT TO THE CART
		 //* 6. CHECK THE NUMBER OF ITEM IN THE CART
		 //* 			--EO: NUM ITEMS +1
		 //* ----------------------------------------------
		 //* 7. CHECK THE UPDATED BALANCE OF THE CART
		 //* 		--EO: PREVIOUS BALANCE + PRICE OF PRODUCT
		 
	}

}
