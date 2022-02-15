package week1.day2;

public class Factorial{
	public static void main(String[] args) {
	
		int a=6, fact=1;
		
		for (int i = 1;i<=a ; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the given number is:"+fact);
	}

}
