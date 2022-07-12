package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 키 : 값 쌍으로 저장하는 => Map타입  P.570~
 */
public class HashMapExample {
	public static void main(String[] args) {
		//학생이름, 점수
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("백진희", 80);
		map.put("노은경", 85);
		map.put("김민지", 90);
		map.put("백진희", 89); //키가 동일한 값이면 val 새로운 값으로 변경.
		
		int score = map.get("백진희"); //값을 얻기위해 키를 get(키)사용해줌
		System.out.println(score);
		
		map.remove("백진희");
		
		//반복요소.
		Set<String> keySet = map.keySet(); //"키" => 새로운 set 컬렉션에 담아주겠다
		
		//확장 for 구문.
		for(String key : keySet) {
			Integer val = map.get(key);
			System.out.println("키: " + key + "값: " + val);
		}
		
		//키, 값 => entrySet()
		Set<Entry<String, Integer>> entrySet = map.entrySet();  //map.entrySet(); 해주는 이유 맵에서 값을 하나만 가져올수없어서
		
		for (Entry<String, Integer> ent : entrySet) {
			String key = ent.getKey();      //엔터리가 가지고있는 값으로 key에 해당 값만 읽어주겠다
			Integer val = ent.getValue();   //값 ''
			System.out.println("키: " + key + "값: " + val);
			
		}
	}
}
