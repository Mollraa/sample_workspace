package co.edu;
/*
 * 상수 vs. 변수
 * 변수에 final이 붙으면 상수.
 * 메소드에 final이 붙으면 재정의(overriding)불가.
 * 클래스에 final이 붙으면 상속이 불가.
 */

/*
 * 클래스 선언은 파일 1개 작성이 원칙.
 */
class Person {
	final String ssn; // 주민번호.
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
public class FinalEaxmple {
	public static void main(String[] args) {
		//변수.
		String name ="백진희";
		name = "노은경";
		
		//상수.
		final int num = 10;   // final 값을 변경할수없는 필드
//		num = 20; // The final local variable num cannot be assigned.
		
		Person person = new Person("970120-1234567", "백진희");
		person.name = "홍진히";
//		person.ssn = "970120-1234567";
		
		
		
	}
}
