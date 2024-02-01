//		2) james, maria 두 객체를 ArrayList로 만들어 반환하는 메소드 getMemberList() 를 만드세요.[20]
//		3) 2)에서 만든 객체의 전화번호를 변경한 후 두 객체를 출력하세요
package Quiz.Quiz02;

import java.util.ArrayList;
import java.util.List;

public class MemberArrayListMain {

	public static void main(String[] args) {
//		List<Member> members = new ArrayList<Member>();
//		 members.add(new Member(1, "james", 1985, "010-1234-5678"));
//		 members.add(new Member(2, "maria", 1989, "010-9876-5432"));
//		 
//		 System.out.println(members);
		 
		 System.out.println(getMemberList());
		
				
		// new Meber[빈자리];
		// 자료형[] 변수이름 = new 자료형[빈자리];
		// 리스트<자료형> 변수이름 = new ArrayList<>(); <- 얘는 지금부터 ArrayList 라는 새로운 친구다 
//		System.out.println(members[0]);
//		System.out.println(members[1]);
		
//		for (int i = 0; i <= 1; i++) {
//			System.out.println(members[i]);
//		}
		
		// 모든 코드의 특징 : 지역변수(자기 안에서만 유효)
//		List<Member> members = getMemberList();
//		for (Member member: members) {		
////			// 자료형(Member)인 data 안에 members(배열)라는 상자안에 넣었으니
////			// 다시 받을 때도 똑같은 자료형으로 받아라 member로
//			System.out.println(member);
//		}
		
		
	}
	
	public static List<Member> getMemberList() {
		List<Member> members = new ArrayList<Member>();		// 구현할 객체 ArrayList를 new함
		members.add(new Member(1, "james", 1985, "010-1234-5678"));
		members.add(new Member(2, "maria", 1989, "010-9876-5432"));
		
		for (Member m: members) {
			if (m.getMid() == 1){
				m.setTel("010-5555-6666");
			}
			else m.setTel("010-1111-2222");
		}
		
		return members;			// return 타입 members 를 반환
	}

}
