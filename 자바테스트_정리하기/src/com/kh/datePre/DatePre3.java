package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy / MM / dd /E");
		// System.out.println(sdf); java.text.SimpleDateFormat@127f2576

		// sdf �� ��ȯ�ϰ� ���� ��Ģ�� ������ ��¥�� ������ �� �ִ� ���� �ƴ�
		String formatSdf = sdf.format(now);
		System.out.println(formatSdf);
		
		
		System.out.println("�ֹι�ȣ�� 8�ڸ� �Է����ּ���.");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);
		
		
		System.out.println("�ֹι�ȣ�� 6�ڸ� �Է����ּ���.");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyMMdd");
		String formatSdf3 = sdf3.format(now);
		System.out.println(formatSdf3);
		
		
		// yyyy	 MM  dd   0000�� 00�� 00��
		// yyyyMMdd		  0000��00��00��
		// yy  MM  dd	  00�� 00�� 00��
		// yyMMdd		  00��00��00��
		
		
	}
}
