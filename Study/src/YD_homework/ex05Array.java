package YD_homework;

import java.util.Scanner;

public class ex05Array{
		public static void main(String[] args) {
			ex05[] ex05Array = new ex05[3];
			
			boolean pro = true;
			Scanner s = new Scanner(System.in);
			
			for(int i=0; i<ex05Array.length; i++) {
				String name = s.next(); // string입력값으로 받겠다
				int price = s.nextInt();
				int numStock = s.nextInt();
				int sold = s.nextInt();
				ex05Array[i] = new ex05(name, price, numStock, sold);
			}
			for(int i=0; i<ex05Array.length; i++) {
				System.out.println(ex05Array[i].getName() + " ");
				System.out.println(ex05Array[i].getPrice() + " ");
				System.out.println(ex05Array[i].getNumStock() + " ");
				System.out.println(ex05Array[i].getSold() + " ");
			}
			
			Lable: while(pro) {
				System.out.println("--------------------------------------------------------");
				System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
				System.out.println("--------------------------------------------------------");
				int selectNo = Integer.parseInt(s.nextLine());
				
				switch(selectNo) {
				case 1:{
					System.out.println("상품수 입력: ");
					
					
				}
				
				}
			
			
			
			
			
			
			
			}
			
		}
}
