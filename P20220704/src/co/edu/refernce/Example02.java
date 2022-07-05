package co.edu.refernce;

public class Example02 {
	public static void main(String[] args) {
		//while 반복문 사용.
		//1 ~ 10 출력.
		int i = 1;
		while (i <= 10) {
			System.out.println("i의 값>>" + i);
			i++;
		}
		boolean isTrue = true;
		while(isTrue ) {
			int num = (int)(Math.random() * 10);
			System.out.println("num의 값>>" + num);
			if(num ==5) {
				isTrue = false;
			}
		}
		

		
		
	}
}
