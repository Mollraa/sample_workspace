package co.edu.collect;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * 중복요소 제거.
 * Set컬렉션에 중복여부 체크 => HachCode, equals => true;
 */

class Member {
	private int id;
	private String name;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override // 소스 -> 투스트링 들어가서 생성
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	@Override  //동일한 객체입니다~ 
	public int hashCode() {  //인스턴스마다 고유한 값.
		return this.id;      //id가 같으면. 동일한 객체입니다~ 
	}

	@Override //아이디, 이름 => 논리적을 동등한 객체 설정해주는거
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member) obj;
			return this.id == mem.id && this.name.equals(mem.name);  //이름 아이디 같으면 동일한 객체로봄
		}return false;
	}

}

public class SetMemberExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();
		members.add(new Member(10, "백진희"));
		members.add(new Member(20, "천진희"));
		members.add(new Member(30, "백진희"));
		members.add(new Member(10, "백진희")); //같은 10번이라도 인스텀스값이 달라서, 출력됨 //중복제거: HashCode, equals 메소드정의. 중복제거해줌
		
		members.clear();  //요소제거. 모든 멤버를다지우겠쌌!
		if(members.isEmpty()) {
			System.out.println("컬렉션이 비어 있음.");
		}
		
		
		for (Member member : members) {
			System.out.println(member.toString());
		}

	}
}
