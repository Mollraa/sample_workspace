package co.edu.exception;

public class ThrowExceptionEx2 {
	public static void main(String[] args) {

		String[] str = { "100", "200", null, "ten" };

		try {
			subMethod(str);
		} catch (NumberFormatException e) {
			System.out.println("예외종류: NumberFormat 예외. ");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("예외종류: 배열의 범위 초과 예외. ");   //지금 설정한배열은 4개인데 아래에 작성한것 처럼 5개로하면 뜨는 문구
		} catch (Exception e2) {
			System.out.println("그외 예외: 알 수 없는 예외. ");
		} finally {  //try안 에서 정상적으로 실행, 예외가 발생, 상관없이 무조건! 반드시! 실행할 코드.
			System.out.println("그램그램 정상 종료.");
		}
		
		System.out.println("프로그램 종료");
		
	}

	public static void subMethod(String[] strAry) // 실행하는 시점에 발생 할 수 있는 예외를 위(try~ )에서 직접처리해줘야한다
			throws NumberFormatException, ArrayIndexOutOfBoundsException {
		
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(strAry[i]);
			System.out.println(num);
		}

	}
}
