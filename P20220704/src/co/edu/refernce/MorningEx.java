package co.edu.refernce;
//집가서 해보기
import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
//이 예제는 외우기!! p.202
		boolean run = true;
		int studentNum = 0; // 학생수를 입력받을 때
		int[] scores = null; // 참조변수 초기화. (참조변수 : 실제 변수의 값이 아니라 주소값!)
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("------------------------------------\n");
			System.out.print("선택 >> ");

			int selectNO = Integer.parseInt(scn.nextLine()); // nextInt()=int, nextLine()=>String

			// 배역을 지정하지 않고 다른 메뉴를 선책하면 메세지 보여주기.
			if (scores == null) {
				if (!(selectNO == 1 || selectNO == 5)) {
					System.out.println("학생수를 지정하세요 ~ >_<");
					continue;
				}
			}

			if (selectNO == 1) {
				System.out.print("학생수 >>> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum]; // 배열크기정함
				System.out.println("정상적으로 처리되었습니다.");

			} else if (selectNO == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]");
					scores[i] = Integer.parseInt(scn.nextLine());
				}

			} else if (selectNO == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]" + scores[i] + "\n");
				}

			} else if (selectNO == 4) {  // 합계구해서  최고점수, 평균점수 만들기
				int sum =0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					avg = (double) sum / scores.length; // 평균구하는 식
					System.out.printf("최고점수: %d \n 평균 점수: %.1f \n" + sum, scores);
				}
			}
		}
		System.out.println("프로그램 종료.");

	}
}
