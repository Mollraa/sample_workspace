package FoodMenu;

public abstract class Food {
	// 학생번호, 학생이름, 점수
	private String fName;
	private int salary;
	private int num;

	public Food() {
		super();
	}

	public Food(String fName, int salary, int num) {
		super();
		this.fName = fName;
		this.salary = salary;
		this.num = num;
	}

	

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public abstract void getInformation();

	@Override
	public String toString() {
		return "[음식이름: " + fName + ", 가격: " + salary + ", 합계: " + num + "]";
	}

}
