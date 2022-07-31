package com.edu.d;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.

	private String professor;
	private String major;

	// 생성자.
	public CollegeStudent() {

	}

	public CollegeStudent(String studNo, String studName, int score, String professor, String major) {
		super();
		this.major = major;
		this.professor = professor;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "CollegeStudent [학번=" + getStudNo() + ", 학생이름=" + getStudName() + ", 학생정보="
				+ getScore() + ", 담당교수=" + professor + ", 전공=" + major + "]";
	}

}
