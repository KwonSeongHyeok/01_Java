package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		// Date�� ���� 1ȸ�� ȣ�� Date now = new Date();
		Date now = new Date();
		
		// ��-��-�� ����ϱ�
		// SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatSdf1 = sdf1.format(now);
		System.out.println(formatSdf1);
		
		
		// ���ڿ�(SimpleDateFormat - String)		�� ��¥(Date) ����
		String ��¥���ڿ� = "2024-05-03";
		try {
			Date parseDate1 = sdf1.parse(��¥���ڿ�);
			// Fri May 03 00:00:00 KST 2024 ��¥���ڿ� �ڿ� �ú��ʴ� ���� ������ 0���� ǥ��
			System.out.println(parseDate1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// ��:��:��
		// SimpleDateFormat sdf2 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);
		
		// ���ڿ�(SimpleDateFormat - String)		�� ��¥(Date) ����
		// Date parseDate2
		try {
			Date parseDate2 = sdf2.parse(formatSdf2);
			System.out.println(parseDate2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		// ��-��-�� ��:��:�� ����ϱ�
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatSdf3 = sdf3.format(now);
		System.out.println(formatSdf3);
		
		// ���ڿ�(SimpleDateFormat - String)		�� ��¥(Date) ����
		String ���ڿ�3 = "2024-05-03 11:09:59";
		// Date parseDate3
		try {
			Date parseDate3 = sdf3.parse(���ڿ�3);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
