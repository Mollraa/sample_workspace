package co.edu.collect.generic;
/*
 * 제네릭 : 타입을 클래스 정의시점이 아니라, 사용시점에 지정
 */
public class Box<T> {   // T. 이나 아무거나 대문자쓰면 타입을 나중에 지정하겠다~ 는 뜻
	private T obj; // Object클래스는 최상위클래스라서 모든 메소드를 다받을수있음

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}
