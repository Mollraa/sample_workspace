package co.edu.loop;

public class Example01 {
	public static void main(String[] args) {

		// 3) 10번 반복.
		// 1) num 변수 <= 1 ~ 10 까지의 임의 정수. Math.random();
		// 2) sum 변수 <= 2의 배수.
		// 2의 배수의 합: 22??

		int num, sum2 = 0, sum3 = 0;
//		sum2 = sum3 = 0;
		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) { // 2의 배수를 sum2에 누적.
				sum2 += num;
			} // 6이 2의배수 3의배수 둘다 해당, if 따로 적어줌
			if (num % 3 == 0) { // 3의 배수를 sum3에 누적.
				sum3 += num;
			}
		}
		System.out.println("2의 배수의 합계: " + sum2); // 2의 배수의 합: 22??
		System.out.println("3의 배수의 합계: " + sum3);
	}
}
