package ncs.test4;

public class Product {
//�ʵ�
	private String name;
	private int price;
	private int quantity;
	
// �޼���
	// Getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// ������ �⺻
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	// ������ �ʼ�
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// return ����
	public String ����() {
		return "��ǰ�� : " + name + ", ���� : "
						 + price + "��, ���� : " + quantity
						 + "��, �� ���Ű��� : " + getPrice() + "��";
	}
	
}
