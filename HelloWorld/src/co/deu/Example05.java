package co.deu;

import java.util.Scanner; //Scanner 쓸때 필수 입력.

public class Example05 {
      public static void mian(String[] args) {
    	  
        //String name = new String("백진희");
    	 System.out.println("값을 입력.");
    	 Scanner sn = new Scanner(System.in);
    	  //원래 변수입력시 String name = new String("백진희") 이렇게 해야함
    	 
    	  //String input = sn.nextInt(); //문자로 읽을 때 
    	  //System.out.printf("입력값은 %s , input");
 
          //int input = sn.nextInt();// 정수
    	  //System.out.printf("입력값은 %s", input);
    	  
    	  System.out.println("첫번째 값을 입력. ");
    	  int num1 = sn.nextInt();
    	  
    	  System.out.println("두번째 값을 입력. ");
    	  int num2 = sn.nextInt();
    	  
    	  int result = 0;
    	  
    	  if(num1>num2) {
    		  result = num1 - num2;
    		  System.out.printf("입력값%d와 %d의 차이는 %d입니다.");
      }   else {
    	      result = num2 - num1;
    	      System.out.printf("입력값%d와 %d의 차이는 %d입니다.");
      }
    	  
    	  
    	  //int result = num1 + num2; //입력 2수의 합.
    	  //System.out.pribtf("입력값%d와 %d의 차이는 %d 입니다.", num1, num2, result);
    	  //System.out.printf("");
    	  //입력값 10와 20의 합은 30입니다.
    	  
      }
}
