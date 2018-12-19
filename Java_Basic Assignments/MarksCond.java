import java.util.Scanner;
public class MarksCond {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject-1 Marks:-");
		int A = sc.nextInt();
		System.out.println("Enter Subject-2 Marks:-");
		int B = sc.nextInt();
		System.out.println("Enter Subject-3 Marks:-");
		int C = sc.nextInt();
		int result = A+B+C;
		System.out.println(result);
		if(A>60 && B>60 && C>60)
		{
			System.out.println("Passed");
		}
		else if(A>60 && B>60 || A>60 && C>60 || B>60 && C>60)
                {
		System.out.println("Promoted");
		}
		else
		{
		System.out.println("Failed");
		}
		
	}

}
