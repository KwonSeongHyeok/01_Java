package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	
	public static void main(String[] args) {
		// ��ĳ�ʸ� �̿��ؼ� ����¹ޱ�
		Scanner sc = new Scanner(System.in);

		// Ű����κ��� ��ǰ �Է¹ޱ�
		System.out.print("��ǰ �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("��ǰ ������ �Է��ϼ��� : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("��ǰ ������ �Է��ϼ��� : ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		
		// �Է¹��� ��ǰ ��ü Product ���� �� ���� �� �ʱ�ȭ
		Product ��ǰ = new Product(name, price, quantity);
		
		// ��ǰ ���� ���
		System.out.println(��ǰ.����());
		
	}
}
