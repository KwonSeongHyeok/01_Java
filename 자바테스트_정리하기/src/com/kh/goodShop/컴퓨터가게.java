package com.kh.goodShop;

import java.util.*;

public class ��ǻ�Ͱ��� {
	public static void main(String[] args) {
		
		// ��� ��ǰ HashMap
		Map<String, Integer> �����ǰ = new HashMap<>();
		
		�����ǰ.put("��Ʈ��", 700000);
		�����ǰ.put("��Ʈũž", 20000);
		�����ǰ.put("�����", 5000);
		�����ǰ.put("���콺", 3000);
		�����ǰ.put("Ű����", 2000);
		
		// Entry ����ؼ� ���
		System.out.println("��ǻ�� ��ǰ ���");
		for(Map.Entry<String, Integer> e : �����ǰ.entrySet()) {
			String ��ǰ�� = e.getKey();
			int ��ǰ���� = e.getValue();
			System.out.println(��ǰ�� + "�� " + ��ǰ���� + "�� �Դϴ�.");
		}
			
		// Ư�� ��ǰ�� ���� ���
		// Scanner�� �Է¹޾Ƽ� Ȯ��
		System.out.print("ã�� ������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		String ã�¹��� = sc.nextLine(); // "USB";
		
		System.out.println(ã�¹��� + " ���Կ� �ֽ��ϱ�?");
		
		// containsKey �����ϴ��� �������� �ʴ��� if �� ����ؼ� Ȯ�� ��
		// �����Ѵٸ� ��~! �����մϴ�.
		// ���������ʴ´ٸ� ���� ǰ���Դϴ�.
		if(�����ǰ.containsKey(ã�¹���)) {
			int ��ǰ�� = �����ǰ.get(ã�¹���);
			System.out.println("��~! �����մϴ�. ������ " + ��ǰ�� + "�� �Դϴ�.");
		} else {
			System.out.println("���� ǰ���Դϴ�.");
		}
		
	}
}
