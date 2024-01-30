package ch17_collection.part2_set;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_TreeSet {	// TreeSet 객체를 순서대로 정리해줌

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10); set.add(6); set.add(15); set.add(12); set.add(4); set.add(20);
		System.out.println(set);
		
		Set<String> strSet = new TreeSet<String>();
		strSet.add("G"); strSet.add("B"); strSet.add("D"); strSet.add("H"); strSet.add("F");
		System.out.println(strSet); 


	}

}
