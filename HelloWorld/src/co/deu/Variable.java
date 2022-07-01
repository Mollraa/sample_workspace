package co.deu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 127; // -128 < byte < 127
	    short s1 = 0; // 128*2*2*2*2*2*2*2*2* 
	    int n1 = 0; // -2147283648 < int < 214~~
	    long l1 = 0; // 19~~~ 책p,60
	    
	    
	    int result = b1 + 20; // (int) b1 +20;
	    long result1 = l1 + (long) 20; //데이터타입 변환: 자동현변환
	    result = (int) l1 + 20; // 강제형변환(casting)
	    System.out.println(result);
	    
	    char c1 = 'a'; 
	    c1++; //정수는 기본적으로int연산, ++는 c1에 1을 더한다는의미 
	    for (int i = 0; i <25; i++) {
	    	System.out.println(c1++);
	    	
	    	
	    	
	    	//이력변경추가 2022.07.01 12:55
	    	System.out.println("이력변경추가. ");
	    }
	}
}


