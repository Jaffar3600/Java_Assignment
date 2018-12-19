import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	//private Calculator calculator;
	@Test
	public void testAddition() {
		//calculator = new Calculator();
		Calculator calculator = new Calculator();
		int answer = calculator.Addition(10,20);
		assertEquals(30,answer);
	}
	@Test
	public void AdditionOfTwoNegitiveIntegers() {
		//calculator = new Calculator();
		Calculator calculator = new Calculator();
		int answer = calculator.Addition(-10,-20);
		assertEquals(-30,answer);

}
		@Test
		public void subtractionOfTwoNumbers(){
			Calculator calculator = new Calculator();
			int answer = calculator.Subtraction(100,50);
			assertEquals(50,answer);
		}
		@Test
		public void subtractionOfTwoNegitiveNumbers(){
			Calculator calculator = new Calculator();
			int answer = calculator.Subtraction(-100,-50);
			assertEquals(-50,answer);
		}
		@Test
		public void MultiplicationOfTwoNumbers(){
			Calculator calculator = new Calculator();
			int answer = calculator.Multiplication(100,50);
			assertEquals(5000,answer);
		
}
		@Test
		public void MultiplicationOfTwoNegitiveNumbers(){
			Calculator calculator = new Calculator();
			int answer = calculator.Multiplication(-100,-50);
			assertEquals(5000,answer);
		
}
}