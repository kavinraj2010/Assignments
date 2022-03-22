package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		int[] numbers= {4,6,7,2,3,1,9,10,8,8,6};
		
		//Set removes the duplicate Values
		Set<Integer> val=new TreeSet<Integer>();
		
		//TreeSet arrange the values in a order.
		for(int i=0; i<numbers.length; i++)
		{			
			val.add(numbers[i]);
		}
		System.out.println(val);
		System.out.println("Size of the set :"+val.size());
		
		List<Integer> listval=new ArrayList<Integer>(val);
	
		
		
		for (int i = 1; i < listval.size(); i++) {
			//System.out.print(i);
			
			if(listval.get(i-1)!=i)
			{
				System.out.println("The missing number is : "+i);
				break;
			}
			
		}
	}
}
