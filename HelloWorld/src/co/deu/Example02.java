package co.deu;

public class Example02 {
	//나의키:변수, 친구키:변수
	
	//나의 키가 더 큽니다.
	//나의 키가 더 작습니다.
	public static void main(String[] args) {
	double myHeight = 166.6;
	double frindHeight = 198.5;
	
	double theDifferece = 32.1;
	
	if(myHeight>frindHeight) {
		theDifferece = myHeight - frindHeight;
		System.out.println("나의 키가" + theDifferece + "더 큽니다.");
	} else {
		theDifferece = frindHeight - myHeight;
		System.out.println("나의 키가" + theDifferece + "더 작습니다.");
	}
	}
}