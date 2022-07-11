package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/*
 * Date, Calendar => 시간, 날짜 정보.
 * 11-2 보기  클래스 . 뒤에오는 타입들 외워두기
 */
public class DateEx {
	public static void main(String[] args) {
		Date today = new Date(); // LocalDate, LocalDateTime
		today.getDate(); // 가로줄쳐져있는거는 디프리케이트 쓰지말라는 뜻임
		today.getDay();

		System.out.println(today.toString());
		System.out.println(today.toGMTString());
		System.out.println(today.toLocaleString());

		// 2022년 07월 12일 14시53분12초. 요런형식으로 보여주고싶으면 SimpleDateFormat sdf~ 써줘야한당
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시mm분ss초"); // 대문자는 24시 기준 소문자는 12시간 기준
		System.out.println(sdf.format(today));
		System.out.println("-----------------------------");

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 오늘 년월일만 보고싶을때, 시간분초도 보고싶을 때는 hhmmss추가
		System.out.println(sdf.format(today));
		System.out.println("-----------------------------");

		today = new Date("2022/07/15 13:23:12"); // 원하는 날짜지정
		System.out.println(sdf.format(today));

//		Calendar 클래스
		Calendar now = Calendar.getInstance(); // 캘린더 라는 타입의 변수를 읽어오겠습니다~ 라는 문장
		System.out.println(now.get(Calendar.YEAR) + "년");
		int mon = now.get(Calendar.MONTH);
		
		now.set(2022, 10,11); //월 정보는 0부터 시작함, 1월 = 0
		System.out.println(now.get(Calendar.DATE) + "일");
		
//		LocalDate
		
		LocalDate lDate = LocalDate.now();    //now는 정적메소드, 현재날ㅉㅏ정보를 불러오겠습니다~할때씀
		System.out.println(lDate.toString());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(lDate.format(dtf));       //값을지정하고싶으면
		
		
	}
}
