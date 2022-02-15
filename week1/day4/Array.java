package week1.day4;

public class Array {
	public static void main(String[] args) {
		
		int[] num={1,2,3,4,5,6,7,8,9,10};
		System.out.println(num.length);
		System.out.println("");
		
		/*for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			if(num[i]==5)
			{
				continue;
			}
		}*/
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
		
	}

}
