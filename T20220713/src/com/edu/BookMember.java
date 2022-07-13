package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)

	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실
	private String className;
	public BookMember() {
		super();
	}

	public BookMember(String memberName, String className){
		this.className = className;
	
	}


	@Override
	public String toString() {
		return "BookMember [className=" + className + "]";
	}

}
