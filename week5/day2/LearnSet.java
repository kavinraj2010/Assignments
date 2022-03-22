package week5.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void treeSet() {
		Set<String> companyName = new TreeSet<String>();
		companyName.add("Tcs");
		companyName.add("Wipro");
		companyName.add("Capgemini");
		companyName.add("Accenture");
		companyName.add("Cognizant");
		
		System.out.println("Before Add and Remove : "+companyName);
		//add
		companyName.add("Hcl");
		
		//remove
		companyName.remove("Accenture");
		
		System.out.println("After Add and Remove :"+companyName);
	}
	
	public static void linkedhashSet() {
		Set<Integer> companyId = new LinkedHashSet<Integer>();
		
		companyId.add(1023);
		companyId.add(8753);
		companyId.add(391);
		companyId.add(4587);
		companyId.add(220);

		System.out.println("Before Add and remove "+companyId);
		//add
		companyId.add(510);
		
		//remove
		companyId.remove(4587);
		System.out.println("After add and remove "+companyId);
	}
	
	public static void hashSet() {
		Set<String> companyId = new HashSet<String>();
		companyId.add("1023");
		companyId.add("8753");
		companyId.add("391");
		companyId.add("4587");
		companyId.add("220");
		
		System.out.println(companyId.contains("391"));
		System.out.println(companyId);
		
		System.out.println("Convert from Set to Lisy");
		
		List<String> get = new ArrayList<String>(companyId);
		
	}
	public static void main(String[] args) {
		hashSet();
		linkedhashSet();
		treeSet();
		
		
	}
}
