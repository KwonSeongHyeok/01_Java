package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		
		bArray[0] = new Book("�ڹ��� ����", "���ü�", 30000, "��������", 0.1);
		bArray[1] = new Book("�������� �ڹ�", "������", 29000, "������", 0.1);
		bArray[2] = new Book("��ü���� JAVA8", "�ݿ���", 30000, "�Ͻ�Ȩ", 0.1);
		
		
		// for-each�� ����ؼ� ���
		for(Book b : bArray) {
			System.out.println("Title : " + b.getTitle());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("Price : " + b.getPrice());
			System.out.println("Publisher : " + b.getPublisher());
			System.out.println("Discount Rate : " + b.getDiscountRate());
			System.out.println("���ε� ���� : " + b.get���ΰ�());
		System.out.println("===================================");
		}
	}
}
