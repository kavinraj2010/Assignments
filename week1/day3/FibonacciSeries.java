package week1.day3;
import java.util.Scanner;

public class FibonacciSeries {
		
	public static void main(String[] args) 
	{
		int first=0, second=1, sum=0; 
		
		Scanner get=new Scanner(System.in);
		
		System.out.println("Enter range:");
		int range=get.nextInt();
		
		System.out.println(first);
		System.out.println(second);
		
		for(int num=2;num<=range;num++)
		{
			sum=first+second;
			
			System.out.println(sum);
			
			first=second;
			second=sum;
			
			
		}
		
	}
}
