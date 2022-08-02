package com.edu;

public class PtMember extends Member {
	// 코치 / 남은 횟수
	private String coach;

	public PtMember() {
	}

	public PtMember(int memberId, String memberName, int birth, String adr, String phone, String start, String remain,
			String coach) {
		super();
		this.coach = coach;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

}
