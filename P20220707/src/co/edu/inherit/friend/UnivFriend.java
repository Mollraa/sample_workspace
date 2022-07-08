package co.edu.inherit.friend;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	//소스 ->수퍼드가서 부모클래스생성자받아옴
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}
	//소스 - 스트링 - 다운클릭 - 순서선택 
	@Override
	public String toString() {
		return "UnivFriend [이름: " + getName() + ", 연락처: " + getPhone() + ", 학교: " + univ + ", 전공: " 
				+ major + "]";
	}
	
	public void showInfo() {
		//칭구이름, 연락처,학교명, 전공
		super.showInfo();
		System.out.printf("학교: %8s , 전공: %10s\n", univ, major);
		
	}

}

