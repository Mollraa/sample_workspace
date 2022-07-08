package co.edu.inherit;
/*
 * 상속: 자식이 부모를 선택 (extends)
 */
public class DmbCellPhone extends CellPhone{
	private int channel;  //추가속성
	public DmbCellPhone() {
		super(); //
	}
	public DmbCellPhone(String model, String color, int cahnnel) {
 		super(model, color);
		this.channel = channel;
	}
	
	public void turnOn() {
		System.out.println("dmb화면 on");
	}
	public void turnOff() {
		System.out.println("dmb화면 off");
	}
	//overriding (부모가 가진 기능을 자식이) 제정의.
	@Override  // 없어도 상관없지만 타입체크를 위해 적어두면 죠치
	public void bell() {
		System.out.println("전화와따~~ 전화와따~~ 전화와따~~");
	}
	
	
	@Override
	public String toString() {
		return "model명은 " + getModel() + ", 색상은 " + getColor() +", 채널은 "+ 55 + "입니다.";
	}
	
}
