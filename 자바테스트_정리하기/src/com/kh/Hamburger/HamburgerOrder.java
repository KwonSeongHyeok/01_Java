package com.kh.Hamburger;

public class HamburgerOrder {
// �ʵ�
	private String ����;
	private String ����Ÿ��;
	
	
// �޼���
	public void set����(String ����) {
		this.���� = ����;
	}
	public void set����Ÿ��(String ����Ÿ��) {
		this.����Ÿ�� = ����Ÿ��;
	}
	public String get����() {
		return ����;
	}
	public String get����Ÿ��() {
		return ����Ÿ��;
	}
	
	// �ʼ�������
	public HamburgerOrder(String ����, String ����Ÿ��) {
		this.���� = ����;
		this.����Ÿ�� = ����Ÿ��;
	}

	// Override toString
	@Override
	public String toString() {
		return "����=" + ���� + ", ����Ÿ��=" + ����Ÿ��;
	}
	
	
	
}
