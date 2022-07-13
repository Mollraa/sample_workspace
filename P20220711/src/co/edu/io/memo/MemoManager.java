package co.edu.io.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 등록, 조회, 삭제, 목록
 */
public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>();// 컬렉션
	Scanner scn = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat");

	// 싱글톤 생성자.
	private static MemoManager instance = new MemoManager();

	private MemoManager() {
		// 파일정보 읽어서 => ArrayList.로

	}

	public static MemoManager getInstance() {
		return instance;
	}

	// 메모등록기능. inputData => memoStorage에 메모등록
	public void inputData() {
		System.out.println("메모번호 >> ");
		int no = Integer.parseInt(scn.nextLine()); // 1
		System.out.println("작성날짜 >> ");
		String date = scn.nextLine(); // 2
		System.out.println("내용 >> ");
		String content = scn.nextLine(); // 3

		memoStorage.add(new Memo(no, date, content)); // 1,2,3의인스턴스생성//생성자를 미리해둬서 가능!

	}

	// 날짜 입력하고, 모든메모 출력기능 메소드
	public void search() {
		System.out.println("날짜입력 >> ");
		String memoDate = scn.nextLine();
		boolean isExist = false;

		for (int i = 0; i < memoStorage.size(); i++) {
			if (memoStorage.equals(memoStorage.get(i).getDate()))
				;
			{
				// memoStorage~ 메모스토리지 같은 날짜는 내용을 한건 가지고오겠당
				System.out.println(memoStorage.get(i).toString());
				isExist = true;
			}
		}
		if (!isExist)
			System.out.println("해당날짜의 메모가 없습니다..^^");
	}

	// 번호입력-> 삭제.
	public void deleteData() {
		System.out.println("삭제할 번호를 입력하세요 >> ");
		int delNo = Integer.parseInt(scn.nextLine()); // 같은번호있으면 컬렉션에서 삭제
		Iterator<Memo> iter = memoStorage.iterator();
		while (iter.hasNext()) {
			Memo memo = iter.next();
			if (memo.getNo() == delNo) {
				iter.remove();
				System.out.println("삭제 완료되었습니다!");
				return; // 삭제정상 완료. 메소드종료
			}
		}
		System.out.println("일치하는 번호가 없습니다.");
	}

	// 종료. 후 저장
	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 객체처리해주는 보조스트림 ObjectOutputStream : ArrayList => 바이트배열 변경.
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(memoStorage);
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 파일정보-> 컬렉션.타입으로변경
	@SuppressWarnings("unchecked")
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			memoStorage = (List<Memo>) ois.readObject();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			e.printStackTrace();
		}

	}
}
