/*Attributes:
	Id
	name
	monthlyBasic
Behaviours/Interfaces/Services: 
	getAnnualBasic() //(return 12 * monthlyBasic;)
	getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
	getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
	getMonthlyDeductions() //(pf + esic + profTax)
	getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
	getAnnualTakeHome() //(12 * MonthlyTakeHome)
	setPFRate(float f)  and getPFRate()


HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
PF = 10% of  monthly basic or 6500 whichever is lower.
ESIC = 4.75% of monthly basic if monthly basic <= 5000
professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100*/




import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeesTest {
	
	private Employee employee;
	
	@Before
	public void setUp(){
		employee = new Employee();
		employee.setId(12345);
		employee.setName("Shaik Jaffar");
		employee.setMonthlyBasic(10000);
		employee.setPfRate(10);
	}

	//Testing for Annual Basic
	@Test
	public void getAnnualBasic() {
		//double range = 0.23;
		//employee.setMonthlyBasic(10000);
		double annualBasic = employee.annualBasic();
		assertEquals(120000,annualBasic,2);
	}
	
	//Testing for Monthly Gross Salary
	@Test
	public void monthlyGrossSalary() {
		//double range = 0.23;
		//employee.setMonthlyBasic(10000);
		double monthlyGrossSalary = employee.monthlyGrossSalary();
		assertEquals(17050,monthlyGrossSalary,2);
	}
	
	//Testing for Annual Gross Salary
	@Test
	public void getAnnualGrossSalary(){
		double annualGrossSalary = employee.annualGrossSalary();
		assertEquals(204600,annualGrossSalary,2);
	}
	
	//Testing for Monthly Deductions
	@Test
	public void getMonthlyDeductions(){
		double MonthlyDeductions=employee.monthlyDeductions();
		assertEquals(6600,MonthlyDeductions,2);
	}
	
	//Testing for Monthly Take Home Salary
	@Test
	public void getMonthlyTakeHome(){
		double monthlyTakeHome = employee.monthlyTakeHome();
		assertEquals(10450,monthlyTakeHome,2);
	}
	
	//Testing for annual Take Home Salary
	@Test
	public void getAnnualTakeHome(){
		double annualTakeHome = employee.annualTakeHome();
		assertEquals(125400,annualTakeHome,2);
	}
	
	
}
