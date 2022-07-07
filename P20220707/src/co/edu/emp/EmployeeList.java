package co.edu.emp;
/*
 * 저장, 등록, 조회, 리스트 ....
 */
import java.util.Scanner;

public class EmployeeList {
	// 싱글톤.
	private static EmployeeList instance = new EmployeeList();

	private EmployeeList() {
	}

	public static EmployeeList getInstance() {
		return instance;
	}

	// 배열
	Employee[] list; // 사월배열.
	int empNum; // 사원수.
	Scanner scn = new Scanner(System.in);

	// 리스트 초기화
	private EmployeeList(Employee[] list) {
		this.list = list;
		this.empNum = list.length;
	}

	// 배열객체 선언.
	public void init() {
		System.out.println("사원수 입력>");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}

	// 사원정보 입력 -> 배열에 추가.
	public void input() {
		// 배열의 크기보다 더 많이 입력못하도록 미리설정해두는거
		if (empNum >= list.length) {
			System.out.println("입력 초과");
			return; // break와는 달리 여기서 메소드를 종료하겠습니다~ 라는 의미
		}

		System.out.printf("%d 사번> ", empNum);
		int no = Integer.parseInt(scn.nextLine());

		System.out.printf("이름> ");
		String name = scn.nextLine();

		System.out.printf("급여> ");
		int sal = Integer.parseInt(scn.nextLine());

		list[empNum++] = new Employee(no, name, sal); // 사원인스턴스..->배열에 저장☆☆☆☆☆☆
	}

	// 전체출력.
	public void printList() {
		for (int i = 0; i < empNum; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
	}

	// 상세조회, 사원에 상세정보를 보여주는 기능 Employee추가.
	public void search() {
		System.out.print("사원번호 입력>");
		int employeeId = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < empNum; i++) {
			if (employeeId == list[i].getEmployeeId()) {
				System.out.println(list[i].getDetailInfo());
			}
		}
	}

	private int getLastDate(int mon) {
		switch(mon) {
		case 6:
			return 30;
		case 7:
			return 21;
		default:
			return 30;
		}
	}
	//1일 요일정보
	private int getDayInfo(int mon) {
		switch(mon) {
		case 6:
			return 3;     //첫째날 요일정보.
		case 7:
			return 5;
		default:
			return 0;
	}
	}
	// 달력(숙제, 달력만들어오깅)
	public void showCalender() {
		System.out.print("월을 입력하시오~ >_< ~ ");
		int month = Integer.parseInt(scn.nextLine());

		// 요일정보. 1일의 위치(무슨요일인지). 말일의 날짜(28일인지 30일인지).
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int firstDay = getDayInfo(month); // 일:0, 월:1 화:2 수:3 목:4 금5 토6
		int lastDate = getLastDate(month); //

		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 요일정보를 맞추도록하라능
		for (int i = 0; i < firstDay; i++) {
			System.out.printf("%4s", " ");
		}

		// 날짜 출력하는 부분.
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + firstDay) % 7 == 0) { // 토요일까지 출력했으면 줄바꿔서 출력해라~~는 뜻. 을가진 기능
				System.out.println();
			}
		}
		System.out.println();

	}

}
