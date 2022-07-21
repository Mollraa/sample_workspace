package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	Scanner scn = new Scanner(System.in);
	List<Student> list = new ArrayList<Student>();

	   public void execute() {
	   while(true) {
	      System.out.println("1.등록 2.수정 3.리스트 9.종료");
	      System.out.println("선택 > ");
	      int selectNum = Integer.parseInt(null);
	      
	      if(selectNum == 1) { //등록
	         System.out.println("1.고등학생  2.대학생");
	         System.out.println("선택 > ");
	         int choose = Integer.parseInt(scn.nextLine());
	         System.out.println("학생 번호 > ");
	         String studNo = scn.nextLine();
	         System.out.println("학생 이름 > ");
	         String studName = scn.nextLine();
	         System.out.println("점수 > ");
	         int score = scn.nextInt();
	      }
	      
	   }
	   }
}
	    

