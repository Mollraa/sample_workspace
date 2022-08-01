package FoodMenu;

public class Topping extends Food {
//	: 토핑이름, 토핑가격 추가.
	private String tName;
	private int tSalary;

	// 생성자.
	public Topping() {
		super();
	}

	public Topping(String studNo, String studName, int score, String tName, int tSalary) {
		super();
		this.tName = tName;
		this.tSalary = tSalary;
	}

	@Override
	public void getInformation() {
		System.out.println("[음식이름: " + getfName() + ", 가격: " + getSalary() + ", 합계: " + getNum() + "토핑이름: " + this.tName
				+ "토핑가격: " + this.tSalary + "]");
	}

	@Override
	public String toString() {
		return super.toString();
	}

//	public void getInformation() {
//		System.out.println("음식이름: " + getStudName() + "학생이름: " + getStudName() + "점수: " + getScore()
//		+ "담임교사: " + this.tName + "학년정보: " + this.hiNum);
//	}
//	

}
