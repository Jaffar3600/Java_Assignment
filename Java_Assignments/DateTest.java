import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DateTest {
private Date date;
//private Date date1;

	@Before 
	public void setUp(){
		date = new Date(17,12,2018);
		//givenDate = new Date(20,12,2019);
	}

    //Returning date Test
	@Test
	public void returnDateTest() {
		assertEquals("17/12/2018",date.toString());
	}
	
	//Comparing Two Dates if it is True
	@Test
	public void compareTwoDatesTestIfTrue(){
		assertEquals(true,date.isSmaller(date));
	}
	
	/*//comparing Two Dates if it is False
	@Test
	public void compareTwoDatesTestIfFalse(){
		assertEquals(false,date.isSmaller(date)); //----->Interchanging date positions for comparison
	}*/
	
	@Test
	public void comparingDateMonthYear(){
		int NewDate[] ={3,0,1};
		assertArrayEquals(NewDate,date.diff(date));
	}
	
}
