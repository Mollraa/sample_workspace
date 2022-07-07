package co.edu;

public class StudentMain {
	
	//메소드
	public static void main(String[] args) {
		Student kim = new Student();   //null참조하는 대상이 없다는 뜻, 꼭 new~ 로 인스턴스를 만들어줘야한다.
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(86);
		
		System.out.println("이름" + kim.getName());
		kim.showInfo();     //학번 이름 점수 => 한번에 보여주는 기능
		
		Student park = new Student("22-002", "박경도", 91);
		park.showInfo();
		// 학생추가.
		Student baek = new Student("22-003", "백진희", 100);
		baek.showInfo();
		
		Course course = new Course("김자반", "1-3", 25);
		System.out.println("선생님: " + course.getTname());
		System.out.println("반정보: " + course.gerBname());
		
		//학생등록
		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(baek);
		
		//학생리스트 보기
		course.getStudents();
		
		//최고점 학생정보 보기
		System.out.println("최고점수 학생: ");   //메소드가 없어서 매게값을 못씁
		Student maxStudent = course.getMaxStudent();
		maxStudent.showInfo();
		
		//반평균.
		System.out.println("반 평균: " + course.getAvgScore());
		
		
	}

}
