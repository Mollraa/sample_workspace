package com.edu;

//MemberApp이 가진 app.execute를 구현하겠다를 구현하는곳
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {
	List<Member> members = new ArrayList<Member>(); // 맴버즈의 여러건의 데이터를 담아두겠습니다~
	Scanner scn = new Scanner(System.in);

	public void execute() { // void = 비엇다.
		// 등록
		// 수정: 회원번호입력 -> 이름수정 폰번호 주소 수정
		// 재등록
		// 시작, 마지막 날짜
		// 회원 리스트
		// 검색-> 회원조회
		boolean mem = true;
		while (mem) {
			System.out.println("메인페이지");
			System.out.println("1. 등록 | 2. 수정 | 3. 재등록 | 4. 등록날짜 | 5. 마지막날짜 | 6. 회원리스트 | 7. 검색");
			int num = Integer.parseInt(scn.nextLine());
			// String select = scn.nextLine();
			switch (num) {
			case 1:
				System.out.println(" 회원번호 | 성함 | 생년월일 | 주소 | 전화번호 | 등록일 ");
				int memberId = Integer.parseInt(scn.nextLine());
				String memberName = scn.nextLine();
				int birth = Integer.parseInt(scn.nextLine());
				String adr = scn.nextLine();
				String phone = scn.nextLine();
				String start = scn.nextLine();
				String remain = scn.nextLine();
				String coach = scn.nextLine();
				members.add(new PtMember(memberId, memberName, birth, adr, phone, start, remain, coach)); // 등록
				break;
				
			case 2:
				System.out.println("수정하고 싶은 목록을 선택해주세요. ");
				
			case 3:
				System.out.println("재등록");
			case 4:
				System.out.println("등록날짜");
			case 5:
				System.out.println("마지막날짜");
			case 6:
				System.out.println("회원리스트");
			case 7:
				System.out.println("회원이름을 입력해 주세요: ");
			default:
				System.out.println("목록에 없는 번호입니다.");
			}
		}

	}

	private void add(PtMember ptMember) {
		// TODO Auto-generated method stub
		
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
