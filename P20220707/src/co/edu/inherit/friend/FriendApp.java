package co.edu.inherit.friend;
/*
 * 등록, 조회, 목록
 */
import java.util.Scanner;

public class FriendApp {
	//기본 생성자사용
	Friend[] friends = new Friend[10];
	int friendNum;
	
	Scanner scn = new Scanner(System.in);
	
	public void start() {
		while(true) {
			System.out.println("1.등록 2.조회 3.목록 9.종료");
			System.out.println("선택하세용 >>> ");
			
		int selectNo = 0;
			
		try {
			selectNo = Integer.parseInt(scn.nextLine());  //"가" -> 12
				 //여긴갠츙 =  여기서 예외처리해줘야오류안남 try~catch
				} catch(Exception e) {
					System.out.println("숫자를입력하세요");
			}
			if(selectNo == 1) {
				add();
			} else if(selectNo == 2) {
				search();
			} else if(selectNo == 3) {
				list();
			} else if(selectNo == 9) {
				System.out.println("목록 종료합니다. ");
				break;
				
			}
		}
		System.out.println("프로그램 종료합니다. ");
	}//end of start
	private void add() {
		int choice = 0;
		
		while(true) {
		System.out.println("1.학교 2.회사 3.동네");
		System.out.println("선택 >>>");
		
		try {
			choice = Integer.parseInt(scn.nextLine());
			break; 	
		} catch(Exception e) {
			System.out.println("1 2 3 중에 선택하세요");
		}
	}
		System.out.print("이름> ");
		String name =  scn.nextLine();
		System.out.print("연락처> ");
		String phone =  scn.nextLine();
		
		if (choice == 1) {
			System.out.println("학교이름 > ");
			String univ =  scn.nextLine();
			System.out.println("전공 > ");
			String major =  scn.nextLine();
			
			friends[friendNum++] = new UnivFriend(name, phone, univ, major);
			
			} else if(choice == 2) {
			System.out.println("회사이름 > ");
			String company =  scn.nextLine();
			System.out.println("부서명 > ");
			String department =  scn.nextLine();
			
			friends[friendNum++] = new ComFriend(name, phone, company, department);
			
			} else if(choice == 3) {
			friends[friendNum++] = new Friend(name, phone);
			}	
		
	} 
	private void search() {
		//칭구이름 입력=> 친구상세정보: showInfo()로보겠다 는 기능을 만들어라(투스트링이랑비슷)
		System.out.println("찾을 친구이름을 입력하세요 >> ");
		String fName = scn.nextLine();
		
		for(int i = 0; i < friendNum; i++) {
			if(friends[i].getName().equals(fName)) {
				friends[i].showInfo();
			}
		}
		
		
	}
	private void list() {
		for(int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}
	}
	
	private void timerShow(String msg) {     //while 부분에 타이머설정해줘야함
		String[] message = msg.split("");
		for (int i = 0; i < message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(100);   // 100밀리세컨 = 0.1초동아넘춘다는 뜻
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
