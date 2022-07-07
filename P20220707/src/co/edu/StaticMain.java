package co.edu;
/*
 * static 정적메소드, 정적필드 사용.
 */
public class StaticMain {
	public static void main(String[] args) {
		//static(정적) 기능. / 위닝 파란색 = 오류는 안뜨지만 이렇게 쓰지마세요~라는의미
		Calculator cal = new Calculator();
		System.out.println(cal.pi);
		
		System.out.println(Calculator.pi);
		int result = Calculator.sum(10,20);
		
//		Math.random();  //클레스에 호출되어있어서 바로사용가능, 정적에서만 사용가능
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2); // ==는 sing1 sing2를 비교해보겠다는 뜻
		
	}

}
