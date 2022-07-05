package co.edu.refernce;

public class NestLoopExample01 {
	public static void main(String[] args) {

		for (int j = 1; j <= 3; j++) { // i가 1보다 작거나 같습니다. 3번 반복하겠습니다
//			System.out.println("j의 값: " + j);
			for (int i = 1; i <= 5; i++) { // i가 1보다 작거나 같습니다. 5번 반복하겠습니다
//				System.out.println("i의 값: " + i);
			}
		}

		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) { // 반복문에 ; 안함, 결과값 한줄이면 {} 생략가능
//				System.out.printf("%d * %d = %d \n", j, i, (j * i));
			}
//			System.out.println( );
		}
//---*		
//--**
//-***
//****
		for (int i = 1; i <= 4; i++) {            // P.161
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		 }
		
	}
}
