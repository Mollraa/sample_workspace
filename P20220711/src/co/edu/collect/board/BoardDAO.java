package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;

/*
 * 목록 등록 조회(작성자) 삭제
 */
public class BoardDAO {
	// 싱글톤.
	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() {
		list = new ArrayList();
	}

	public static BoardDAO getInstance() {
		return instance;
	}
	
	// 1.목록
	public List<Board> boardList() {
		return list;
	}
	
	// 2.등록
	public void add(Board board) {
		list.add(board);
	}
	
	// 3.조회(작성자)
	public List<Board> search(String writer) {
		List<Board> list = new ArrayList<>(); // 찾고자 하는 이름=> 리스ㅌ.//반환해줄 변수선언
		
		for (Board board : this.list) { // 확장for
			if (board.getWriter().equals(writer)) {
				list.add(board);
			}
		}
		return list;
	}
	
	// 4.삭제(제목)
	public void remove(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) { // 같은제목있는지 확인하는 작업
				list.remove(i);
				break;
			}
		}
	}
}
