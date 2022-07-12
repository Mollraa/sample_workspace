package co.edu.collect;

import java.util.Stack;

public class StackExample {  //P585~
	public static void main(String[] args) {
		Stack<String> stack= new Stack<>();
		stack.push("백진희");
		stack.push("천진희");
		stack.push("만진희");
		
		String elem = stack.pop();  //요소를 빼냄.
		System.out.println(elem);
		
		elem = stack.peek();  //peek는 값만 가지고 옴. 빼내진않음
		System.out.println(elem);

		elem = stack.pop();
		System.out.println(elem);
		
		if(stack.isEmpty()) {
			System.out.println("스택에 더 요소가 없음");
		}
	}
}
