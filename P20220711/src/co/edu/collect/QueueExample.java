package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {  //P585~
	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		
		que.offer("백진희");
		que.offer("천진희");
		que.offer("만진희");
		
		while (!que.isEmpty()) {
			String result = que.poll();
			System.out.println(result);
			
		}	
 	}
}