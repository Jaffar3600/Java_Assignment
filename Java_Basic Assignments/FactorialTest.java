import static org.junit.Assert.*;

import org.junit.Test;


public class FactorialTest{

	@Test
		public void factorialTest1(){
			Factorial factorial = new Factorial();
			int answer = factorial.factorials(5);
			assertEquals(120,answer);
		}
	@Test
	public void factorialTest2(){
		Factorial factorial = new Factorial();
		int answer = factorial.factorials(4);
		assertEquals(24,answer);
	}
		
	}


