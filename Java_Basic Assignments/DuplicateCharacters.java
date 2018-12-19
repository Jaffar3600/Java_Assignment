import static org.junit.Assert.*;

import org.junit.Test;


public class DuplicateCharacters {

	@Test
	public void duplicateCharactersTest() {
		Duplicate duplicate = new Duplicate();
		String answer = duplicate.duplicateChar("abcabcabc");
		assertEquals("abc",answer);
		String answer1 = duplicate.duplicateChar("javaforschool");
		assertEquals("javforschl",answer1);
		String answer2 = duplicate.duplicateChar("Mississippi");
		assertEquals("Misp",answer2);
		String answer3 = duplicate.duplicateChar("Jaffar");
		assertEquals("Jafr",answer3);
	}

}
