package YD_homework062;

public abstract class Culture { //추상클래스 = 추상메소드 , 추상메소드가 합쳐진게 인터페이스
//	Question 3]
//			1) Culture 클래스를 정의한다.
//			- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//			- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//			- 메소드는 다음과 같이 정의한다.
//			(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//			(2) public String getGrade() : 평점을 구하는 기능
//			(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	private String title; 
	private int dNum;
	private int actNum;
	private int audNum = 0;
	private int score = 0;
	
	public Culture() {super();}
	
	public Culture(String title, int dNum, int actNum, int audNum, int score) {
		super();
		this.title = title;
		this.dNum = dNum;
		this.actNum = actNum;
		this.audNum = audNum;
		this.score = score;
	}
//		public Culture(String title, int dNum, int actNum, int score, int audNum) {
//			super();
//			this.title = title;
//			this.dNum = dNum;
//			this.actNum = actNum;
//			this.score = score;
//			this.audNum = audNum;
//	}
	public void setTotalScore(int score) { //()값 맞춰주기
		audNum ++;
		this.score += score; //score 실행문에서 들어갈 값
		System.out.println("총점: " + score);
	}
	public String getGrade() {
		int avg = score / audNum;  //평균
		String star = ""; //별을 출력할 공간
		for(int i=0; i < avg; i++) { //평균값 
		star += "☆"; //☆값을 누적시켜줌
		}
		return star;
	}
	
	public abstract void getInformation(); //☆☆☆☆☆☆
	//애들은 몸이 없다. 머리만 있다. = abstract. 클래스랑 같은 값해줘야함
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getdNum() {
		return dNum;
	}
	public void setdNum(int dNum) {
		this.dNum = dNum;
	}
	public int getActNum() {
		return actNum;
	}
	public void setActNum(int actNum) {
		this.actNum = actNum;
	}
	public int getAudNum() {
		return audNum;
	}
	public void setAudNum(int audNum) {
		this.audNum = audNum;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Culture [title=" + title + ", dNum=" + dNum + ", actNum=" + actNum + ", audNum=" + audNum + ", score="
				+ score + "]";
	}
	
	
	
}
