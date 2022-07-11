package co.edu.api;

import java.util.HashSet;

public class BoxingUnboxingEx {
	public static void main(String[] args) { //책 예제p507
		// 로또번호 생성. 1~45
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int temp = (int) (Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {  //현재값과 동일한 값이 있는지 체크해쥼.
				//code HERE. 집가서 적어보기 7/11↓ , 반목문+조건문써서 중복된 값은 제외하는거 만들어보기
				
			}
		}
		
		for (int num : lotto) {
			System.out.println(num);
		}

		HashSet<Integer> set = new HashSet<Integer>(); //응용, 중복되는 번호는 같은 값으로 만들어주는거 ^^

		int cnt = set.size(); // 1,2,3,3, => 3
		while(cnt < 6) {
			int temp = (int)(Math.random() * 45) + 1;
			set.add(temp); //중복된 값은 허용안함
			cnt = set.size();
			System.out.println(temp + "," + set.size());
		}

	}

}
