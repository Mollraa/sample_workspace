package co.edu.io.memo;

import java.io.Serializable; //직렬화 역직렬화 //꼭해주기

/*
 * 메모번호, 작성날짜 시간, 메모내용
 */
public class Memo implements Serializable {
	// 필드
	private int no;
	private String date;
	private String content;

	// 생성자. 클래스이름과 똑같은 메소드만든다고생각
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;

	}

	public Memo() {
	} // 기본생성자 . 소스->겟셋

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override // 소스->투스트링
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}

}
