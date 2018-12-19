import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TrinagleTest {
private Triangle triangle;

@Before
public void setUp(){
	triangle = new Triangle();
}

	@Test
	public void IsoscelesTriangleTest1() {
		boolean result =triangle.IsoscelesTriangle(10,10,30);
		assertEquals(true,result);
	}
	
	@Test
	public void IsoscelesTriangleTest2(){
		boolean result =triangle.IsoscelesTriangle(10,30,30);
		assertEquals(true,result);
	}
	
	@Test
	public void IsoscelesTriangleTest3(){
		boolean result =triangle.IsoscelesTriangle(11,30,11);
		assertEquals(true,result);
	}
	
	@Test
	public void isScaleneTest1(){
		boolean result = triangle.scaleneTriangle(10,20,30);
		assertEquals(true,result);
	}

	@Test
	public void isScaleneTest2(){
		boolean result = triangle.scaleneTriangle(30,20,10);
		assertEquals(true,result);
	}
	
	@Test
	public void isScaleneTest3(){
		boolean result = triangle.scaleneTriangle(30,20,30);
		assertEquals(false,result);
	}
	
	@Test
	public void isEquilateralTest1(){
		boolean result = triangle.equilateralTriangle(10,10,10);
		assertEquals(true,result);
	}
	
	@Test
	public void isEquilateralTest2(){
		boolean result = triangle.equilateralTriangle(10,150,10);
		assertEquals(false,result);
	}
	
	@Test
	public void isRightTest1(){
		boolean result = triangle.isRightTriangle(5,3,4);
		assertEquals(true,result);
	}
	
	@Test
	public void isRightTest2(){
		boolean result = triangle.isRightTriangle(3,4,5);
		assertEquals(true,result);
	}
	
	@Test
	public void isRightTest3(){
		boolean result = triangle.isRightTriangle(5,4,3);
		assertEquals(true,result);
	}
	
	@Test
	public void isRightTest4(){
		boolean result = triangle.isRightTriangle(5,4,3);
		assertEquals(true,result);
	}
	
	@Test
	public void isRightTest5(){
		boolean result = triangle.isRightTriangle(5,5,5);
		assertEquals(false,result);
	}
	
	@Test
	public void isRightTest6(){
		boolean result = triangle.isRightTriangle(1,2,3);
		assertEquals(false,result);
	}
}
