package S.Study;
	
	public class ex01 {
		public static void main(String[] args) {
			//변수 넘을 랜덤으로 받겠습니다~
			int num = (int) (Math.random() * 6) + 1; //+1은 0말고 1부터 시작해주겠다는 뜻
			//조건문 //변수 
			switch(num) {
				case 1:
					System.out.println("1번이 나왔습니다.");
				break; // 조건을 만족하면 멈춘다.
				case 2:
					System.out.println("2번이 나왔습니다.");
					break;
				case 3:
					System.out.println("3번이 나왔습니다.");
					break;
				case 4:
					System.out.println("4번이 나왔습니다.");
					break;
				case 5:
					System.out.println("5번이 나왔습니다.");
					break;
				default: //위의 조건이 모두 아닌경우 출력
				System.out.println("6번이 나왔습니다.");
			}
	}
}
