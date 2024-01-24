package ch17_collection.part1_list.sec03_MemberArray;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageMain {

	public static void main(String[] args) {
		List<Message> list = new ArrayList<>();

		// 객체 추가
		Message message = new Message(1, "hello", "james", LocalDateTime.now(), 0);
		list.add(message);
		list.add(new Message(2, "world", "maria", LocalDateTime.now(), 0));
		for (Message m : list)
			System.out.println(m);

		for (int i = 1; i <= 3; i++) {
			Message msg = new Message(2 + i, "내용" + i, "저자" + i, LocalDateTime.now(), 0);
			list.add(msg);
		}
		for (Message m : list)
			System.out.println(m);

		list = generateMessage();
		for (Message m : list)
			System.out.println(m);
		
		// 이름이 세 글자 이상인 사람의 글
		List<Message> newList = new ArrayList<Message>();
		for (Message msg: list) {
			if (msg.getWriter().length() >= 3)
				newList.add(msg);
		}
		for (Message m: newList)
			System.out.println(m);
	}

	// 메세지 객체를 3개 생성해서 리스트로 반환하기
	static List<Message> generateMessage() {
		List<Message> list = new ArrayList<Message>(); // 빈 리스트 생성
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) { // 새 메시지 작성
			System.out.print("저자> ");
			String writer = scan.nextLine();
			System.out.print("내용> ");
			String content = scan.nextLine();
			Message msg = new Message(i, content, writer, LocalDateTime.now(), 0);
			list.add(msg);
		}
		scan.close();
		return list;
	}

}
