package co.edu.api;

import java.util.ArrayList;

//12장 -01, P500~503
public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100");
		System.out.println(i);

		int i2 = 100;

		ArrayList<Integer> list = new ArrayList<Integer>();  //list는 참조타입
		list.add(100); // 100(int)이라는 정수타입이 = > 100(Integer)인티져 타입으로 박싱. 되엇ㅅ다~
		list.add(200);
		list.add(new Integer(300)); // deprecated 된거는 차후 사용중지.

		for (Integer num : list) {
			System.out.println(num);
		}
		
		//문자열 => 숫자. <레퍼?웨퍼? 클래스>
		int n1 = Integer.parseInt("1000");
		double n2 = Double.parseDouble("23.3");
		
	}
}
