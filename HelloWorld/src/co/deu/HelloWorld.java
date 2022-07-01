package co.deu;

public class HelloWorld {
   public static void main(String[] args) {
	   // 변수의 종류: int(정수), double(실수), boolean(논리), String(문자열)
	   //int(4byte) < double(8byte)
	   //정수: byte(1b) < short(2b) < int(4b) < long(8b)
	   String name = "백진희짱!";
	   name = "10";
	   //my_age
	 
	   int myAge = 20; //선언하면서 값을 할당 => 초기화. 두번째 단어의첫글자는 무조건대문자
	   int yourAge; // 선언 : 초기화(X)
	   yourAge = 22;
	   double height = 162.4;
	   boolean isMarried = true;
	   String myAddress = "대구시";
			   
	   myAge = 30;
	   height = 165.2;
			
	   int result = myAge + yourAge;// 변수는 사뇬기위해 값이 할당되어있어야함
	   double result1 = (double) myAge + yourAge;
	   System.out.println(result);
	   
       System.out.println("안녕하세요~ " + name + "입니다>_<");
   }
}
