package Yd_homework061;

public class HumanApp {
//	4) 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
//	- 출력결과
//		홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//		박둘이님의 신장 168, 몸무게 90, 비만입니다.
//	- 조건
//		변수는 Human 클래스 타입으로 선언하여 하나만 사용한다. ->강제형변환해라~ 명심하쟛!
	public static void main(String[] args) {
		Human hum = new StandardWeightInfo("홍길동", 168, 45); //생성자와 같은타입
		//Human에 있는 기능만 쓸 수있다.
		((StandardWeightInfo)hum).getStandarWeight(); //retrun avg값을 실행시켜줌
		//StandardWeightInfo기능을 쓰기위해서 강제형변환
		hum.getInformation(); //출력문
		System.out.println(); //가독성을위해 
		hum = new ObesityInfo("박돌이", 168, 90); //비만도
		((ObesityInfo)hum).getObesity(); // 형변환 해주고.Obe값을 받아온다.
		hum.getInformation();
		
	}
	

}
