package co.edu.inherit;
/*
 * 상속 (부모<-자식)
 * CellPhone <- DmbCellPhone
 */
public class CellPhone extends Object { // extends Object따로 안적어도 부모클래스는 오브젝을 기본적으로갖고있음
	//field
	private String model;
	private String color;

	//constructor (생성자)  //부모클래스에 기본생성자가 없으면 자식도 못쓰기떄문에 꼭써주깅
	public CellPhone() {} //default constructor
	public CellPhone(String model, String colcr) {
		this.model = model;
		this.color = color;
	}
	public void powerOn() {
		System.out.println("전원이 켜졌습니다. have a good day ~ ^^ ");
	}
	public void poweroff() {
		System.out.println("전원이 꺼집니다...꼬르륵.. end...");
	}
	public void bell() {
		System.out.println("따르르릉 따르르르르릉");
	}
	public void sendVoice() {
		System.out.println("메세지전송!!");
	}
	public void receiveVoice() {
		System.out.println("메세지수신..");
	}
	
	//get set
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//제정의
	@Override
	public String toString() {
		return "model명은 " + model + ", 색상은 " + color + "입니다.";
	}
	
}
