/*7)	Consider a CUI based application, where you are asking a user to enter his Login name and password, after entering the valid user-id and password it will
 print the message “Welcome” along with user name. As per the validation is concerned, the program should keep a track of login attempts. After three attempts a message 
should be flashed saying “Contact Admin” and the program should terminate. */
import java.util.Scanner;
class Validation
{
	public static void main(String[] args)
		{
		int count=0;
		String Name="Jaffar";
 		int Pw=707500;
		for(int i =1;i<=3;i++)
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name:-");
		String UserId=sc.nextLine();
		System.out.println("Enter Password:-");
		int Password = sc.nextInt();
		if(Name.equals(UserId) && Pw==Password)
		{
		System.out.println("Welcome "+ Name);
		break;
		}
		else
		{
		count++;
		System.out.println("Try Again...");
		}
		}	
 		if(count==3){
		System.out.println("Contact Admin... ");
		}
			
}
}