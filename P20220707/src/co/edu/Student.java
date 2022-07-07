package co.edu;
/*
 * 클래스 연습  StudentMain사용.
 */
public class Student {
	//필드.
	private String sno;
	private String name;
	private int score;
	
	//생성자: 기본생성자--------
	public Student() {}
	
	
	//생성자 오버로딩/.
	public Student(String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
		
	}
	
	
	//getter, setter----   //void = 굳이 반환할 값이 없을때 사용
	public void setSno(String sno) {  //학번의 값 대입 (string sno 변수의 sno라고 우선인식해줌)
		this.sno = sno;     //변수로들어온 sno를 메소드에 담는다
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setScore(int score) {
		this.score = score;  
	}
	
	public String getSno() {    //학번을 반환.
		return this.sno;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	//전체정보를 보여주는 showInfo()
	public void showInfo() {
		System.out.printf("학번: %s , 이름: %s , 점수: %d\n" , sno, name, score);
	}
	
}
