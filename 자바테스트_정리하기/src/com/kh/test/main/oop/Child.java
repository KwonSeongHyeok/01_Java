package com.kh.test.main.oop;

// �ڽ�Ʋ������ �θ�Ŭ������ ��� extends �������̽��� �ƴ϶� Ŭ������ ��ӹ��� ����
// �ϳ��ۿ� ����� ���ޱ� ������ extends�� ����� �� �ϳ��� Ŭ������ �ۼ��������
public class Child extends Parent {
// �ʵ�
	int �ڽĺ���;

// �޼���
	// ������ �⺻ ctrl space �̱� ������ construtor ǥ�ð� �ִ��� Ȯ�� �� ����
	public Child() {
		// TODO Auto-generated constructor stub
	}

	// ���࿡ super�� �⺻������� �ʼ������� �ҿ��� �ʹٸ�
	// �ڽĻ����ڵ� �ΰ� ���� ���� �־������
	public Child(int �ڽĺ���) {
		super(); // Parent�� �⺻ �����ڶ�� �ǹ�
		// super(�θ𺯼�); �ϳ��� �ڽ� �����ڿ��� super�� �ι� �θ��°� �Ұ���
		this.�ڽĺ��� = �ڽĺ���;
	}

	public Child(int �θ𺯼�, int �ڽĺ���) {
		super(�θ𺯼�); // Parent���� �ʼ������ڸ� ����ϰڴٴ� �ǹ�
		this.�ڽĺ��� = �ڽĺ���;
	}

	/*
	 * // ������ �ʼ� alt shift s o // �θ𺯼��� Parent���� ������ ���� public Child(/int �θ𺯼�,/ int
	 * �ڽĺ���) { // super(�θ𺯼�); // �θ𺯼��� ��� �޾Ƽ� �������ڴ� ��� ���� ���� ������ �ߴ� ���� // �θ𺯼�����
	 * �⺻ �����ڸ� �־ �ۼ� this.�ڽĺ��� = �ڽĺ���; }
	 */
	public void �ڽĸ޼���() {
		super.�θ�޼���();
		System.out.println("�ڽĵ� ȣ��Ǿ����ϴ�.");
	}

}
