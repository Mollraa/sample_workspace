package com.edu.d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		while (true) {
			System.out.println("1.등록 2.수정 3.리스트 9.종료");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == １) {
				while (true) {
					System.out.println("1. 대학생 | 2. 고등학생 ");
					System.out.print("선택 >> ");
					int select = Integer.parseInt(scn.nextLine());
					if (select == 1) {
						System.out.println("학번을 입력해세요 >");
						String studNo = scn.nextLine();
						System.out.println("학생이름 입력 > ");
						String CollegeStudent = scn.nextLine();
						System.out.println("학점을 입력->");
						int score = Integer.parseInt(scn.nextLine());
						System.out.println("담당교수 입력 > ");
						String professor = scn.nextLine();
						System.out.println("전문과목 입력 > ");
						String major = scn.nextLine();
						CollegeStudent st = new CollegeStudent(studNo, CollegeStudent, score, professor, major);
						addStudent(st);
						break;
					} else if (select == 2) {
						System.out.println("학생 번호 입력 > ");
						String studNo = scn.nextLine();
						System.out.println("학생이름정보 입력 > ");
						String highstudent = scn.nextLine();
						System.out.println("학생점수입력");
						int score = Integer.parseInt(scn.nextLine());
						System.out.println("담인교사 입력> ");
						String thomerteach = scn.nextLine();
						System.out.println("학년정보입력> ");
						String highst = scn.nextLine();
						HighStudent Highst = new HighStudent(studNo, highstudent, score, thomerteach, highst);
						addStudent(Highst);
						break;
					}
				}
			} else if (selectNo == 2) {
				System.out.println("수정할 학생번호 : ");
				String studNo = scn.nextLine();

				for (int i = 0; i < list.size(); i++)
					if (studNo.equals(list.get(i).getStudNo())) {
						System.out.println("1. 대학생 | 2. 고등학생 ");
						System.out.print("선택 >> ");
						int select = Integer.parseInt(scn.nextLine());
						if (select == 1) {
							System.out.println("학번을 입력해세요 >");
							String studNo2 = scn.nextLine();
							System.out.println("학생이름 입력 > ");
							String CollegeStudent = scn.nextLine();
							System.out.println("학점을 입력->");
							int score = Integer.parseInt(scn.nextLine());
							System.out.println("담당교수 입력 > ");
							String professor = scn.nextLine();
							System.out.println("전문과목 입력 > ");
							String major = scn.nextLine();
							CollegeStudent st = new CollegeStudent(studNo2, CollegeStudent, score, professor, major);
							addStudent(st);
							break;
						} else if (select == 2) {
							System.out.println("학생 번호 입력 > ");
							String studNo2 = scn.nextLine();
							System.out.println("학생이름정보 입력 > ");
							String highstudent = scn.nextLine();
							System.out.println("학생점수입력");
							int score = Integer.parseInt(scn.nextLine());
							System.out.println("담임교사 입력> ");
							String thomerteach = scn.nextLine();
							System.out.println("학년정보입력> ");
							String highst = scn.nextLine();
							HighStudent Highst = new HighStudent(studNo2, highstudent, score, thomerteach, highst);
							addStudent(Highst);
							break;
						}
					}
				System.out.println("수정됬습니다.");
				
			} else if (selectNo == 3) {
				System.out.println("====리스트====");
				stdudentList();
				
			} else if (selectNo == 9) {

				System.out.println("프로그램 종료 중....");
				break;
			}

		}
		System.out.println("!프로그램 종료!");

	}

	public void addStudent(Student student) {
		list.add(student);

	}

	public void modStudent(Student student) {
	
	}

	public void stdudentList() {
		for(int i=0; i<list.size(); i++) {
			
			System.out.println("전체 학생 정보"+list.get(i));
			list.addAll(list);
		}
	}

}
