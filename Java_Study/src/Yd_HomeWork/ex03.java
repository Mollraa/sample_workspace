package Yd_HomeWork;

public class ex03 {
	public static void main(String[] args) {
	/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
    출력예시) int a = 10; 의 경우 "10, int"로 출력. */

//3-1) byte var1 = 128;
//3-2) char var2 = "B";
//3-3) String var3 = 44032;
//3-4) int var4 = 100000000000;
//3-5) float var5 = 43.93106;
//3-6) long var6 = 301.3;
		
		int var1 = 128; //변수타입수정
		System.out.printf("%d, int\n", var1);
		String var2 = "B";
		System.out.printf("%s, String\n", var2);
		int var3 = 44032;
		System.out.printf("%d, int\n", var3);
		long var4 = 100000000000L;
		System.out.printf("%d, long\n", var4);
		double var5 = 43.93106;
		System.out.printf("%.5f, double\n", var5);
		double var6 = 301.3;
		System.out.printf("%.1f, double\n", var6);
		
}
}