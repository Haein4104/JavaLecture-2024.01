package mysql.sec05_message;

import java.util.List;

public interface MessageService {
	int DELETED = 1;
	
	Message findByMid(int mid);
	
	List<Message> getMessageListAll();
	
	List<Message> getMessageListByWriter(String writer);
	// writer 별 메세지 목록
	
	void insertMessage(Message message);		// 메세지 입력
	
	void updateMessage(Message message);		// 메세지 추가
		
	void deleteMessage(int mid);				// 메세지 삭제

	void close();

}
