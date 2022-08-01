package YD_homework062;

public class Performance extends Culture {
//	3) Performance 클래스를 정의한다.
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() 
//	: 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	private String hNum;

	public Performance() {
		super();
	}

	public Performance(String title, int dNum, int actNum, int audNum, int score, String hNum) {
		super(title, dNum, actNum, audNum, score);
		this.hNum = hNum;

	}

	public Performance(String title, int dNum, int actNum, int audNum, int score) {
		super(title, dNum, actNum, audNum, score);
	}

	@Override
	public void getInformation() {
		System.out.println("공연제목: " + getTitle() + " | 참여감독 수: " + getdNum() + " | 참여배우 수: " + getActNum() + " | 관객수: "
				+ getAudNum() + " | 총점: " + getScore() + " | 평점: " + getGrade());

	}
}