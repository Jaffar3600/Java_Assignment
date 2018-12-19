/*8)	There is an Array which is of the size 15, which may or may not be sorted. You should write a program to accept a number and search if it in contained in the array   
(linear search)
.
Example: 
5	12	14	6	78	19	1	23	26	35	37	7	52	86	47
Value to be search is 19*/


import java.util.Scanner;
class ElementSearch
{
	public static void main(String[] args)
	{
	int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	System.out.println("Enter number to find...");
	Scanner sc = new Scanner(System.in);
	int Num = sc.nextInt();
		int i;
	for( i = 0;i<arr.length;i++)
		{
		if(arr[i]==Num){
		System.out.println("Entered number is there...");
		break;
		}
		}
		
		if(i==arr.length)
		{
		System.out.println("Entered number is NOT there...");
		}

}
	
}
