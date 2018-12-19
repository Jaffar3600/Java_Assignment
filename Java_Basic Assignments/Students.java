/*11)	Accept the marks of three students for the subject say A, B, C. Find the total scored and the average in all the subjects. Also Find the Total and 
       Average scored by students */

import java.util.Scanner;
class Students{
	public static void main(String[] args)
		{
		int avg_marks=0,total_marks=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++){
		System.out.println("Enter student "+i+ " marks:");
		System.out.println("Enter Physis marks:");
		int Phy=sc.nextInt();
		System.out.println("Enter Chemistry marks:");
		int Che=sc.nextInt();
		System.out.println("Enter Math marks:");
		int Math=sc.nextInt();
		int Avg=(Phy+Che+Math)/3;
		int total=Phy+Math+Che;
		System.out.println("Avg Marks of Student "+i+" is: "+Avg);
		System.out.println("Total Marks of Student "+i+" is: "+total);
		avg_marks=avg_marks+Avg;
		total_marks=total_marks+total;
		}
		
		System.out.println("Total Marks of all Students is: "+total_marks);
		System.out.println("Total avg Marks of all Students is: "+avg_marks);
		}
}