package week1.day2;

public class ConvertPositive {

	public static void main(String[] args) {
		
		int a=-14;
		
		System.out.println("The given number is:"+a);
		
		if(a<0)
		{
			a=a*-1;
			System.out.println("The converted number is:"+a);
		}
		else
		{
			System.out.println("The given number:"+a+" is positive");	
		}
		
	}

}
