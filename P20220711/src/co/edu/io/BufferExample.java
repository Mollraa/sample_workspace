package co.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 보조소트림 생성. 바이트기반 => 문자기반 (InputStreamReader, OutputStreamWriter)
 *             버퍼스트림(성능향상)
 */
public class BufferExample {
	public static void main(String[] args) {
		streamToReader();
	}

	// 버퍼스트림
	public static void bufferReaderWriter() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png"); //기본
			BufferedInputStream bis = new BufferedInputStream(fis);  //보조

			FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.png");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			while (true) {
				int bt = bis.read();
				if (bt == -1) {
					break;
				}
				bos.write(bt);
			}
			bos.flush();
			bos.close();
			bos.close();
			fis.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행되었습니다.^^");
	}

//
	public static void streamToReader() {
		InputStream is = System.in; // 키보드입력.
		InputStreamReader isr = new InputStreamReader(is);
		char[] cbuf = new char[10];// 10개만 일어랏
		System.out.println("입력하세요 >> ");
		try {
			int b = isr.read(cbuf);
			for (int i = 0; i < b; i++)
				System.out.print((char) cbuf[i]);

			System.out.println(); // 줄바꿈표시
			isr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행되었습니다.^^");

	}

//
	public static void streamToWriter() {
		// 바이트단위 스트림 -> 문자 스트림.
		OutputStream os = System.out; // 키보드입력. 모니터출력//
		OutputStreamWriter osw = new OutputStreamWriter(os);

		Scanner scn = new Scanner(System.in);
		System.out.println("입력 > ");

		String text = scn.nextLine();

		try {
			osw.write(text + "\n");
			osw.write("실행.");
			osw.flush();
			osw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
