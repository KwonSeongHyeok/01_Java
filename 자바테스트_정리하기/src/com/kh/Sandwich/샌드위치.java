package com.kh.Sandwich;

public class ������ġ {
//�ʵ�
	private String ����;
	private String ������ġ����;

//�޼���
	// Setter
	public void set����(String ����) {
		this.���� = ����;
	}
	public void set������ġ����(String ������ġ����) {
		this.������ġ���� = ������ġ����;
	}
	
	// Getter
	public String get����() {
		return ����;
	}
	public String get������ġ����() {
		return ������ġ����;
	}
	
	// ������ �ʼ�
	public ������ġ(String ����, String ������ġ����) {
		super();
		this.���� = ����;
		this.������ġ���� = ������ġ����;
	}
	
	// @Override toString ���� ������ġ ����
	@Override
	public String toString() {
		return "����=" + ���� + ", ������ġ����=" + ������ġ����;
	}
	

	
}
