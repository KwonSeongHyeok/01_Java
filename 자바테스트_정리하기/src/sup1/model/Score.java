package sup1.model;

public class Score {
// �ʵ�
	private int ����;
	private int ����;
	private int ����;
	private int ����;
	private double ���;
	
	
// �޼���
	// �ʼ� ������
	public Score(int ����, int ����, int ����) {
		this.���� = ����;
		this.���� = ����;
		this.���� = ����;
	}
	
	// void ����
	public void ���() {
		���� = ���� + ���� + ����;
		��� = ���� / 3.0;
		
		String ��� = (���� >= 50 && ���� >= 50 && ���� >= 50) ? "�հ�" : "���հ�";
		System.out.println("�������� : " + ����);
		System.out.println("�������� : " + ����);
		System.out.println("�������� : " + ����);
		System.out.println(��� + "�Դϴ�.");
	}



}
