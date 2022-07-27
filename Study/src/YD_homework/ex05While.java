package YD_homework;

import java.util.Scanner;

public class ex05While {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의
		// 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.

		Scanner scn = new Scanner(System.in); // 입력값 받겠습니다
		int sum = 0; // 총합
		int max = 0; // 최대값
		boolean pro = true; // while문 실행변수
		int[] pri = null; // 상품가격 저장을 위한 배열
		String[] goods = null; // 제품별가격
		int good = 0; // 상품

		Lable: while (pro) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.printf("선택 > ");
			int selectNo = Integer.parseInt(scn.nextLine());	// 목록에서 받을 번호값

			switch (selectNo) {
			case 1:
				System.out.printf("상품의 수를 입력해주세요: ");
				good = Integer.parseInt(scn.nextLine());
				pri = new int[good];
				goods = new String[good];
				break;
			case 2:
				System.out.println("상품을 입력해 주세요: ");
				for (int i = 0; i < goods.length; i++) {
					goods[i] = scn.nextLine();
				}
				System.out.println("가격을 입력해 주세요: ");
				for (int i = 0; i < pri.length; i++) {
					pri[i] = Integer.parseInt(scn.nextLine());
				}
				break;
			case 3:
				System.out.println("제품별 가격입니다.");
				for (int i = 0; i < pri.length; i++) {
					System.out.println("상품명: " + goods[i] + " | 가격: " + pri[i]);
				}
				break;
			case 4: // 중첩 for문
				for (int i = 0; i < pri.length; i++) {
					if (max < pri[i]) {
						max = pri[i];
					}
					sum += pri[i];
				}
				for(int i=0; i<good; i++) {
					if(pri[i] == max) {
						System.out.println("최고가격: " + max + " 상품이름: " + goods[i] 
						+ ", 상품 나머지 총합: " + (sum-max));
					}
				}
				break;

			 case 5:
				System.out.println("프로그램 종료합니다.");
				break Lable;
			default:
				System.out.println("선택가능한 번호가 아닙니다. 다시 선택 해주세요.");
			}
		}
		System.out.println("종료되었습니다.");

	}
}
