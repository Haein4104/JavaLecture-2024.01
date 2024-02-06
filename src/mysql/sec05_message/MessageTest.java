package mysql.sec05_message;

import java.util.List;

public class MessageTest {

	public static void main(String[] args) {
		MessageDao msgDao = new MessageDao();
		
		Message msg = msgDao.getMessageByMid(101);
		System.out.println(msg);
		
//		msg = new Message("어지러워요ㅠㅠ", "마리아");
//		msgDao.insertMessage(msg);
		
		msg = msgDao.getMessageByMid(107);
		msg.setContent("MessageDao 프로그램을 완성시키고 싶어요.");
		msgDao.updateMessage(msg);
		
		msgDao.deleteMessage(107);
		
		List<Message> list = msgDao.getMessageByWriter("마리아");
		list.forEach(x -> System.out.println(x));

	}

}
