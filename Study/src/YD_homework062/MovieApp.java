package YD_homework062;

import java.util.Scanner;

public class MovieApp {
//	4) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//	- 출력결과
//	영화제목 : 추격자
//	감독 : 7
//	배우 : 5
//	영화총점 : 12
//	영화평점 : ☆☆☆☆
//	=====================
//	공연제목:지킬앤하이드
//	감독:9
//	배우:10
//	공연총점 : 46
//	공연평점 : ☆☆☆☆☆
//	- 조건
//	관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다.	
	public static void main(String[] args) {
		Movie mInfo = new Movie(); // 영화정보 담을 객체
		// mInfo.getInformation();
		// System.out.println(mInfo);
		// System.out.println("============================");
		Performance pInfo = new Performance();
		Scanner s = new Scanner(System.in);

		boolean run = true; // while 문 변수 선언.
		while (run) {
			System.out.println("       " + "[ 공연 평가 시스템 ]");
			System.out.println("1.점수주기   2.출력하기   3.종료하기"); // 시작시 안내문
			int menu = Integer.parseInt(s.nextLine()); // 사용자에게 메뉴를 입력받을거
			if (1 == menu) { // 1번 고르면 출력해줄 내용
				System.out.println("1.영화   2.연극   3.종료"); // 1번하면 1번 안에서 보여줄 내용
				int cul = Integer.parseInt(s.nextLine()); //
				if (1 == cul) {
					while (true) {
						System.out.println("영화제목을 입력해 주세요");
						String title = s.nextLine();
						System.out.println("감독수를 입력해 주세요");
						int gNum = Integer.parseInt(s.nextLine());
						System.out.println("배우수를 입력해 주세요");
						int aNum = Integer.parseInt(s.nextLine());
						System.out.println("점수를 입력해주세요.");
						int score = Integer.parseInt(s.nextLine()); // 점수를 int로 반환해서 저장
						if (score <= 5) {
							int t = mInfo.getAudNum() + 1; // while문 1명씩 더해줌 관객수, 5점 넘긴사람은 카운트안함
							int score2 = mInfo.getScore() + score; // 점수를 담아둘 공간
							mInfo = new Movie(title, gNum, aNum, t, score2);
							break; //
						} else {
							System.out.println("최대 점수는 5점입니다.");
						}
					}
				} else if (cul == 2) {
					while (true) {
						System.out.println("공연제목을 입력해 주세요");
						String title = s.nextLine();
						System.out.println("감독수를 입력해 주세요");
						int gNum = Integer.parseInt(s.nextLine());
						System.out.println("배우수를 입력해 주세요");
						int aNum = Integer.parseInt(s.nextLine());
						System.out.println("점수를 입력해주세요.");
						int score1 = Integer.parseInt(s.nextLine()); // 점수를 int로 반환해서 저장
						if (score1 <= 5) {
							int tt = pInfo.getAudNum() + 1; // while문 1명씩 더해줌 관객수, 5점 넘긴사람은 카운트안함
							int score3 = pInfo.getScore() + score1; // 점수를 담아둘 공간
							pInfo = new Performance(title, gNum, aNum, tt, score3);
							break;
						} else {
							System.out.println("최대 점수는 5점입니다.");
							System.out.println();
						}
					}
				} else {
					System.out.println("메뉴로 돌아갑니다.");
					System.out.println();
					continue;
				}
			} else if (menu == 2) {
				try {
					while (true) {
						System.out.println("1" + mInfo.getTitle() + " | 2" + pInfo.getTitle() + " | 3. 종료");
						int num2 = Integer.parseInt(s.nextLine());
						if (num2 == 1) {
							mInfo.getInformation();
						} else if (num2 == 2) {
							pInfo.getInformation();
						} else if (num2 == 3) {
							System.out.println("종료하겠습니다.");
							break;
						} else {
							System.out.println("목록에 없는번호 입니다.");
							System.out.println();
						}
					}
				} catch (Exception o) {
					System.out.println("입력된 내용이 없습니다!");
					System.out.println();
				}

			} else if (menu == 3) {
				System.out.println("종료하겠습니다.");
			} else {
				System.out.println("[목록 안에서 선택해 주세요]");
				System.out.println();
			}
		}
	}
}
