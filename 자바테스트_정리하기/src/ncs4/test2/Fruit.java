package ncs4.test2;
// 비교
public class Fruit implements Comparable<Fruit> {
// 필드
	private String name;
	private int price;
	private int quantity;

// 메서드
	// 기본생성자
	public Fruit() {
	}

	// 필수생성자 과일명 과일가격 수량
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
	public int compareTo(Fruit 과일비교) {
		return this.name.compareTo(과일비교.name); // 같은 이름끼리 비교를 하기 때문에
	}
	
	
	
}
