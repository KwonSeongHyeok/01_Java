package �ڹ�_���������ǽ�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 ĸ��ȭ
 String ����̸� �迵��
 int ���� 10
 ������ ��� �����
  toString ���
  
 PersonMain person.txt ����
 * */
public class Person {
	private String ����̸� = "�迵��";
	private int ���� = 10;
	
	public String get����̸�() {
		return ����̸�;
	}
	public void set����̸�(String ����̸�) {
		this.����̸� = ����̸�;
	}
	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}
	
	public Person() {
	}

	public Person(String ����̸�, int ����) {
		this.����̸� = ����̸�;
		this.���� = ����;
	}
	
	@Override
	public String toString() {
		return "����̸�=" + ����̸� + ", ����=" + ����;
	}

}
