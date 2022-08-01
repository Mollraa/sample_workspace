package FoodMenu;

public class Side extends Food {
//	대학생정보 : 담당교수, 전공과목 정보 추가.
	private String nuggets;
	private String cheeSt;
	private String potFri;
	private String iceCre;
	private String 

	// 생성자.
	public Side() {
		super();
	}

	public Side(String studNo, String studName, int score, String proName, String majName) {
		super();
		this.nuggets = proName;
		this.cheeSt = majName;
	}

	// toString()
	public void getInformation() {
		System.out.println("[음식이름: " + getfName() + ", 가격: " + getSalary() + ", 합계: " + getNum() + "토핑이름: " + this.tName
				+ "토핑가격: " + this.tSalary + "]");
	}
}
