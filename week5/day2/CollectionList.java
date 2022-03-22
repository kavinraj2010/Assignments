package week5.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {
	public static void arrayList() {
		List<String> number=new ArrayList<String>();
		number.add("100");
		number.add("500");
		number.add("300");
		number.add("700");
		number.add("200");
		number.add("800");
		number.add("400");
		
		System.out.println(number.size());
		System.out.println(number.get(4));
		
		Collections.sort(number);
		System.out.println("Ascending Order"+number);
		
		Collections.reverse(number);
		System.out.println("Descending Order"+number);
		
	}
	
	
	public static void linkedList() {
		List<String> name=new LinkedList<String>();
		name.add("Kavin");
		name.add("Ajith");
		name.add("Gowtham");
		name.add("Mahesh");
		name.add("Ramesh");
		name.add("Uvanees");
		name.add("Gokul");
		
		System.out.println(name.size());
		System.out.println(name.get(4));
		
		Collections.sort(name);
		System.out.println("Ascending Order"+name);
		
		Collections.reverse(name);
		System.out.println("Descending Order"+name);
		
	}
	public static void main(String[] args) {
				arrayList();
				linkedList();
	}
}
