package com.kh.test.main.oop;

// 빨간색이 나오는 이유는 추상클래스에서 작성한 추상메서드를 필수록 재사용해서
// 완성해 달라는 의미
public class Circle extends Shape{

	// 추상 메서드 구현
	@Override
	public double getArea() {
		return 3.14;
	}
	
	
}
