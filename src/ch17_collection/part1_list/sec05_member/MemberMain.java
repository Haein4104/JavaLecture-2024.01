package ch17_collection.part1_list.sec05_member;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
	private static List<Member> list = new ArrayList<>();

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int age = 20 + (int) (Math.random() * 20);
			list.add(new Member(age, "이름" + i, Math.random() > 0.5 ? "남" : "여"));
		}
		for (Member m : list)
			System.out.println(m);
		System.out.println("===============================================");

		// 나이가 30세 초과인 멤버 리스트
		List<Member> mList = getMemberListAbove30();
		mList.forEach(x -> System.out.println(x));
		System.out.println("===============================================");

		// 남성멤버리스트
		List<Member> gList = getMemberListByGender("남"); //
		gList.forEach(x -> System.out.println(x));
		System.out.println("===============================================");

		// 멤버 추가
		Member member = new Member(39, "제임스", "남");
		insertMember(member);
		list.forEach(x -> System.out.println(x));
		System.out.println("===============================================");

		// 멤버 삭제
		deleteMember("제임스");
		list.forEach(x -> System.out.println(x));
		
		

	}

	// 나이가 30세 초과인 멤버 리스트
	static List<Member> getMemberListAbove30() {
		List<Member> mList = new ArrayList<>();
		for (Member m : list) {
			if (m.getAge() > 30)
				mList.add(m);
		}
		return mList;
	}

	// 남성멤버리스트
	static List<Member> getMemberListByGender(String gender) {
		List<Member> mList = new ArrayList<>(); // 빈 리스트 생성
		for (Member m : list) { // 멤버 리스트 불러옴
			if (m.getGender().equals(gender)) // 리스트 중 "남" 불러옴
				mList.add(m); // mList에 m(list)의 "남" 추가
		}
		return mList; // mList에 추가된 "남"을 반환(보여줌)
	}

	static void insertMember(Member member) {
		list.add(member);
	}

	static void deleteMember(String name) {
		Member member = null;
		for (Member m: list) {
			if (m.getName().equals(name)) {
				member = m;
				break;
			}
		}
		list.remove(member);
	}
	
	static void updatetMember(Member member) {
		int index = list.indexOf(member);
		if (index >= 0) {
			member.setAge(member.getAge() -1);
			list.set(index, member);
			
		}
	}
}