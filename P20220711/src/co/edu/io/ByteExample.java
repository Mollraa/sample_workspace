package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("C:/Dev/image.png");
			FileOutputStream fos = new FileOutputStream("C:/Dev/image3.png");
			byte[] buff = new byte[100];

			while (true) {
				int buf = fis.read(buff);
				if (buf == -1) {
					break;
				}
				fos.write(buff);
			}
			fos.flush();
			fos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.printf("처리시간: " + (end - start));

	}

	//
	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
			byte[] arr = new byte[2];
			while (true) {
				fis.read(arr); // 10,20,30, =>2byte씩 읽어주겠다
				int buf = fis.read(arr);
				if (buf == -1) {
					break;
				}
				for (int i = 0; i < buf; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	// byte기반 출력 스트림
	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");

			while (true) {
				int buf = fis.read();
				if (buf == -1) {
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20, c = 30;
			fos.write(a);
			fos.write(b);
			fos.write(c);

			fos.flush();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}
}
