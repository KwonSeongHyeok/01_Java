package ncs.test11;
// ������������ �����ϴ� Comparator<Integer>�� ���

import java.util.Comparator;

public class Decending implements Comparator<Integer> {
	// �̿ϼ��� �޼��� �ۼ��ؾ��ϱ� ������ ������ ǥ�ð� ���� ��
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
		
	}
	/*
	 * o1 �� o2 ���� ������ �Ųٷ�
	 * o1 �� o2 �� ������ 0
	 * o1 �� o2 ���� ũ�� �ùٸ���
	 * 
	 * */
	
}
