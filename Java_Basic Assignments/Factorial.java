
public class Factorial {

	public int factorials(int number) {
		// TODO Auto-generated method stub
		int answer=1;
		for(int count=1;count<=number;count++){
			answer=count*answer;
		}
		return answer;
	}

}
