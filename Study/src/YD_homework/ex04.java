package YD_homework;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. //i = int
		for (int i = 0; i < arr1.length; i++) { // i의 값을 정수로 입력받아 arr1에서 찾을겁니당
			if (60 == arr1[i]) {
				System.out.println("해당 인덱스 값은: " + i);
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
//		for(int i=0; i < arr1.length; i++) {
//			if(i == 3) {	
//				continue;  // i가 3일 때 를 제외하고,  continue; = 반복문의 현재 단계를 중지
//			}
//			System.out.println("arr1[" + i + "]: " + arr1[i]); //결과문 
//		}
		for (int i = 0; i < arr1.length; i++) { // arr1을 반복할건데
			if (i != 3) {
				System.out.println("arr1[" + i + "]: " + arr1[i]); 
				//i가 3인 경우를 제외한 나머지를 뽑아주겠ㅅ다.
			}
		}

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner scn = new Scanner(System.in); // 스캐너선언
		System.out.println("값을 입력하세요."); // 입력값받을 출력문
		int h = scn.nextInt(); // h라는 임의의 변수를 선언, 입력값으로 받겠다는 뜻
		arr1[h] = 1000; // drr1의 임의의 값을 1000으로 바꿀거당
		System.out.println(h + "index: 가 바뀜"); // 입력받은 값이 바꼇다는걸 보여주는 출력문

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = arr1[0];
		int min = arr1[0]; //0=첫번째값 부터 비교하겠다.
		//5 3 10 11 1
		for (int i = 0; i < arr1.length; i++) {  //i를 int정수로 받겠다. = for(int o : arr1) {
			
			if (max < arr1[i]) //i배열 최대값구하는 식
				max = arr1[i]; //최대값은 arr[i]의 값.
			
			if (min > arr1[i]) //i배열 최소값구하는식
				min = arr1[i]; //min 
			
		}
		System.out.println("max: " + max + " min: " + min);
//		for(int o : arr1) {        //배열보기
//			System.out.println(o);
//		}

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 
		// 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		//int[] arr2 = { 10, 20, 30, 1000, 3, 60, 8, 57, 22, 77};  //배열의값 지정
		int[] arr2 = new int[10]; //10개짜리 배열을 만들어줌
		for(int i = 0; i < arr2.length; i++) {  //i는 0부터 
			arr2[i] = (int) ((Math.random() * 1000) +1); // 랜덤은 1부터 1000까지
			if(arr2[i] %3 == 0) { //arr2에서 3으로 나누었을때 0으로 떨어지는 수를 찾겠다
				System.out.println("3의 배수는: " + arr2[i]); //3의배수는 arr2[i]가 3의 배수인 경우 실행문
			}
			//System.out.println(arr2[i]); // for문 안의 배열의 모든값 볼때 
		}
		

	}
}
