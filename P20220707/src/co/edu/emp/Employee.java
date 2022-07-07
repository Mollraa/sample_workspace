package co.edu.emp;
/*
 * 사원정보: 복합적인 데이터 유형.
 * 사원번호, 이름, 부서번호, 부서명, 급여, 이메일
 */
public class Employee {
	private int employeeId;           // 사번
	private String name;             // 이름
	private int departmentId;       // 부서번호 10:인사 20:개발 30:영업(기본값)
	private String departmentName; // 부서명
	private int salary;           // 급여
	private String email;        // 이메일
	
	//생성자
	public Employee() {}
	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		if (departmentId == 10) {
			departmentName = "인사";
		} else if (departmentId == 20) {
			departmentName = "개발";
		} else { /*if (departmentId == 30) */
			departmentName = "영업";
		}
	}
	//사번, 이름 초기화.
	public Employee(int employeeId, String name) {
//		this();                             // 기본생성자를 호출하겠습니다~ 라는 의미
		this(employeeId, name, 100, 30);    //this 다른생성자를 호출
	}
	//사번 이름 급여
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);
	}
	
	//상세정보를 반환가능.
	public String getDetailInfo() {
		//사원번호, 이름, 급여, 부서정보
		String info = "사원번호: " + employeeId + ", 이름: " + name + ", 급여: " + salary;
		info += ", 부서정보: " + departmentName;    // += 계속누적시킨다는 뜻
		return info;
	}
	
	
	
	//get (값을 가져옴)
	public int getEmployeeId() {
		return employeeId;
	} 
	public String getName() {
		return name;
	}
	public int getDepartmentId() {
		return departmentId;
	} 
	public String getDepartmentName() {
		return departmentName;
	}
	public int getSalary() {
		return salary;
		
	}
	public String getEmail() {
		return email;
	}
	
	//set
	public int setEmployeeId() {
		return employeeId;
	}
	public String setName() {
		return name;
	}
	public int setDepartmentId() {
		return departmentId;
	}
	public String setDepartmentName() {
		return departmentName;
	}
	public int setSalary() {
		return salary;
	}
	public String serEmail() {
		return email;
	}
	
}
