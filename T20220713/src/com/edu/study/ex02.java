package com.edu.study;

public class ex02 {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= 0; j--) {
				if (i > j) {
					System.out.printf(" ");
				} else
					System.out.printf("*");
			}
		}
		System.out.println(" ");
	}

}
