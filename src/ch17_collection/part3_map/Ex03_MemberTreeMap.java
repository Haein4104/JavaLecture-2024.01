package ch17_collection.part3_map;

import java.util.Map;
import java.util.TreeMap;

import ch17_collection.part2_set.sec12_member.Member;

public class Ex03_MemberTreeMap {	// hashmap은 새로 생성, treemap은 덮어씌움

	public static void main(String[] args) {
		Map<Integer, Member> map = new TreeMap<Integer, Member>();
		map.put(101, new Member(21, "james"));
		map.put(102, new Member(25, "maria"));
		map.put(103, new Member(29, "brian"));
		map.forEach((k, v) -> System.out.println(k + ", " + v));
		
		Map<Member, Integer> map2 = new TreeMap<Member, Integer>();
		map2.put(new Member(21, "james"), 100000);
		map2.put(new Member(25, "maria"), 300000);
		map2.put(new Member(29, "brian"), 150000);
		map2.put(new Member(21, "james"), 200000);
		map2.forEach((k, v) -> System.out.println(k + ", " + v));

	}

}
