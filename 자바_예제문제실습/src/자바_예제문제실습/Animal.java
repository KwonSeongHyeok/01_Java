package �ڹ�_���������ǽ�;
/*
 ĸ��ȭ ��Ģ�� �°� �����ϱ�
 // �ʵ�
 String �����̸�;
 int ����;
 
 //�޼���
   // Getter
   // Setter
   // �⺻ ������
   // �ʼ� ������
   // @Override toString Ȱ���ؼ� ���ڿ� ����ϱ�
 */
public class Animal {
// �ʵ�
	private String �����̸�;
	private int ����;
	
// �޼���
	// Getter
	public String get�����̸�() {
		return �����̸�;
	}
	public int get����() {
		return ����;
	}
	
	// Setter
	public void set�����̸�(String �����̸�) {
		this.�����̸� = �����̸�;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	
	// �⺻ ������
	public Animal() {
	}
	
	// �ʼ� ������
	public Animal(String �����̸�, int ����) {
		this.�����̸� = �����̸�;
		this.���� = ����;
	}
	
	// @Override toString Ȱ���ؼ� ���ڿ� ����ϱ�
	@Override
	public String toString() {
		return "�����̸�=" + �����̸� + ", ����=" + ����;
	}
	
    
	
	

	
	
}
