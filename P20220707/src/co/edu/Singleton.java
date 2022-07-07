package co.edu;
/*
 * 인스턴스를 여러개 생성하지 않고, 하나만 존재.
 */
public class Singleton {
	//클래스는 자신의 이름을 필드로 가질수있당
	private static Singleton instance = new Singleton();  //static~ 소속되 하나만 만들겠다는 의미
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
		
	}
	

}
