
public class MissingNum {

	public int missing(int number1, int number2, int number3) {
		// TODO Auto-generated method stub
		int arr[]={number1,number2,number3};
		int Current_Total = 0;
		for(int n = 0;n < arr.length ; n++){
			Current_Total = Current_Total+arr[n];
		}
		int Expected_Total= (arr.length*(arr.length+1))/2;
		int result = Expected_Total - Current_Total;
		
		return result;
	}

	public int missingNumb(int number1, int number2, int number3, int number4, int number5, int number6, int number7,
			int number8, int number9) {
		// TODO Auto-generated method stub
		int arr[]={number1,number2,number3,number4,number5,number6,number7,number8,number9};
		int Current_Total = 0;
		for(int n1 = 0;n1 < arr.length ; n1++){
			Current_Total = Current_Total+arr[n1];
		}
		int Expected_Total= (arr.length*(arr.length+1))/2;
		int result = Expected_Total - Current_Total;
		
		return result;
			}
}
