package Yd_homework061;

public class Human {
//	Question 2]
//			1) Human 클래스를 정의한다.
//				- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//				- 메소드는 다음과 같이 정의한다.
//				(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
	private String name;
	private double hig;
	private double wig;

	public Human() {
	}

	public Human(String name, double hig, double wig) {
		this.name = name;
		this.hig = hig;
		this.wig = wig;
	}

	public String getName() {
		return name;
	}

	public double getHig() {
		return hig;
	}

	public double getWig() {
		return wig;
	}

	public void getInformation() {
		System.out.print("이름: " + name + ", 키: " + hig + ", 몸무게: " + wig);
	}

}
