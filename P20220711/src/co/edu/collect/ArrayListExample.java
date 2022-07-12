package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("100");

		for (int i = 0; i < list.size(); i++) {
			String result = (String) list.get(i);
			System.out.println(result);
		}

		// List 컬렉션. List(인터페이스) => ArratyList, LinkedList. Vector중요☆☆☆☆☆☆☆☆☆☆☆
		List<String> sList = new ArrayList<String>();
		sList.add("백진희");
		sList.add("노은경");
		String result = sList.get(1); // 값을 읽어올 때.
		sList.remove(0); // 바꿀때
		sList.set(0, "김민지"); // 바꿀꺼

		Iterator<String> iter = sList.iterator(); // 반복자요소 생성. 중요☆☆☆☆☆☆☆☆☆☆☆
		while (iter.hasNext()) { // 요소의 존재여부를 체크
			String val = iter.next(); // 요소를 가지고오는 메소드
			System.out.println(val);
		}

		// index 기반으로 요소를 저장.중요☆☆☆☆☆☆☆☆☆☆☆
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		//확장 for구문. 확장자를 통해서 요소를 가지고오겠습니다~중요☆☆☆☆☆☆☆☆☆☆☆
		for(String val  : sList) {
			System.out.println(val);
		}
	}
}
