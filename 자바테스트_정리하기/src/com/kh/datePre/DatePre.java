package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	public static void main(String[] args) {
		// ���� ��¥�� �ð�
		Date now = new Date();
		
		System.out.println(now);
		// Fri May 03 10:29:41 KST 2024 ������
		// �츮�� ���ϴ� �������� ���� SimpleDateFormat ����ؼ� ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// now�� ���� ��¥�� ���ڿ��� SimpleDateFormat ����ؼ� ����
		String formatDate = sdf.format(now);
		System.out.println("��¥���ĺ��� : " + formatDate);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy / MM / dd");
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);
		
		// ���ڿ�(SimpleDateFormat - String)�� ��¥(Date)�� ����
		String ���ڿ� = "2024-04-30 15:30:45";
		
		try {
			Date parseDate = sdf.parse(���ڿ�);
			System.out.println(parseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Date�� ������ �� ������ ���� �� ������ try-catch ���
	}
}
