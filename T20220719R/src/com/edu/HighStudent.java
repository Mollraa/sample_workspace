package com.edu;
// toString()

public class HighStudent extends Student {
	//고등학생정보 : 담임교사, 학년 정보 추가.
	private String teacher;
	private String information;
	
	// 생성자.
	public HighStudent() {}
	public HighStudent(String teacher, String information) {
		this.teacher = teacher;
		this.information =information;
	}
	

	
	
}
