package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		// 데이터 저장 => 배열.
		// 컬렉션 ArrayList => 인덱스값 지정(O), 동일한 값 다른 인덱스)
		// 컬렉션 HashSet => 인덱스값 지정(X), 동일한값 저장(X)

		HashSet<String> set = new HashSet<String>(); // 14장~ 중복된 값은 안받아들입니데이~ set컬렉션
		set.add("백진희");
		set.add("천진희");
		set.add("백진희");

		System.out.println(set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {					//hasNext : 컬렉션에서 가지고 올 요소 체크.
			System.out.println(iter.next());    //next : 요소 선택.
		}
		
		
		System.out.println("=== ArrayList ===");   //14장 내용
		ArrayList<String> list = new ArrayList<String>();
		list.add("백진희");
		list.add("만진희");
		list.add("백진희");

		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
