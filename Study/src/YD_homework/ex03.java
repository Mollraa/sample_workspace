package YD_homework;
import java.util.Scanner;

//3차과제
public class ex03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0 제4사분면 : x>0, y<0
		// 제2사분면 : x<0, y>0 제3사분면 : x<0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제

//		int x = scn.nextInt(); // 정수입력값을 받는다.
//		int y = scn.nextInt();
//
//		if (x > 0) {      // 이중 if문
//			if (y > 0) { // 조건식1 x,y가 0보다 크면 1사분면
//				System.out.println("제1사분면");
//			} else { // x는 true y는 false이면 4사분면
//				System.out.println("제4사분면");
//			}
//		} else if (x < 0) {
//			if (y < 0) {
//				System.out.println("제3사분면 : x<0, y<0");
//				// 조건식2는 x, y가 0보다 작으면 3사분면
//			} else if (y > 0) {
//				System.out.println("제2사분면 : x<0, y>0");
//				// 조건식3은 x는0보다 크고 y는 0보다 작을때 2사분면,
//				// 1조건식에서 if y>0 이기 때문에 새롭게 조건문 작성
//			}
//		}

// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
// HiNT : 이중 IF문 사용
// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
//	int cal = scn.nextInt();
//	
//	if (cal % 4 ==0 ) {
//		if(cal % 100 !=0 || cal % 400 ==0) {
//			System.out.println("윤년입니다~");
//		} else {
//			System.out.println("윤년이 아닙니다~");
//		}
//	}
//	
//	

// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 
// 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록 구현하세요.
// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.

// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
// *
// **
// ***
// ****
// *****
		for (int i = 1; i <= 5; i++) { // i는 1~5까지 반복
			for (int j = 1; j <= i; j++) { // j는 1부터 i까지 반복해준다
				 System.out.print("*"); //결과값은 *
			}
			System.out.println();
		}

// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
// 2 X 1 = 2
// 2 X 2 = 4
// 2 X 3 = 6
		for (int m = 2; m <= 3; m++) { // m은 2부터 3까지의 반복문이다.
			for (int n = 1; n <= 9; n++) { // 중첩반복문 n은 1~9까지 반복하며, m이2일때 1~9번 변한다.
				// System.out.println(m + " x " + n + "=" + (m*n));
			}
		}

	}
}
