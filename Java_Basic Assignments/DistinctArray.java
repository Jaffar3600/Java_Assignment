
public class DistinctArray {

	public boolean distinctCheck(int[] numbers, int k) {
		// TODO Auto-generated method stub
		int count,count1,answer =0;
		for(count=0;count<numbers.length;count++)
		{
			for(count1=1;count1<numbers.length;count1++)
			{
				if(count== count1)
				{ 
					
				}
				else if(numbers[count]==numbers[count1])
				{
					
					answer = count1-count;
					System.out.println(answer);
					if(k >= (count1-count))
						return true;
				}
			}
		}
	return false;
	}

}
