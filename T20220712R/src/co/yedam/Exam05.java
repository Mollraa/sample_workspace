package co.yedam;

import java.util.Scanner;

/*
 * 문제 5: 배열.
 * members 배열에서 회원의 아이디를 조회하는 기능을 작성하세요.
 * 사용자의 입력값을 배열에서 조회하고 입력한 값의 회원아이디가 존재할 경우에 출력.
 * 예) 사용자 입력값 : white => "입력한 회원아이디가 존재합니다."
 *    사용자 입력값 : black => "입력한 회원아이디가 없습니다."
 */
public class Exam05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] members = { "green", "blue", "white", "red", "bluesky" };
		
		System.out.println("찾고 싶은 회원의 아이디를 입력 >> ");
		String id = scn.nextLine();   //scn.nextLine();사용자가 입력한 값을 문자타입으로변환해서 보여줌
		
		boolean isExist = false;
		for (int i = 0; i < members.length; i++) {
			if(members[i].equals(id)) {   //사용자가 입력한 아이디랑 같은값이 있습니까?
				isExist = true;
			}
		}
		 if (isExist) {
			System.out.println("입력한 회원의 아이디가 존재합니다.");
			
		} else {
			System.out.println("입력한 회원의 아이디가 없습니다.");
		}
	}
}
