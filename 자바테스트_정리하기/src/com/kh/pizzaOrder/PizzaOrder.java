package com.kh.pizzaOrder;

public class PizzaOrder {
// �ʵ� = ��������
	// ������ �������
	private String ����;
	private String ����Ÿ��;

// �޼���
	// Setter
	public void set����(String ����) {
		this.���� = ����;
	}
	public void set����Ÿ��(String ����Ÿ��) {
		this.����Ÿ�� = ����Ÿ��;
	}
	// Getter
	public String get����() {
		return ����;
	}
	public String get����Ÿ��() {
		return ����Ÿ��;
	}


	// ������ �ʼ�
	public PizzaOrder(String ����, String ����Ÿ��) {
		this.���� = ����;
		this.����Ÿ�� = ����Ÿ��;
	}

	// @Override toString return ���̸� ����Ÿ�� alt shift s s
	@Override
	public String toString() {
		return "PizzaOrder [����=" + ���� + ", ����Ÿ��=" + ����Ÿ�� + "]";
	}

}
