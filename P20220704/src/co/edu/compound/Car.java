package co.edu.compound;
/*
 * 자동차(Object) -> class
 */
public class Car {       // ->설계도 
	
	// 클래스에서 속성을 표현-> 필드↓ 라고한다.
	String model;
	int price;
	int maxSpeed;
	int speed; 
	double weight;
	double width;
	
	//생성자: 필드의 초기값을 지정↓.
	public Car() {                            //매계값 X
		System.out.println("생성자 호출.");
		maxSpeed = 200;
	}
	public Car(String model, int maxSpeed) {  //매계값 0, 정수값 초기화해줌
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	//동작-> 메소드↓.
	public void setSpeed(int speed) {
		this.speed = speed; //this.~ = 인스던스에 할당한다~
	}
	public void showSpeed() {
		System.out.println("현제 속도는 " + speed + "km/h 입니다.");
	}
	public void run() {
		System.out.println(model + " 달립니다 ~!!");
	}
	
	public void start() {
		System.out.println(model + " 출발합니다. start!!");
	}
	
	public void stop() {
		System.out.println(model + " 멈춥니다. stop!!");
	}
}
