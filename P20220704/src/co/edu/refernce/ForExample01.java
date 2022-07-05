package co.edu.refernce;

public class ForExample01 {
	public static void main(String[] args) {
		// 배열.
		int[] tempAry = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50);
		}

		// 제일 큰 값을 max;
		for (int num : tempAry) {
			System.out.println(num);
		}
		int max = 0;
		// code HERE.

		for (int i = 0; i < tempAry.length; i++) 
			if (max < tempAry[i]) {
				max = tempAry[i]; // max랑 tempAry를 비교하는데 맥스에 제일 큰값을 담겠다~
			}
		
			System.out.println("제일 큰값: " + max);
	}
}
