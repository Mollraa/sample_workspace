package co.edu.exception;

/*
 * 인스턴스 참조변수 = null
 */
public class NullpointerEx {
	public static void main(String[] args) {

		String name = "백진희";
		name = null;

		try {
			System.out.println(name.toString());

			System.out.println("name 을 출력. ");
		} catch (NullPointerException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();  //어디서 에러난지 알려주는거
		}
		
		System.out.println("프로그램 종료. ");
	}
}
