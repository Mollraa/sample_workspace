package co.edu.api;

class Member extends Object {
	String id;
	int age;
	
	@Override  //equals~ 재정의, //논리적으로 동등하다고 하고싶을 때 equals~ 
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			boolean b1 = this.id.equals(((Member) obj).id); 
			boolean b2 = this.age == (((Member) obj). age);
			return b1 && b2;
		}
		return false;
	}
	@Override
	public String toString() {
		return "아이디: " + id + ", 나이: " + age;
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		
		Object obj1 = new Object();  // instance => 주소값.
		Object obj2 = new Object();  // instance => 주소값.
		
		System.out.println(obj1.equals(obj2));  //=> false 
		System.out.println(obj1.toString());    //Object.toString()
		
		
		String name1 = new String("백진희");
		String name2 = new String("백진희");
		
		System.out.println(name1.equals(name2)); //같으면 true 다르면false
		System.out.println(name1.toString()); 		//String.toString()
		
		
		Member member1 = new Member();
		member1.id = "user1";
		member1.age = 10;
		
		Member member2 = new Member();
		member2.id = "user1";
		member2.age = 10;
		
		System.out.println(member1.equals(member2)); //물리적으로 다른 객체, 논리적으로 동일한 객체 ↑(over~)
		System.out.println(member1.toString());		//member.toString()
	}
}
