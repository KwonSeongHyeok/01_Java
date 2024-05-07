package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public abstract class TestSup1 {
	/*[ 문제 1 ] 삼항연산자를 사용하여 다음과 같은 조건을 만족하는 프로그램을 작성하시오.
	국어(int), 영어(int), 수학(int), 총점(int), 평균(double) 변수를 선언하고, 키보드로 국, 영, 수 3과목의
	점수를 입력받아 총점과 평균을 계산한 다음, 3과목의 점수와 평균을 가지고 합격 여부를 출력
	처리한다.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int 국어 = sc.nextInt();
		System.out.print("영어 점수 : ");
		int 영어 = sc.nextInt();
		System.out.print("수학 점수 : ");
		int 수학 = sc.nextInt();
		
		Score 점수 = new Score(국어, 영어, 수학);
		
		점수.결과();
	}
	
	
}
