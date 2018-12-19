
import java.util.Scanner;
class IncomeTax
{
	public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Income: ");
		int income = sc.nextInt();
		if(income >= 0 && income <=180000)
			{
			System.out.println("Payable Tax is Nill...");
			}
		if(income >= 181001 && income <= 300000)
			{
			System.out.println("Payable Tax is:"+ income*0.1);
			} 
		if(income >= 300001 && income <= 500000)
			{
			System.out.println("Payable Tax is:"+ income*0.2);
			}
		if(income >= 500001 && income <= 1000000)
			{
			System.out.println("Payable Tax is:"+ income*0.3);
			}
		}	
}