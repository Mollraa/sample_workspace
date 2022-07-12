package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 이름, 점수 => map저장.  (map을 잘활용하면 간단한 구조들을 해결하기조타, 데이터 저장 방법을 잘 기억하자)
 * 백진희 80, 노은경 75, 김민지 88
 * Scanner 클래스 입력 => 학생이름 입력 -> 점수 반환.
 */
public class MapExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("백진희", 80);
		students.put("노은경", 75);
		students.put("김민지", 88);
		//출력결과:
		//평균점수: 81
		//최고점수: 88, 최고점수 학생이름: 김민지.
		int max = 0;
		String name1 = "";
		
		Set<Entry<String, Integer>> set1 = students.entrySet();
		for(Entry<String, Integer> ent : set1) {
			if(ent.getValue() >= max) {
				max = ent.getValue();
				name1 = ent.getKey();
			} 
		}
		System.out.println("최고점수: " + max + "최고점수 학생이름: " + name1);
		
		double avg = 0; //평균구하기 
		
		
		
		
		
		
		//학생이름으로 검색.
		System.out.println("학생이름을 입력하세요: ");   // 요기까지 어케만들어봄
		String name = scn.nextLine();
		
		Set<Entry<String, Integer>> set = students.entrySet();
		
		for (Entry<String, Integer> ent : set) {
			if(ent.getKey().equals(name)) {
				System.out.println("학생의 점수: " + ent.getValue());
			}

		}
	}
}
