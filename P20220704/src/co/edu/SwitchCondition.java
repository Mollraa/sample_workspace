package co.edu;

public class SwitchCondition {
	public static void main(String[] args) {
		
		int result = (int) (Math.random() * 6) + 1; //0 <= temp < 1
		if(result == 1) {
			System.out.println("1번 출력.");
		} else if (result == 2) {
			System.out.println("2번 출력.");
		} else if (result == 3) {
			System.out.println("3번 출력.");
		}	else if (result == 4) {
			System.out.println("4번 출력.");
		}	else if (result == 5) {
			System.out.println("5번 출력.");
		}	else if (result == 6) {
			System.out.println("6번 출력.");
		System.out.println(result);
		}
// 		switch : 케이스에 해당되는 경우가 만나지면 차곡차곡 실행시킨다. 출력하고 싶은 번호는 break로 지정
		switch(result) {
		case 1: 
			System.out.println("1번 출력."); break;
		case 2:
			System.out.println("2번 출력."); break;
		case 3:
			System.out.println("3번 출력."); break;
		case 4:
			System.out.println("4번 출력."); break;
		case 5:
			System.out.println("5번 출력."); break;
		case 6:
			System.out.println("6번 출력.");
		}
		
	}
}
