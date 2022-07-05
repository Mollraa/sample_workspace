package co.edu.refernce;

public class ArrayExample01 {
	public static void main(String[] args) {
		// 배열의 저장공간 선언.
		int[] intAry = new int[10]; // 저장공간 10개인 객체. byte,short,int,long = 초기값이 0
		intAry[0] = 10; // 첫번째 위치 10값을 할당.
		intAry[4] = 50;
//		System.out.println(intAry.length);
		for (int i = 0; i < 10; i++) {
			System.out.println(intAry[i]); // =>p165 그림그린거보기
		}

		double[] dblAry = new double[5]; // double형 공간 5개 선언. 0.0
		for (int i = 0; i < dblAry.length; i++) {
			System.out.println(dblAry[i]);
		}

		boolean[] boolAry = new boolean[3]; // boolean형 초기값 false
		boolAry[1] = true;
//		boolAry[2] = "true"; // boolAry에는 boolean형 대입. 지금은 문자열이라서 오류뜸
		for (int i = 0; i < boolAry.length; i++) {
			System.out.println(boolAry[i]);
		}

		String[] strAry = { "백진희", "노은경", "김민지" }; // 초기값으로 3개 값 할당.
//		strAry[3] = "박경도"; //실행오류 발생.
		strAry[2] = "박경도";
		
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}

	}

}
