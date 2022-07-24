package YD_homework;

import java.util.Scanner;

public class ex04_1 {
	public static void main(String[] args) {
		// 문제) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서,
		// 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		// 실행결과를 보고, 알맞게 작성해보세요.
		// 문제출처, 이것이 자바다 183페이지 9번

		boolean run = true; // while문에서 쓸 변수 선언
		int studentNum = 0; // 학생수 받을때 쓰는 변수
		int[] scores = null; // 학생점수 저장을 위한 배열선언
		Scanner scn = new Scanner(System.in); // 입력값받아서 쓰겠다~ 스캐너 선언
		Lable: while (run) { 
		// Lable = while문 종료. run이 true일 경우 실행됨. while문은 조건식이 true일 경우 계속해서 반복된다. 조건식이 false일때 종료됨
			System.out.println("----------------------------------------------"); // 사용자가 보고 선택하는 실행문
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> "); // 위의 목록중 선택하라는 실행문
			int selectNo = scn.nextInt(); // 1~5번중 번호입력 받으면 실행됨

			switch (selectNo) { //selectNo라는 변수가 어떤 값을 가지느냐에 따라 해당 실행문 결정. (switch 변수의 값에 따라 실행)
			case 1:
				System.out.println("학생수입력 페이지입니다.\n"); //1번 선택시 보여지는 실행문
				System.out.print("학생수를 입력해주세요: "); // 학생수 입력받는 실행문
				studentNum = scn.nextInt(); // 학생수는 정수로 입력받겠다.
				scores = new int[studentNum]; // 점수는 학생수에 따라 배열을 받겠다.
				break; // case1 조건완료후 멈추겠다.
			case 2:
				System.out.println("점수입력 페이지 입니다.\n"); //2번 선택시 보여지는 실행문
				for (int i = 0; i < scores.length; i++) {		//학생수는 0부터 입력값 까지 받겠다.
					System.out.print("[" + i + "]번 학생 점수: " + scores[i]); // 점수 실행문
					scores[i] = scn.nextInt(); // 점수는 입력값에 배열할당
				}
				break; //2번종료
			case 3:
				System.out.println("점수리스트 페이지 입니다.\n"); //3번 선책시 실행문
				for (int i = 0; i < studentNum; i++) {	//i는 0부터 하나씩 studentNum값으로 커진다. 
					System.out.println("[" + i + "]번 학생: " + scores[i]); // case2에서 입력한 점수배열 입력 값을 보여쥼
				}
				break; // 3번 종료
			case 4:
				System.out.println("점수분석 페이지 입니다.\n"); //4번선책시 실행문
				int max = 0; //정수 최고값 선언, 초기화 
				int sum = 0; //정수 합계 선언
				double avg = 0.0; //더블(실수타입) 평균값 선언 

				for (int i = 0; i < studentNum; i++) { //i변수가 0일때 i는 스튜던트넘값
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i]; // 스코어에있는 산출값을 sum에 넣는다
				}
				avg = (double) sum / studentNum;
				// avg(평균) 값은 학생수에서 입력받은 값과 sum(합계)를 나누기해서 double타입으로 변환해 받겠다.
				System.out.println("최고 점수: " + max); //최고점수 실행문
				System.out.println("평균 점수: " + avg); //평균점수 실행문
				break;
			case 5:
				break Lable; // 완전종료하고 while문 종료
			default: //변수가 switch~case값에 없을경우 
				System.out.println("목록안에서 선택해주세요!"); // default시 실행문
			}

		}
		System.out.println("프로그램이 종료되었습니다."); //default or break Lale;시 실행문
	}
}
