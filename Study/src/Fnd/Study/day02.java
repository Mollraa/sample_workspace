package Fnd.Study;

import java.util.Scanner;

public class day02 {
	public static void main(String[] args) {
		/*
		 * 문제. 조건문 만들기 키보드로 아이디, 패스워드 [입력] 받아서 로그인하는 프로그램 입력 조건 : 아이디 - 문자열(String) /
		 * 패스워드 - 정수형(String => int 변환) 아이디 yedam, 패스워드 1234 이라면 "로그인 성공"을 출력하고 그렇지 않으면
		 * "로그인 실패"를 출력하세요. (조건문)
		 */
		Scanner scn = new Scanner(System.in); //문자열 생성해주었습니다.

		while (true) {								//while 조건문 입력.
			System.out.println("ID를 입력하세요: ");	// 실행문 입력.
			String id = scn.nextLine();				//문자열로 사용자의 입력값을 선언해주었습니다.
			System.out.println("PW를 입력하세요: ");
			String pw = scn.nextLine();
			int pw1 = Integer.parseInt(pw);
                                                             // if조건문 true이면 블록실행,false이면 블록을 실행하지 않습니다.
			if (id.equals("yedam") && pw.equals("1234")) {  //if식이 true인 조건문식을 적어주었습니다. 
				System.out.println("로그인 성공!");          
				break;                                    // while문은조건이 true일경우 계속 반복하기 때문에
			}                                            // 반복문을 종료해주는 break;로 나오게 해주었습니다.
			System.out.println("로그인 실패 ㅜ^ㅜ");        // false일때 나오는 실행문을 입력해주었습니다.
		}
	}
}

