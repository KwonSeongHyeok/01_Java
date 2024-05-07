package com.kh.test.main;

public class Test7 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double 합 = 0;
		
		for(int i : array) {
			if(i%2 != 0) {
				/*
				 숫자 % 2 == 0 짝수구하기
				 숫자 % 2 == 1 홀수구하기
				 */
				System.out.println(i);
				합+=i;
			}	
		}
		System.out.println("합계 : " + 합);
	}
}
