package YD_homework062;

public class Movie extends Culture {
//	2) Movie 클래스를 정의한다.
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() 
//		: 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	private String gNum="영화";
	
	public Movie() {super();}
	public Movie(String title, int dNum, int actNum, int audNum, int score, String gNum) {
		super(title, dNum, actNum, audNum, score);
		this.gNum = gNum;
	}
	public Movie(String title, int dNum, int actNum, int audNum, int score) {
		super(title, dNum, actNum, audNum, score);
	}
	@Override
	public void getInformation() {  //부모가 없는 몸통내용을 완성시킴
		System.out.println(this.gNum+"제목: " + getTitle() + " | 참여감독 수: " + getdNum() + " | 참여배우 수: " 
	    + getActNum() + " | 관객수:" + getAudNum() + " | 총점: " + getScore() + " | 평점: " + getGrade());
	}
	
}
