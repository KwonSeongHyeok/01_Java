package com.kh.test.main.oop;

// ���� �ϳ��� ��� implements Animal ���� �̿ܿ� ���� ������ , ����ؼ� �ۼ��� �� ����
// ������ ������ interface �̾�߸���
// �������� �Ҹ��� ����� makeSound �� ����ǰ� ���� �ʱ� ������
// ������������ �������� ����
public class Dog implements Animal, AnimalEat {
	// Animal�� �ִ� �������̽� �޼��� ����
	@Override // �ּ����� �ǹ̷� ������ �ص� �������� ������ ���� ������� �ۼ��ϴ� ���̱� ������
			  // ������ �������ؼ� �ۼ����ִ� ���� ����
	public void makeSound() {
		System.out.println("�۸�!");
	}
	
	@Override
	public void eat() {
		System.out.println("�ȳ�");
	}
	
}
