package co.edu.compound;

public class ClaassExam {
	public static void main(String[] args) {
		// name에서 만든 설계도를 여기서실행 = 인스턴스
		String name = "백진희"; // 백진희라는 객체의 주소값
		int age = 19;

		String[] names = { "백진희", "노은경", "김민지" };
		int[] scores = { 80, 85, 79 };
		int[] ages = { 19, 20, 21 };

		Student s1 = new Student(); // s1이라는 빈공간에 new Student라는 주소값을 담겠습니다.
		s1.name = "백진희";
		s1.age = 19;
		s1.score = 80;

		Student s2 = new Student();
		s2.name = "노은경";
		s2.age = 20;
		s2.score = 85;

		Student s3 = new Student();
		s3.name = "김민지";
		s3.age = 21;
		s3.score = 79;
		s3.height = 168.5;

		Student[] students = { s1, s2, s3 }; // [] <=배열타입

		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals("김민지")) { // System.out.println(students[i].name);
//				System.out.println("점수: " + students[i].score);	
			}
		}

		// car에서 만든 설계도를 여기서실행 = 인스턴스
		Car c1 = new Car("소나타", 500); // 힙메모리에 인스턴스 생성
		c1.price = 20000000;
		c1.speed = 30;
		System.out.println("최고속도: " + c1.maxSpeed);
		c1.setSpeed(50);
		c1.start();
		c1.run();
		c1.showSpeed();
		c1.stop();

//		Car c2 = new Car(); // 힙메모리에 인스턴스 생성
//		c2.model = "k5";
//		c2.price = 22000000;
//		c2.speed = 40;
//		System.out.println("최고속도: " + c2.maxSpeed);
//		c2.setSpeed(60);
//		c2.start();
//		c2.run();
//		c2.showSpeed();
//		c2.stop();

		System.out.println(c1); // 점수: 79co.edu.compound.Car@880ec60 , @숫자 부분은 79~가 만들어진 주소값

	}
}
