package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		 1부터 9까지 값을 스캐너로 가각 입력받아
		 
		 더하기 빼기 곱하기 몫 출력하기
		 
		 int 숫자1
		 int 숫자2
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int 숫자1 = sc.nextInt();
		// 만약에 숫자 1이 1~9까지 값이 아니라면
		if(숫자1 < 1 || 숫자1 > 9) {
			System.out.println("1부터 9 사이의 정수를 입력하세요");
			return; // 프로그램 종료
		}

		System.out.print("두 번째 정수 입력 : ");
		int 숫자2 = sc.nextInt();
		if(숫자2 < 1 || 숫자2 > 9) {
			System.out.println("1부터 9 사이의 정수를 입력하세요");
			return; // 프로그램 종료
		}
		
		
		int sum = 숫자1 + 숫자2;
		int dif = 숫자1 - 숫자2;
		int mul = 숫자1 * 숫자2;
		int div = 숫자1 / 숫자2;
		
		System.out.println(숫자1 + " + " + 숫자2 + " = " + sum);
		System.out.println(숫자1 + " - " + 숫자2 + " = " + dif);
		System.out.println(숫자1 + " * " + 숫자2 + " = " + mul);
		System.out.println(숫자1 + " / " + 숫자2 + " = " + div);
		
		sc.close();
	}
}
