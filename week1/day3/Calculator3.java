package week1.day3;

import java.util.Scanner;

public class Calculator3 {
	
	public void multipleTwoNumber(double a, double b)
	{
		System.out.println("Multiplication of two number is:"+a*b);
	}
	
	public void divideTwoNumber(float e,float f)
	{
		System.out.println("The division of two number is:"+e/f);
	}
	
	
	public static void main(String[] args) {
		Calculator3 val=new Calculator3();
		
		Scanner get=new Scanner(System.in);
		
		System.out.println("Enter the numbers for multiply:");
		double First=get.nextDouble();
		double Second=get.nextDouble();
		
		val.multipleTwoNumber(First, Second);
		
		System.out.println("Enter the numbers for division");
		float Third=get.nextFloat();
		float Fourth=get.nextFloat();
		
		val.divideTwoNumber(Third, Fourth);
	}

}
