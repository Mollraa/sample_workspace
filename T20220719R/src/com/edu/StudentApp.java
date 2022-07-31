package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	Scanner scn = new Scanner(System.in);
	List<Student> list = new ArrayList<Student>();

	public void execute() {
		while (true) {
			System.out.println("1.등록 2.수정 3.리스트 9.종료");
			System.out.println("선택 > ");
			int selectNum = Integer.parseInt(scn.nextLine());

			if (selectNum == 1) { // 등록
				while (true) {
					System.out.println("1.고등학생  2.대학생");
					System.out.println("선택 > ");
					int select = Integer.parseInt(scn.nextLine());

					if (select == 1) {
						System.out.println("[ 고등학생 ]");
						System.out.println("학생 번호 > ");
						String studNo = scn.nextLine();
						System.out.println("학생 이름 > ");
						String studName = scn.nextLine();
						System.out.println("점수 > ");
						int score = Integer.parseInt(scn.nextLine());
						System.out.println("담임교사 > ");
						String teacher = scn.nextLine();
						System.out.println("학년정보 > ");
						String grade = scn.nextLine();
						break;
					} else if (select == 2) {
						System.out.println("[ 대학생 ]");
						System.out.println("학생 번호 > ");
						String studNo = scn.nextLine();
						System.out.println("학생 이름 > ");
						String studName = scn.nextLine();
						System.out.println("점수 > ");
						int score = Integer.parseInt(scn.nextLine());
						System.out.println("담임교사 > ");
						String prof = scn.nextLine();
						System.out.println("전공정보 > ");
						String major = scn.nextLine();
						break;
					}

				}
			} else if (selectNum == 2) {
				System.out.println("수정할 학생번호: ");
				String studNo = scn.nextLine();
				for (int i = 0; i < list.size(); i++)
					if (studNo.equals(list.get(i).getStudNo())) {
						System.out.println("선택 >>");
						int select = Integer.parseInt(scn.nextLine());
						if (select == 1) {
							System.out.println("[ 고등학생 ]");
							System.out.println("학생 번호 > ");
							String studNo2 = scn.nextLine();
							System.out.println("학생 이름 > ");
							String studName = scn.nextLine();
							System.out.println("점수 > ");
							int score = Integer.parseInt(scn.nextLine());
							System.out.println("담임교사 > ");
							String teacher = scn.nextLine();
							System.out.println("학년정보 > ");
							String grade = scn.nextLine();
							break;
						} else if (select == 2) {
							System.out.println("[ 대학생 ]");
							System.out.println("학생 번호 > ");
							String studNo2 = scn.nextLine();
							System.out.println("학생 이름 > ");
							String studName = scn.nextLine();
							System.out.println("점수 > ");
							int score = Integer.parseInt(scn.nextLine());
							System.out.println("담임교사 > ");
							String prof = scn.nextLine();
							System.out.println("전공정보 > ");
							String major = scn.nextLine();
							break;
						}
					}
					System.out.println("수정되었습니다.");
			} else if (selectNum ==3) {
				System.out.println("--------수정리스트--------");
				StudentList();
			}

		}

	}
}
