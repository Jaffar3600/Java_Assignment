import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountryTest {

	private  Country country1,country2,country3;
	@Before
	public void setUp() {
		country1=new Country();
		country1.setCountryName("India");
		country1.setCountryArea(6000);
		country1.setCountryPopulation(90000);
		country2=new Country();
		country2.setCountryName("Bangladesh");
		country2.setCountryArea(10000);
		country2.setCountryPopulation(70000);
		country3=new Country();
		country3.setCountryName("japan");
		country3.setCountryArea(16000);
		country3.setCountryPopulation(80000);			
	}
	
	@Test
	public void findLargestArea()
	{
		Country country[]={country1,country2,country3};
		String answer=country1.isLargestArea(country);
		assertEquals("japan",answer);
	}
	

	@Test
	public void findLargestPopulation()
	{
		Country country[]={country1,country2,country3};
		String answer=country1.isLargestPopulation(country);
		assertEquals("India",answer);
	}
	
	@Test
	public void findLargestPopulationDensity()
	{
		Country country[]={country1,country2,country3};
		String answer=country1.isLargestPopulationDensity(country);
		assertEquals("India",answer);
	}
	
}


