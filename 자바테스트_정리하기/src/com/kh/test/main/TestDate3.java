package com.kh.test.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate3 {
	/*
	 GreforianCalendar Ŭ������ ����Ͽ�,
	 ���� �⵵�� ���� ���̸� ����ϰ� ������ ������ ����Ѵ�.
	 ��½� SimpleDateFormat�� ����Ͽ� ����Ѵ�. 
	 */
	public static void main(String[] args) {
		// ������ ���� ���� ����
		int �¾�⵵ = 1987;
		int �¾�� = 8;
		int �¾��¥ = 14;
		
		// ���� ��¥ ���ϱ�
		Calendar ���� = Calendar.getInstance();
		int ����⵵ = ����.get(Calendar.YEAR);
		int ����� = ����.get(Calendar.MONTH) + 1;
		int ���糯¥ = ����.get(Calendar.DAY_OF_MONTH);
		
		// ���� ���
		int ���� = ����⵵ - �¾�⵵;
		
		// ���� ���̸� ���� -1
		if(����� < �¾�� || (�¾�� == ����� && ���糯¥ < �¾��¥)) {
			����--;
		}
		
		
		// ���� ���� ���
		Calendar ���� = new GregorianCalendar(�¾�⵵, �¾�� -1, �¾��¥);
		SimpleDateFormat ��¥���ڰ��ۼ� = new SimpleDateFormat("yyyy�� M�� d��");
		
		//���
		System.out.println("���� : " + ��¥���ڰ��ۼ�.format(����.getTime()));
		System.out.println("���� : " + ��¥���ڰ��ۼ�.format(����.getTime()));
		System.out.println("���� : " + ���� + "��");
		
	}
}
