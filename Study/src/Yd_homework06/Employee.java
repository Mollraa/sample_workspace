package Yd_homework06;

public class Employee {
//	Question 1
// 1) Employee 클래스를 정의한다.
//- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 각 필드의 getter만 존재한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름과 연봉을 출력하는 기능
//(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
//
	private String name;
	private int sal;
	
	public Employee() {}
	public Employee(String name, int sal) {
		this.name = name;
		this.sal = sal;
		}

	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public void getInformation() { //이 형식으로 보여주겠다 
		System.out.print("이름 : " + name + " , 연봉: " + sal);
	}
	public void prn() { //prn = 수퍼클래스
		System.out.print("수퍼클래스");
	}
}
