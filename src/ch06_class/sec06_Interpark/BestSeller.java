package ch06_class.sec06_Interpark;

public class BestSeller {

	public static void main(String[] args) {
		Interpark[] books = new Interpark[5];
		books[0] = new Interpark(1, "처음부터 시작하는 주식투자 단타전략", "홍인기", "길벗", "18,900");
		books[1] = new Interpark(2, "마흔에 읽는 쇼펜하우어", "강용수", "유노북스", "15,300");
		books[2] = new Interpark(3, "세이노의 가르침", "세이노", "데이원", "6,480");
		books[3] = new Interpark(4, "이처럼 사소한 것들", "Clair Keegan", "홍한별 역", "다산책방", "12,420");
		books[4] = new Interpark(5, "죽음이 물었다, 어떻게 살 거냐고", "한스 할터", "한윤진 역", "포레스트북스", "16,020");
		
		Interpark[] books2 = {
				new Interpark(1, "처음부터 시작하는 주식투자 단타전략", "홍인기", "길벗", "18,900"),
				new Interpark(2, "마흔에 읽는 쇼펜하우어", "강용수", "유노북스", "15,300"),
				new Interpark(3, "세이노의 가르침", "세이노", "데이원", "6,480"),
				new Interpark(4, "이처럼 사소한 것들", "Clair Keegan", "홍한별 역", "다산책방", "12,420"),
				new Interpark(5, "죽음이 물었다, 어떻게 살 거냐고", "한스 할터", "한윤진 역", "포레스트북스", "16,020")
		};
		for (Interpark book: books2)
			System.out.println(book);
		
	}

}
