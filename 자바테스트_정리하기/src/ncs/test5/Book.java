package ncs.test5;

public class Book {
// �ʵ� ��������
	private String title; // �������
	private String author; // �������
	private int price; // �������
	private String publisher; // �������
	private double discountRate; // �������
	
	// Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	// Getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	// �⺻������
	public Book() {
	}
	// �ʼ�������
	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	
	
	// �������� ���簡���� Ȯ���ؼ� ���ΰ��� �˰� ���� �� �ۼ��ϴ� �޼���
	public int get���ΰ�() {
		//�����ϴ� ��� ��� �Ǽ�
		double discountAmount = price * discountRate; // ������� 100�� 10% �Ǹ��ϰڴ�. 10���� ��
		
		// ���� - % ��ŭ ������ �� �ݾ�
		int ���ΰ��� = (int)(price - discountAmount);
		return ���ΰ���;
	}
	
	
	// toStrig String
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRate=" + discountRate + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
