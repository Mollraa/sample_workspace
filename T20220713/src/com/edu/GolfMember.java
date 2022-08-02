package com.edu;

public class GolfMember extends Member {
	private String proName;

	public GolfMember() {
		super();
	}

	public GolfMember(int memberId, String memberName, int birth, String adr, String phone, String start, String remain,
			String proName) {
		super();
		this.proName = proName;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

}
