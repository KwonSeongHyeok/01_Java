package com.kh.Sandwich;

import java.util.*;

public class ������ġ���� {
	public static void main(String[] args) {
		// �ֹ�����Ʈ ArrayList
		List<������ġ> �ֹ�����Ʈ = new ArrayList<>();
		
		�ֹ�����Ʈ.add(new ������ġ("���ϳ�", "BLT"));
		�ֹ�����Ʈ.add(new ������ġ("�̵�", "��Ű"));
		�ֹ�����Ʈ.add(new ������ġ("���ϳ�", "ġŲ"));
		�ֹ�����Ʈ.add(new ������ġ("�̼�", "���׸���"));
		�ֹ�����Ʈ.add(new ������ġ("���ϳ�", "�����ͺ�"));
		
		
		// ���� HashSet
		Set<String> ���� = new HashSet<>();
		
		// �ߺ����Ÿ���Ʈ ArrayList
		List<������ġ> �ߺ����������ֹ� = new ArrayList<>();
		
		// �ߺ����θ� Ȯ���ϰ� �ߺ����� ���� �ֹ��� ����Ʈ�� �߰�
		for(������ġ �ֹ� : �ֹ�����Ʈ) {
			if(!����.contains(�ֹ�.get����())) {
				�ߺ����������ֹ�.add(�ֹ�);
				����.add(�ֹ�.get����());
			}
		}
		// �ߺ����Ÿ���Ʈ ���
		System.out.println(�ߺ����������ֹ�);
		// for-each
		for(������ġ �ֹ� : �ߺ����������ֹ�) {
			System.out.println(�ֹ�);
		}
	}
}
