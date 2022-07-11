package co.edu.api;

public class StringCharAtExample {
	public static void main(String[] args) {
		
		String ssn = "010624-239123";
		ssn = "0106241230123";  //인덱스 값으로 7번쨰까지 포함해서 여자로뜸
		checkGender(ssn);
		
		//String ssn 만할땐 char~ 여자입니다까지 복붙하깅
		
	} // end of main()
	
	public static void checkGender(String ssn) {
		char sex = ssn.charAt(7);
		if(ssn.length()==13) {     //if = , ssn= 일때, 전체문자 배열이 13이고 6번째 자리로 성별을 구분하겠습니다~
			sex = ssn.charAt(6);
		}
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
		}
	}
}
