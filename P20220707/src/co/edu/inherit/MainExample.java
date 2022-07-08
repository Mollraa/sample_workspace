package co.edu.inherit;

public class MainExample {
	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		phone.setModel("AnyCall");
		phone.setColor("red");
			
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();
		
		phone.turnOn();  //요고 두개는 자식이 추가한 속성
		phone.turnOff();
		
		phone.poweroff();
		
		//스마트폰기능
		SmartPhone sphone = new SmartPhone();
		phone.setModel("iphone");
		phone.setColor("silver");
		
		phone.powerOn();
		phone.poweroff();
		
		System.out.println("자동형변환 >>>>>>>>> ");
//		부모 > 자식. long <- int :자동형변환가능!, int <- long :강제형변환. (기능은 자식이 더크지만, 크기는 품을수있다)
//		CellPhone d2phone = new SmartPhone();
//		CellPhone dphone = new DmbCellPhone();
//		dphone.setModel("사과폰");
//		dphone.setColor("pink");
		CellPhone dphone = new DmbCellPhone("사과폰 ", "pink ",55);
		System.out.println(dphone.toString());
		
		

		CellPhone cphone = new CellPhone();
		cphone.setModel("LG");
		cphone.setColor("Gray");
		
		System.out.println(cphone.toString());  //부모클래스에있는 내용(메모리, 주소값)을 그대로 출력하겠ㅆ다~
		
		if (dphone instanceof DmbCellPhone) {          //dphone이 Dmbcellphone일때  (디엠비셀폰을) dcp로 실행해준다
			DmbCellPhone dcp = (DmbCellPhone) dphone; //컴파일오류x, 실행할때 오류날수있음 if사용해주기 
			dcp.powerOn();
			dcp.turnOn();  //하지만 자식의 기능은 사용불가
			dcp.poweroff();
		}
		}
	}

