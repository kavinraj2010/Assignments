package week2.day1;

public class FindOccurence {
	public void occurence() {
		String str = "welcome to chennai";
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='e')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	public void anotherMethod() {
		String input="welcome to chennai";
		String replace = input.replace("e", "");
		
		System.out.println(input.length()-replace.length());
	}
	public static void main(String[] args) {
		FindOccurence get=new FindOccurence();
		get.occurence();
		get.anotherMethod();
	}
}
