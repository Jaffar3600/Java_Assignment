/*Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

Test the Program with different combinations test cases possible.

      <------ 4cm --------->
      ---------------------
      |					   |
 3cm  |					   | 3cm
      | 				   |   
      ---------------------
      <------ 4cm --------->

*/
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestRectangle {

	private Rectangle rectangle,rectangle2;
	
	
	//Testing for Area of Rectangle and comparing
	@Test
	public void comparingAreaOfRectangleAndComparing() {
		rectangle=new Rectangle(5,4);
		rectangle2=new Rectangle(5,4);
		//double areaOfRectangle = rectangle.areaOfrectangle();
		assertEquals(rectangle.areaOfRectangle(),rectangle2.areaOfRectangle(),8);
	}
	
	@Test
	public void comparingAreaOfReactangleIfLengthsAreDifferent(){
		
		rectangle=new Rectangle(6, 8);
		rectangle2=new Rectangle(6, 7);
		boolean result = rectangle.comparingAreaOfRectangle(rectangle,rectangle2);
		assertEquals(false,result);
		
	}
	
	@Test
	public void comparingAreaOfRea(){
		double expected=0;
		rectangle=new Rectangle(0, 0);
		double result = rectangle.areaOfRectangle();
		assertEquals(0,result,2);
		
	}
}
