import static org.junit.Assert.*;

import org.junit.Test;


public class MissingNumber {

	@Test
	public void MissingNumberTest() {
		
		MissingNum missingnum = new MissingNum();
		
		int answer = missingnum.missing(3,0,1);
		
		assertEquals(2,answer);
		
		int answer1 = missingnum.missingNumb(9,6,4,2,3,5,7,0,1);
		
		assertEquals(8,answer1);
	}

}
