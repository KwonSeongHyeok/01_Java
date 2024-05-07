package com.kh.serialEx;

import java.io.Serializable;

// 학생을 직렬화 하기
public class Student implements Serializable {
	private String name;
	private int age;
	
// 메서드
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 필수
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 기본
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	// toString
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
}
