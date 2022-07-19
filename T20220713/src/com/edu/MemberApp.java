package com.edu;
//MemberApp이 가진 app.execute를 구현하겠다를 구현하는곳
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();  //맴버즈의 여러건의 데이터를 담아두겠ㅆ브니다~
	Scanner scn = new Scanner(System.in);

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반=>기본정보+도서반장,강의실이름
		// 축구반=>기본정보+코치이름,락커룸이름
		// 수영반=>기본정보+강사이름,수영등급
		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("선택하세요 >> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			
			if (selectNo == 1) {     //공동정보
				System.out.println();
			} else if (selectNo == 2) {
				System.out.println();
			} else if (selectNo == 3) {
				System.out.println();
			} else if (selectNo == 9) {
				System.out.println("종료합니다.");
			}
		}

	}

	private void add() {
		int choice = 0;

		while (true) {
			System.out.println("1.도서반 2.축구반 3.수영반");
			System.out.println("선택 >>>");

			try {
				choice = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("1 2 3 중에 선택하세요");
			}
		}
		System.out.println("회원번호를 입력하세요 > ");
		int memberId = Integer.parseInt(scn.nextLine());
		System.out.println("성명을 입력하세요 > ");
		String memberName = scn.nextLine();
		System.out.println("휴대번화 번호를 입력하세요 > ");
		String phone = scn.nextLine();

		if (choice == 1) {
			System.out.println("Id: ");
			int memberId1 = Integer.parseInt(scn.nextLine());
			System.out.println("학생이름: ");
			String memberName1 = scn.nextLine();
			System.out.println("도서관 강의실명");
			String className = scn.nextLine();

		
		}
	}
	@Override // implements MemberService를 재정의하겠씁니다~
	public void addMember(Member member) {
		members.add(member);

	}

	@Override
	public void modifyMember(Member member) {
		for (int i = 0; i < members.size(); i++) {
			if (member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
			}
		}
	}

	@Override
	public List<Member> memberList() {
		return members;
	}
}
