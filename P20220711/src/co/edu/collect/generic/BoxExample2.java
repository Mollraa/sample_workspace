package co.edu.collect.generic;

public class BoxExample2 {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
		String result = box.get();
//		Integer reault1 = box.get(); // string -> Integer 못ㅅ씀

		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100);  // int => integer (boxing)
		int result1 = intBox.get();
		
	}
}
