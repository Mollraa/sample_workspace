package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



/*
 * 중요☆☆☆☆☆☆☆☆☆☆☆ P.565~
 * set (인터페이스) => HashSet, TreeSet
 */
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("딸기딸기>_<");
		set.add("망고망고~");
		set.add("수박쥬스>_<");
		set.add("딸기딸기>_<");
		System.out.println("크기: " + set.size());   //중복된 딸기값은 제외됨
		
		set.remove("딸기딸기>_<");  //index값이 없어서 직접 삭제해줘야함
		System.out.println(set.contains("딸기딸기>_<"));
		
		if (set.isEmpty()) {
			System.out.println("컬렉션이 비어있음.");
		}

		//반복요소처리.
		Iterator <String> iter = set.iterator(); // iterator 반복자를 불러옴
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		
		//반복처리
		iter = set.iterator(); // 반복자를 획득
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		
		//확장 for
		for(String val : set) {
			System.out.println(val);
		}
	}

}
