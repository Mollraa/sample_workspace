package com.edu;

public class CollegeStudent extends Student {
	// 대학생정보 : 담당교수, 전공과목 정보 추가.
	private String prof;
	private String major;

	// 기본생성자
	public CollegeStudent() {
		super();
	}

	// 생성자.
	CollegeStudent(String studNo, String studName, int score, String prof, String major) {
		super(studNo, studName, score);
		this.prof = prof;
		this.major = major;

	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// toString() //객체 정보를 문자열로 반환
	public String toString() {
		return " 대학생 [studNo=" + getStudNo() + ", studName=" + getStudName() + ", score=" + getScore() + ", prof="
				+ prof + ", major" + major + "]";
	}

}
