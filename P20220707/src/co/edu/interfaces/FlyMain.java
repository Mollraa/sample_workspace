package co.edu.interfaces;

public class FlyMain {
	public static void main(String[] args) {
		
		Flyer flier = new Helicopter();
//		헬리콥터의 기능클래스  =  실행클래스
		flier = new Airplane();  
//		flier에 = airplane을 담음
		
		flier.takeOff();
		flier.fly();
		flier.land();
		
	}

}
