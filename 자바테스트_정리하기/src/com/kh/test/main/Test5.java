package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 : ");
		int 숫자1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int 숫자2 = sc.nextInt();
		
		
		if(숫자1 >= 1 && 숫자1 <= 9 && 숫자2 >= 1 && 숫자2 <= 9) {
			int 곱 = 숫자1*숫자2;
			if(곱 >= 1 && 곱 <= 9) {
				System.out.println("한자리 수 입니다.");
			} else {
				System.out.println("두자리 수 입니다.");
			}
		} else {
			System.out.println("입력한 수 중에서 1~9 아닌 수가 있습니다.");
		}
		sc.close();
	}
}
