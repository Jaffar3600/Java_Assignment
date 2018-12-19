import java.util.Scanner;
public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number to find given number is Armstrong Num or not...");
          	int num = sc.nextInt();
          	int s1=num,len=0;
          	while(s1!=0){
          		len=len+1;
          		s1=s1/10;
          	}
          	//System.out.println(len);
          	int s2=num,rem,sum=0,mul=1;
          	while(s2!=0){
          		rem=s2%10;
          		for(int i =1;i<=len;i++){
          			mul=mul*rem;
          		}
          		sum=sum+mul;
          		s2=s2/10;
          		mul=1;
          	}
          	if(sum==num){
          	System.out.println("Given number is Armstrong...");
          	}
          	else{
          		System.out.println("Given number is not an Armstrong Number...");
          	}
	}

}
