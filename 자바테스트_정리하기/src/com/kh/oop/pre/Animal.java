package com.kh.oop.pre;

// ��� �θ�
public class Animal {
// �ʵ�
	private String name;

// �޼���
	// Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// ������ �ʼ�
	public Animal(String name) {
		this.name = name;
	}

	// void
	public void makeSound() {
		System.out.println(name + "�� �Ҹ��� ���ϴ�.");
	}
}
