package com.kh.PropertiesPre;
// ����Ű ctrl shift s
import java.util.*;

public class PropertiesPre {
	public static void main(String[] args) {
		Properties ���� = new Properties();
		
		// �Ӽ� ����
		����.setProperty("�̸�", "��ټ�");
		����.setProperty("����", "15"); // ��� ǥ��� ���� ���� " " �ۼ��ؾ���
		����.setProperty("��°�", "����");
		
		// Ư�� �� ��ȸ�ϱ�
		String �̸���ȸ = ����.getProperty("�̸�");
		System.out.println("�̸� : " + �̸���ȸ);
		
		// ��ü ��ȸ�ϱ�
		System.out.println("=== ��ü ��ȸ ===");
		// Properties ���� Map.Entry ����ؼ� ��ü ��ȸ�� �� �� ����
		// Properties ���ڿ��� �ۼ��� �ϱ� ������ Object Object		
		for(Map.Entry<Object, Object> e : ����.entrySet()){
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
