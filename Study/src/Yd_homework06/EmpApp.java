package Yd_homework06;

public class EmpApp {
	//3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
	//- 출력결과
	//이름:이지나  연봉:3000  부서:교육부
	//수퍼클래스
	//서브클래스
	public static void main(String[] args) {
		EmpDept emp = new EmpDept("백진희", 3000, "교육부"); //기본생성자
		emp.getInformation(); 
		System.out.println();
	
//		Employee emp1 = new Employee();
//		emp1.getInformation();
		
		
		
	}
	
}
