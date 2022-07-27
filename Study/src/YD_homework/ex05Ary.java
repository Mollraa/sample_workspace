package YD_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex05Ary {
	public static void main(String[] args) {
		boolean pro = true;
		
	
		
		Scanner s = new Scanner(System.in);
		List<ex05Met> hh = new ArrayList<>();
		int num = 0;
		
			
		while (pro) {
			try {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			int selectNo = Integer.parseInt(s.nextLine());

			switch (selectNo) {
			case 1: 
				System.out.println("상품수 입력: ");
				num = Integer.parseInt(s.nextLine());
				break;
			case 2:
				for(int i=0; i<num; i++) {
				System.out.println("상품을 입력하세요.");
				String name = s.nextLine();
				System.out.println("가격을 입력해주세요.");
				int pri = Integer.parseInt(s.nextLine());
				hh.add (new ex05Met(name, pri)); 
				}
				//add = arr[i] = 9; //add는 배열의 값을 넣어주는 메소드. 순서o
				break;
			case 3:
				System.out.println("제품별 가격.");
//				for(int i=0; i<hh.size(); i++) { //hh의 size를 불어온다. 
//					System.out.println(hh.get(i));
//				}
				for(ex05Met k : hh) {
					System.out.println(k); //향상된for
				}
				break;
			case 4:  // 9 3 5 
				System.out.println("분석");
				int max = 0;
				int sum = 0;
				for(ex05Met j : hh) {
					sum += j.getPrice();
				 if(max < j.getPrice() ) {
					 max = j.getPrice();
				 }  
				}
				System.out.println("최대값: " + max + " 가격: " + (sum-max));
				break;
			case 5:
				System.out.println("프로그램을 종료하겠습니다.");
				pro = false;
				break;
			default:
				System.out.println("목록해 해당번호가 없습니다.");
			}
			} catch(Exception j) {
				System.out.println("다시 입력해주세요.");
	}//end of while
		}
}
}
