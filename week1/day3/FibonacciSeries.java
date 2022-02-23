package week1.day3;

public class FibonacciSeries {
		
	public static void main(String[] args) 
	{
		int first=0, second=1, sum=0; 
		
		int range=5;
		
		System.out.println(first);
		System.out.println(second);
		
		for(int num=1;num<=range;num++)
		{
			sum=first+second;
			
			System.out.println(sum);
			
			first=second;
			second=sum;
			
		}
	}
}
