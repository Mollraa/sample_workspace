package co.deu;

public class Example03 {
	public static void main(String[] args) {
		// 10+20 => 30  , "10"+"20" => "1020"
		System.out.println(10+20);
		System.out.println("10" + "20");
		//String 백진희 = "Beak";
		
		// 내 이름은 "홍길동" 입니다.
		System.out.println("내 이름은 \n백진희\n 입니다. ");
		//{"name":"qorwlsgml", "age":20} json데이터타입.
		System.out.println("{\"name\":\"백진희\", \"age\":20}");

	    //문자열 -> 정수,실수
		int num1 = Integer.parseInt("100"); //"100"-> 100
		double num2 = Double.parseDouble("123.4");
		double num3 = Double.parseDouble("112.1");
				
		double result = sum(num1, num2);
		result = minus (num2, num3);
		System.out.println("합결과: " + result);
		//print는 줄바꿈안됨 println은 줄바꿈포함
		System.out.printf("차이는 %10.2f 입니다.", result);
		
		System.out.printf("저의 이름은 %s이고 나이는%d 입니다.", "백진희", 26);
		
		//이름, 나이, 몸무게 = 3개변수선언.
		//나의 이름은 백진희이고
		//나이는 26살이고 
		//몸무게는 48.5이고싶다요^^.
		
		String name = "백진희";
		int age = 50;
		double weight = 166.6;
		
		System.out.printf("\n저의 이름은 %s이고 \n나이는 %d살이고 \n몸무게는 %.1f이고 싶다요^^", name, age, weight);
		
	}
	
	//2개의 숫자를 반환한 결과를 반환해주는 것이 method.
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum; 
		
	}
	
	//int와 double을 받아서 결과값을 
	public static double sum(int n1, double n2) {
	double sum = n1 + n2;
	return sum;
	}
	
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;


	}
}
