package co.edu.refernce;

public class DataTypeExample02 {
	public static void main(String[] args) {
		//기본데이터타입.(byte, short, long, int, float, double, boolean)
		int num1 = 100;
		int num2 = 100;
		
		System.out.println(num1 == num2);
		
		//참조데이터타입.
		String str1 = new String("백진희희"); // 백진희희 객체 주소 값
		String str2 = new String("백진희희"); // 백진희희 객체주소 값
		System.out.println(str1 == str2); //변수의 주소비교
		System.out.println(str1.equals(str2)); // 값을 비교 -> equals 사용!!
		
		int result = 0;
		str1 = null; //값을 초기화 -> null
		System.out.println(str1.equals(str2)); //값을 비교
		
		
	}

}
