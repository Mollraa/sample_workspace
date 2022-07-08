package co.edu.inherit.friend;

public class ComFriend extends Friend {
	private String company;
	private String department;
// 유니벌스칭구복분 둘다	
	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}
		@Override
		public String toString() {
			return "ComFriend [이름: " + getName() + ", 연락처: " + getPhone() + ", 직장: " + company + ", 부서: "
					+ department + "]";
	}
		
		public void showInfo() {
			//칭구이름, 연락처,회사명 부서명
			super.showInfo();
			System.out.printf("회사명: %8s , 부서명: %10s\n", company, department);
		}
}