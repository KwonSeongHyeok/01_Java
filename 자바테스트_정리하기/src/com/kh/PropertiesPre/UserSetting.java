package com.kh.PropertiesPre;

import java.util.*;

public class UserSetting {
	public static void main(String[] args) {
		// Properties ��ü�� �ν��Ͻ� ���� = setting
		Properties setting = new Properties();
		
		
		// �Ӽ� ����
		setting.setProperty("name", "john");
		setting.setProperty("age", "17");
		setting.setProperty("city", "seoul");
		
		//city ��ȸ�ϱ�
		String city = setting.getProperty("city");
		// ��ȸ���� ���
		System.out.println(city);
		
		// ��ü��ȸ�ϱ� Map.Entry<Object, Object>	key, value ���
		System.out.println("��ü��ȸ�ϱ�");
		for(Map.Entry<Object, Object> e : setting.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " : " + value);
			
		}
		
	}
}
