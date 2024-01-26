/* 게시물 가져오는 클래스
 * BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴함.
 * ListExample 클래스를 실행시켰을 때 다음(제목-내용)과 같이 출력되도록
 * BoardDao의 getBoardList() 메소드를 작성하기.
*/
package ch17_collection.Quiz01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
/*		
 * 		선생님 방법
 * 		this.list.add(new Board("제목1", "내용1"));
 * 		this.list.add(new Board("제목2", "내용2"));
 *  	this.list.add(new Board("제목3", "내용3"));
 */
		return list;
	}

}
