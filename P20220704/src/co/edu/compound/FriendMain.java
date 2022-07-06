package co.edu.compound;

public class FriendMain {
	public static void main(String[] args) {
		
		//f1
		Friend f1 = new Friend();
//		f1.fullname = "박경도";
		f1.setFullName("박경도");
		
//		f1.phone = "010-1234-5678";
		f1.setphone("010-1234-5678");
		
//		f1.mail = "kdkd@naver.com";
		f1.setMail("kdkd@naver.com");
		
//		f1.birth = "9월 21일";
		f1.setBirth("9월 21일");
		
//		f1.height = 174.5;
		f1.setHeigth(174.5);
		System.out.println("키는: " + f1.getHeight());
		
//		f1.weight = 75.5;
		
		f1.showInfo();

	 }
}
