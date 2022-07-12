package co.edu.emp;

import java.util.Calendar;

/*
 * Calendar 클래스연습.
 */
public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 오늘날짜불러올려면
//		System.out.println(cal.get(Calendar.YEAR) + "년");                //캘린더가 가지고있는 년도정보
//		System.out.println(cal.get(Calendar.MONTH)+ 1 +"월");             //캘린더가 가지고있는 월정보 0~11까지 있어서 +1해주깅
//		System.out.println(cal.get(Calendar.DATE) + "일");                //
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");       //1(일)~7(토)
//		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일");  //말일날짜.

//		cal.set(2022, 5, 1); //2022년 6월 1일지정할려면
//		System.out.println(cal.get(Calendar.YEAR) + "년");                //캘린더가 가지고있는 년도정보
//		System.out.println(cal.get(Calendar.MONTH)+ 1 +"월");             //캘린더가 가지고있는 월정보 0~11까지 있어서 +1해주깅
//		System.out.println(cal.get(Calendar.DATE) + "일");                //
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");       //1(일)~7(토)
//		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일");  //말일날짜.

//		int year = 2022;
//		int month = 8;
//		System.out.printf("%d년 %d월의 마지막날짜는 %d\n", year, month, getLastDate(year, month));
//		System.out.printf("%d년 %d월 1일의 요일정보는 %d\n", year, month, getDayInfo(year, month));

	}

	// 년, 월 정보로 => 해당 년, 월의 말일정보를 가지고오는 (메소드) 2022년 9월 => 30일.
	public int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1); // 7 ->6 (1을 빼줘야 컴터에서인식 0=1로시작해서 (년 월 일 을 넣어줘야하기 때문에 내가 알고자하는 년월을 적고 마지막 일 은1일로
									// 임시처리)
		
		return cal.getActualMaximum(Calendar.DATE); // 말일정보를 가져오기.
	}

	// 년, 월 정보 => 해당 년 ,월의 1일 요일정보를 가지고오는 (메소드) 2022년 9월 => 5요일 (1일의 요일정보= 목요일)
	public int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		return cal.get(Calendar.DATE);

		//System.out.printf("%d년 %d월의 마지막 날짜는 %d\n", year, month, getLastDate(year, month));
		//System.out.printf("%d년 %d월 1일의 요일정보는 %d\n", year, month, getDayInfo(year, month));
	}
}
