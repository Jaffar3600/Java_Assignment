import static org.junit.Assert.*;

import org.junit.Test;


public class Palindromee {

	@Test
		public void PalindromTest1(){
			Palindrom palindrom = new Palindrom();
			boolean answer = palindrom.Palindroms(121);
			assertEquals(true,answer);
	}
	
	@Test
	public void PalindromTest2(){
		Palindrom palindrom = new Palindrom();
		boolean answer = palindrom.Palindroms(-121);
		assertEquals(false,answer);
		}	
	
	@Test
	public void PalindromTest3(){
	Palindrom palindrom = new Palindrom();
	boolean answer = palindrom.Palindroms(10);
	assertEquals(false,answer);
	}	
	}