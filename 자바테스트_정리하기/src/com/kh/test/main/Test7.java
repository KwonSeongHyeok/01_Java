package com.kh.test.main;

public class Test7 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double �� = 0;
		
		for(int i : array) {
			if(i%2 != 0) {
				/*
				 ���� % 2 == 0 ¦�����ϱ�
				 ���� % 2 == 1 Ȧ�����ϱ�
				 */
				System.out.println(i);
				��+=i;
			}	
		}
		System.out.println("�հ� : " + ��);
	}
}
