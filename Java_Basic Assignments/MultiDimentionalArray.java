
public class MultiDimentionalArray {

	public boolean findingNumber(int Number, int[][] array) {
		// TODO Auto-generated method stub
		boolean result=false;
		for(int number1 = 0;i < array.length;number1++)
		{
			for(int number2 = 0;j < array[0].length; number2++){
				if(array[number1][number2]== Number){
					result = true;
				}
			}
		}
		
		return result;
	}

}
