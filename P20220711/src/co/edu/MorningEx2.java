package co.edu;

public class MorningEx2 {
	public static void main(String[] args) {
		// int정수 배열6개 담기 => intAry
		// 1 ~ 100 까지 임의 값. 을만들어주는 메스랜덤을 이용해서 만들깅
		int[] intAry = new int[6];
		// 최대 ↓
		int max = intAry[0]; // 큰값을 max에 담겠다~
		int sum = 0;
		double avg = 0; // 평균
		
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 100) + 1;
			sum += intAry[i];
			
		}
		
		avg = (double) sum / intAry.length; //반복문이 두개일때 반복한다는 의미	

		// 확장 for
		for (int num : intAry) {
			System.out.println(num);

		}

	}
}
