package com.kh.test.main;

public class Test8 {
	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82,10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		double �� = 0;
		double ��� = 0;
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				
				�� += array[i][j];
				count++;
			}
		}
		��� = ��/count;
		System.out.println(��);
		System.out.println(���);
	}
}
