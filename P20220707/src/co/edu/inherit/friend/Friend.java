package co.edu.inherit.friend;

public class Friend {
	private String name;
	private String phone;
	
	//생성자 = 소스-> 제너레이터유징파일 클릭
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	//get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	// 소스 -> 오버라이드 	
	@Override
	public String toString() {
		return "Friend [이름: " + name + ", 연락처: " + phone + "]";
	}
	public void showInfo() {
		//칭구이름 연락처
		System.out.printf("친구이름: &4s , 연락처: %15s" + name, phone);
	}
	

}
