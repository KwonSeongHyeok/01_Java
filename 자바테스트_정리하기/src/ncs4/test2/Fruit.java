package ncs4.test2;
// ��
public class Fruit implements Comparable<Fruit> {
// �ʵ�
	private String name;
	private int price;
	private int quantity;

// �޼���
	// �⺻������
	public Fruit() {
	}

	// �ʼ������� ���ϸ� ���ϰ��� ����
	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// toString
	@Override
	public String toString() {
		return "name=" + name
				+ ", price=" + price
				+ ", quantity=" + quantity;
	}

	@Override
	public int compareTo(Fruit ���Ϻ�) {
		return this.name.compareTo(���Ϻ�.name); // ���� �̸����� �񱳸� �ϱ� ������
	}
	
	
	
}
