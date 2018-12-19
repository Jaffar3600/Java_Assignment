import static org.junit.Assert.*;

import org.junit.Test;


public class Discount {
	
	@Test
	public void discountTest() {
		double range = 0.23;
		DiscountItem discount = new DiscountItem();
		double answer = discount.discountPrice(123);
		assertEquals(80,answer,range);
		
	}
	@Test
	public void discountTest1() {
		double range = 0.23;
		DiscountItem discount = new DiscountItem();
		double answer = discount.discountPrice(100);
		assertEquals(65,answer,range);
		
	}
	

}
