package com.edu;
//필드
public class Member {
	// 회원번호 회원이름 휴대전화 정보.
	// 회원번호 | 성함 | 생년월일 | 주소 | 전화번호 | 등록일 | 남은 횟수
	private int memberId;
	private String memberName;
	private int birth;
	private String adr;
	private String phone;
	private String start;
	private String remain;

	// 생성자.
	public Member() {}

	public Member(int memberId, String memberName, int birth, String adr, String phone, String start, String remain) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.birth = birth;
		this.adr = adr;
		this.phone = phone;
		this.start = start;
		this.remain = remain;
	}
	// getter, setter
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getRemain() {
		return remain;
	}

	public void setRemain(String remain) {
		this.remain = remain;
	}
	

}
