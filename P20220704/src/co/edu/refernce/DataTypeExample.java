package co.edu.refernce;

class Person {
	String name;
	int age;
}

public class DataTypeExample {
	public static void main(String[] args) {

		int num1 = 100;
		int num2 = num1;
		num1 = 200;

		System.out.println("num1: " + num1); // stack :100 -> 200
		System.out.println("num2: " + num2); // stack :100 -> 100

		Person p1 = new Person();
		p1.name = "백진희";
		p1.age = 26;

		Person p2 = p1; // 참조 주소값.
		p1.name = "박경도";
		p1.age = 29;

		p2.name = "조승희";
		p2.age = 22;

		System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
		System.out.println("이름: " + p2.name + ", 나이: " + p2.age);

//		String name1 = "백진희";
//		String name2 = "백진희";
		
//		System.out.println("name1 : " + name1);
//		System.out.println("name2 : " + name2);

	}

}
