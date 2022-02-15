package week1.day3;

public class Calculator {

	int d=120, e=15, f;
	
	public void addTwoNumber() {
		int a=31, b=10, c;
		c=a+b;
		System.out.println(c);
	}
	
	public void subTwoNumber()
	{
		int a=31, b=20, c;
		c=a-b;
		System.out.println(c);
	}
	
	public void mulTwoNumber()
	{
		f=d*e;
		System.out.println(f);
	}
	
	public void divTwoNumber()
	{
		f=d/e;
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		int g=100;
		Calculator calc=new Calculator();
		calc.addTwoNumber();
		calc.subTwoNumber();
		calc.mulTwoNumber();
		calc.divTwoNumber();
		System.out.println(calc.d);
		System.out.println(g);
	}
}
