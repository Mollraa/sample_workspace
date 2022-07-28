package Yd_homework061;

public class ObesityInfo extends StandardWeightInfo{
//	3) ObesityInfo 클래스를 정의한다.
//	- StandardWeightInfo 클래스를 상속한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//	(2) public double getObesity() : 비만도를 구하는 기능
//	( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
//
		private double mbi;
		
		public ObesityInfo () {}
		public ObesityInfo(String name, double hig, double wig) {
			super(name, hig, wig);
		}
		public void getInformation() {
			System.out.print("이름: " + getName() + ", 키: " + getHig() + ", 몸무게: " + getWig());
			//super.getInformation(); //요기서 프린트해줘서  // 표준체중 안나오게 함 
			System.out.println(", 비만도는: " + mbi + "입니다."); //요기서 부텨씀
		}
		public double getObesity() { //아래 값을 여기 담아준다.
			mbi = ((getWig() - getStandarWeight()) / getStandarWeight() * 100);
		//표준체중은= (Human에서 상속받은 몸무게와 St에서 받아온 표준체중 연산 먼저하고) 나머지 연선해쥼
			return mbi; //viod를 안썼기 때문에 return으로 값을 받아준당.
		}
		
}
