package extra_crawling.sec02_interpark_book;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		InterparkBookService  interparkBookService = new InterparkBookService();
		List<InterparkBook> list = interparkBookService.getBestSeller();
		list.forEach(x -> System.out.println(x));
		
		/* for (int i = n; i < 배열.길이; i++) {
		  배열변수 = 배열[i]
		
		 
		 배열변수.~~~~();*/
		
		// for(자료형 변수이름: 배열이름){ 인핸스드 for문
		//		변수이름.~~~~();  
		//}
		
	}

}
