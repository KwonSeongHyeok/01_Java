package com.kh.serialEx;

import java.io.Serializable;

// �л��� ����ȭ �ϱ�
public class Student implements Serializable {
	private String name;
	private int age;
	
// �޼���
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
	
	// �ʼ�
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// �⺻
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	// toString
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
}
