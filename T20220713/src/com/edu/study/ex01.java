package com.edu.study;

public class ex01 {
	public static void main(String[] args) {
		int val = 485; //값을 할당
		int frtNum = val / 100; //1번째수 지정 100으로 나눔
		int secNum = frtNum * 10; //2번째수를 첫번째수를 10으로 나눈수로 지정 
		int thrNum = secNum - 1; //세번째수를 두번째수를 빼기연산한 수로 지정;

		int result = frtNum + secNum + thrNum;
		System.out.println(result);
	}
}
