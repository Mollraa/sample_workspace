package co.edu.compound;

/*
 *  이름, 연락처, email, 생일, 키, 몸무게: 
 */
public class Friend {

	// 필드. 명명규칙(소문자, camelCase, 영문먼저, 특수문자 앵간하면no!! ( = 변수선언규칙과 같다))
	private String fullName; // private-> 접근제한자, 외부에 보여주지않을때 쓰는거
	private String phone;
	private String mail;
	private String birth;
	private double height;
	private double weight;

	// 생성자: 기본생성자를 생성
	public Friend() {
		System.out.println("생성자를 호출");
	}

	// set메소드. (이름, 연락처를 보여주는 showInfo() 정의해보기)  //메소드는 private nono~
	public void showInfo() {
		System.out.printf("이름: %s, 연락처는 %s", fullName, phone);
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}
	public void setMail (String mail) {
		this.mail = mail;
	}
	public void setBirth (String birth) {
		this.birth = birth;
	}
	public void setHeigth(double height) {
		if (height < 0) {
			System.out.println("잘못된 키 값입니다 !!");
			this.height = 0.0;
		} else {
			this.height = height;
		}
	}
	public void setWeight (double weight) {
		if(weight > 0) {
			System.out.println("잘못된 몸무게 값입니다 !!");
			this.weight = weight;
		} else {
			this.weight = 00;
		}
	}
	//get메소드..(값을 잘못입력했을때 다시 입력하라는 구문)
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	
}
}
