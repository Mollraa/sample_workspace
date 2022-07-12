package co.edu.exception;

import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 예외 떠넘기기 460p
 */

public class ThrowExceptionEx {
	public static void main(String[] args) {

		try {
			method1();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void method1() throws ClassNotFoundException, SQLException {

		Class.forName("java.lang.String"); // 익셉션을 상속받았기 때문에 무조건 예외처리해줘야한당, throws~ 이 메소드를 호출한 영역으로 가서 예외처리를 한다는ㄲ뜻

		DriverManager.getConnection("", "", "");
	}

}
