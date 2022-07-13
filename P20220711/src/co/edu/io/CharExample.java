package co.edu.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharExample {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			char[] cbuf = new char[10];
			int buf = 0;
			while ((buf = fr.read(cbuf)) != -1) { // if (buf == -1)~break;
				for (int i = 0; i < buf; i++) {
					System.out.print(cbuf[i]); // 읽어들인 버프의 크기만큼 반복
				}
				System.out.println();
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	//
	public static void reader1() {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt"); // FileReader = file값을 2b 씩 읽어주겠다는 뜻

			while (true) {
				int buf = fr.read();
				if (buf == -1) { // 더이상 읽을값 X = -1 로 빠져나온겟다
					break;
				}
				System.out.println((char) buf); // 읽을 값을 char(캐릭터)타입으로 바꿔서 출력
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

//문자열 기반 출력 스트림
	public static void writer1() {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력 > ");
		String txt = "";

		try {
			FileWriter fw = new FileWriter("c:/Dev/test.txt");// 출력스트림
			while (true) {
				try {
					txt = scn.nextLine();
				} catch (NoSuchElementException e) { // ctrl z.
					break;
				}
				fw.write(txt + "\n"); // 읽어올때마다 줄바꿈해쥬면 보기편함
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행."); // 실행완료 했다는 뜻
	}

}
