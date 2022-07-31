package com.edu.d;

public class HighStudent extends Student {
//	고등학생정보 : 담임교사, 학년 정보 추가.

	private String highst;
	private String homerteach;

	// 생성자.
	public HighStudent() {

	}

	public HighStudent(String studNo, String studName, int score,String highst, String homerteach) {
		super();
		this.highst = highst;
		this.homerteach = homerteach;
	}

	public String getHighstudent() {
		return homerteach;
	}

	public void setHighstudent(String highstudent) {
		this.homerteach = highstudent;
	}

	public String getHomerteach() {
		return homerteach;
	}

	public void setHomerteach(String homerteach) {
		this.homerteach = homerteach;
	}

	@Override
	public String toString() {
		return "HighStudent [학생번호=" + getStudNo() + ", 학생이름=" + getStudName() + ", 학생번호="
				+ getScore() + ", 학년=" + highst + ", 담임교사=" + homerteach + "]";
	}

}
