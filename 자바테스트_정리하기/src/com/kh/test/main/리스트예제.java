package com.kh.test.main;

import java.util.ArrayList;
import java.util.Arrays;

public class ����Ʈ���� {
	public static void main(String[] args) {
		// ArrayList ����
		ArrayList<String> ����Ʈ = new ArrayList<>(Arrays.asList("�ٳ���", "������"));
		
		// ���߰�
		����Ʈ.add("���");
		
		System.out.println(����Ʈ);
		
		//������
		����Ʈ.remove("�ٳ���"); // ���� ���� �ۼ�
		����Ʈ.remove(0); // �ε��� ��ġ ���� �� ����
		System.out.println(����Ʈ); // ����� ���� ����� 2�� �ε������� 0�� �ε����� ������
		
		// �� ����
		����Ʈ.set(0, "ü��");
		System.out.println(����Ʈ);
		
		
		/*
		 ����Ʈ.add(2, "���ľ�");
		 ����Ʈ�� ������� 0���� +1�ؼ� �ڸ��� ����� ���̱� ������
		 0 = ü��
		 1 = �������
		 2 = ���ľ�
		 �̷������� ���ľ߸� �߰��ϴ� ���� �ڸ����� ���� �ʴ´ٴ� ������ �߻��ϱ� ������
		 ��ȣ ������� ���� �߰�������� 
		 */
		����Ʈ.add(1, "���ľ�");
		����Ʈ.add(2, "���ľ�");
		System.out.println(����Ʈ);
		
		// ũ��Ȯ��
		System.out.println(����Ʈ.size());
		
		// ���Կ��� Ȯ��
		System.out.println(����Ʈ.contains("���ľ�"));
		
		// �ε��� Ȯ��
		System.out.println(����Ʈ.indexOf("ü��"));
		// ü���� 0��° �̱� ������ 0�̶�� ������ ������ ü���� �������� �ʾƼ� 0�� ������ ���� �ƴ�
		
	}
}
