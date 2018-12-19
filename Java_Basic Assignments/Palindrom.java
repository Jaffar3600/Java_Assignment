
public class Palindrom {

	public boolean Palindroms(int number) {
		// TODO Auto-generated method stub
		int remainder,sum=0;
		int temp = number;
		while(temp>0){
			remainder=i%10;
			sum = (sum*10)+remainder;
			temp=temp/10;
		}
		return sum==number;
	}

}
