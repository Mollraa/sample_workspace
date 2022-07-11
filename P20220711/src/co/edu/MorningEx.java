package co.edu;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] fruits = { "딸기", "바나나", "오렌지", "파인애플", "두리안" };

		boolean isExist = false;
		System.out.println("값을 입력하세요~ ^^ ");
		String fruit = scn.nextLine();
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(fruit)) { // 문자열(if) 비교할땐 ==말고 equtls
				System.out.println((i + 1) + "번째 위치. ");
				isExist = true; // 다돌았는데도 값이없으면 for구문 밖에 sysou~
				break;
			}

		}
		if (!isExist) {
			System.out.println("찾는 과일이 없습니다.");
		}
	}

}
