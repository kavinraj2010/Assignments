package week5.day4;

public class PrintPrimeNumber1to10 {
	public static void main(String[] args) {
		int given=15;
				
		for (int i = 1; i <= given; i++) 
		{
			int count=0;
			for (int j = 1; j <= i; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
