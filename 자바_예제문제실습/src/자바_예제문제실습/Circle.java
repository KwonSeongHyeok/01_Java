package �ڹ�_���������ǽ�;

import java.io.Serializable;

public class Circle implements Serializable{
	public static final double PI = 3.14;
	public double radius;
	
	// Alt Shift S O
	public Circle(double radius) {
		this.radius = radius;
	}

	// Getter Setter
	public double getRadius() {
		return radius;
	}
	public static double getPi() {
		return PI;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("������ " + radius + "cm�� ���� �׸��ϴ�.");
	}

	
	public static void main(String[] args) {
		Circle �� = new Circle(2.5);
		��.draw();
	}

	
	


}
