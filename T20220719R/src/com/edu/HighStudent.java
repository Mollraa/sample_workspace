package com.edu;
// toString()

public class HighStudent extends Student {
	// 고등학생정보 : 담임교사, 학년 정보 추가.
	private String teacher;
	private String grade;

	// 생성자.
	public HighStudent() {}

	public HighStudent(String studNo, String studName, int score, String teacher, String grade) {
		super(studNo, studName, score);
		this.teacher = teacher;
		this.grade = grade;
	}
	

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// toString()
	public String toString() {
		return " 고등학생 [학생번호: " + getStudNo() + ", 학생이름: " + getStudName() + ", 점수: " + getScore() + ", 담임교사: "
				+ this.teacher + ", 학년정보: " + this.grade + "]";
	}

}
