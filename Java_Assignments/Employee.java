
public class Employee {
	private static int Id;
	private String Name;
	private double monthlyBasic;
	private static int pfRate;
	
	
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}

	public Employee(int Id,String Name,double monthlyBasic){
		this.Id=Id;
		this.Name=Name;
		this.monthlyBasic=monthlyBasic;
	}
	public static int getPfRate() {
		return pfRate;
	}

	public static void setPfRate(int pfRate) {
		Employee.pfRate = pfRate;
	}

	public double getPf(){
		double pf = (monthlyBasic * Employee.getPfRate())/100;
	if(pf <= 6500)  
		pf = 6500;
		return pf;
	}
	
	public double getEsic(){
		double esic = 0;
				if(monthlyBasic <= 5000)
					esic = (monthlyBasic * 4.75)/100;
				return esic;
				
	}
	public double getProfTax(){
		double profTax=0;
		if(monthlyGrossSalary() <= 5000)
			profTax = 50;
			profTax=100;
			return profTax;
		
	}
	public static int getId() {
		return Id;
	}

	public static void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	public double annualBasic() {
		// TODO Auto-generated method stub
	
		return 12 * monthlyBasic;
	}

	public double monthlyGrossSalary() {
		// TODO Auto-generated method stub
		final double medical = 1250;
		final double conveyance = 800;
		double hra= (monthlyBasic*50)/100;
		double monthlyGrossSalary= monthlyBasic + hra + medical +conveyance;
		return monthlyGrossSalary;
	}
	
	//Generating annualGrossSalary
	public double annualGrossSalary() {
		// TODO Auto-generated method stub
		double monthlyGrossSalary = 12 * monthlyGrossSalary();
		//System.out.println(monthlyGrossSalary);
		return monthlyGrossSalary;
	}

	//Generating monthlyDeductions
	public double monthlyDeductions() {
		// TODO Auto-generated method stub
		double monthlyDeductions = getPf() + getEsic() + getProfTax();
		//System.out.println(monthlyDeductions);
		return monthlyDeductions;
	}

	public double monthlyTakeHome() {
		// TODO Auto-generated method stub
		double monthlyTakeHome = monthlyGrossSalary() - monthlyDeductions(); 
		return monthlyTakeHome;
	}

	public double annualTakeHome() {
		// TODO Auto-generated method stub
		double annualTakeHome = 12 * monthlyTakeHome();
		return annualTakeHome;
	}

	
	

	

}
