package co.edu.refernce;

public class ArrayExample02 {
	public static void main(String[] args) {
		
		// 배열의 크기: 5, intAry.length
		int[] intAry = { 20, 27, 15, 33, 29 };
		
		intAry[2] = 30;         // 위치 세번째 => 15 -> 30으로 변경
		int temp = intAry[0];   // 1) 첫번째 값을 temp에 잠시저장
		intAry[0] = intAry[1];  // 2) 두번째 위치 값을 ,첫번째 위치에 복사
		intAry[1] = temp;       // 3) temp에서 불러오기
		
		int sum = 0;
		for (int i=0; i < intAry.length; i++) {
			//	if(i % 2 == 0) {
			//System.out.println(intAry[i]);
			//	}
			sum += intAry[i];
		}
		System.out.println("합계 : " + sum);
	}
}
