package Yd_homework061;

public class StandardWeightInfo extends Human{
//	2) StandardWeightInfo 클래스를 정의한다.
//	- Human 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//	(2) public double getStandardWeight() : 표준체중을 구하는 기능
//	( * 표준 체중 : (Height - 100) * 0.9 )
	private double avg; //받아온 값이랑 같이 구해줄 값
	
	public StandardWeightInfo () {}
	public StandardWeightInfo(String name, double hig, double wig) {
		super(name, hig, wig); //받아올값만 입력
	}
	public void getInformation() {
		super.getInformation(); //부모클래스값 받아와서
		System.out.print(", 표준체중: " + this.avg);
	}
	public double getStandarWeight() {
		avg = ((getHig() - 100) * 0.9); //표준체중 구하는 식 return 에담아둔 값은 여기서 출력 안된당
		return avg;
	}

}
