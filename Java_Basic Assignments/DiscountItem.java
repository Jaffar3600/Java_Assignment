/*Write a Java assignment statement to calculate a 35% discount on an item�s value 
 * stored in the variable newItem, store the discount amount in a variable called 
 * discount. 
Then calculate the new price for the item subtracting off the discount, storing the 
 * new price in a variable called newItemPrice.
 */
public class DiscountItem {

	public double discountPrice(int price) {
		// int Auto-generated method stub
	    double newItem = price;
		double discount = (newItem*35)/100;
		//System.out.println(discount);
		double newItemPrice = newItem - discount;
		
		return newItemPrice;
	}

}
