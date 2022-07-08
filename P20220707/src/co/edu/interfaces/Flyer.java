package co.edu.interfaces;

public interface Flyer {
	//필드 없음.
	//생성자 없음.
	//메소드 규칙.  여기는 기능클래스 실행클래스에서 fly~ 요런거 똑같이 해야함
	
	public void takeOff(); //추상메소드(구현부분이 없음) 이륙하는 기능정의.
	public void fly();
	public void land();
	
}
