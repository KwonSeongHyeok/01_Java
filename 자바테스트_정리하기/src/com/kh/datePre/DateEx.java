package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		// Date는 최초 1회만 호출 Date now = new Date();
		Date now = new Date();
		
		// 년-월-일 출력하기
		// SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatSdf1 = sdf1.format(now);
		System.out.println(formatSdf1);
		
		
		// 문자열(SimpleDateFormat - String)		→ 날짜(Date) 변경
		String 날짜문자열 = "2024-05-03";
		try {
			Date parseDate1 = sdf1.parse(날짜문자열);
			// Fri May 03 00:00:00 KST 2024 날짜문자열 뒤에 시분초는 없기 때문에 0으로 표기
			System.out.println(parseDate1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// 시:분:초
		// SimpleDateFormat sdf2 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);
		
		// 문자열(SimpleDateFormat - String)		→ 날짜(Date) 변경
		// Date parseDate2
		try {
			Date parseDate2 = sdf2.parse(formatSdf2);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		// 년-월-일 시:분:초 출력하기
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatSdf3 = sdf3.format(now);
		System.out.println(formatSdf3);
		
		// 문자열(SimpleDateFormat - String)		→ 날짜(Date) 변경
		String 문자열3 = "2024-05-03 11:09:59";
		// Date parseDate3
		try {
			Date parseDate3 = sdf3.parse(문자열3);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
