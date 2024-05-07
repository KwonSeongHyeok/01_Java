package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
// �ʵ� ��������
	private String productName; // ��ǰ��
	private Date putDate; // �԰�
	private Date getDate; // ���
	private int putAmount; // �԰�
	private int getAmoun; // ���
	private int inventoryAmount; // ���� ����

// �޼���
	// �⺻ ������
	public Inventory() {
		// TODO Auto-generated constructor stub
	}
	// �ʼ� ������
	// �ڵ��� �̸� ����� ���	�Ǹſ� �Ǹ��� ���� ���� �� �� ���� ������ ���������
	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		//this.getDate = getDate;
		this.putAmount = putAmount;
		//this.getAmoun = getAmoun;
		//this.inventoryAmount = inventoryAmount;
	}
	
	// Getter Setter
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getPutDate() {
		return putDate;
	}
	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
	public Date getGetDate() {
		return getDate;
	}
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}
	public int getPutAmount() {
		return putAmount;
	}
	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}
	public int getGetAmoun() {
		return getAmoun;
	}
	public void setGetAmoun(int getAmoun) {
		this.getAmoun = getAmoun;
	}
	public int getInventoryAmount() {
		return inventoryAmount;
	}
	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	// toString @Override
	@Override
	public String toString() {
		
		// ��¥ ������ ����
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
		String ���ڿ���ȯ = dateFormat.format(putDate);
		
		String ����Ϻ�ȯ = dateFormat.format(getDate);
					// �������  - �Ǹŷ�
		int ������� = putAmount - getAmoun;
		
		
		return "��ǰ�� =" + productName
				+ ", �԰��� =" + ���ڿ���ȯ
				+ ", ����� =" + ����Ϻ�ȯ
				+ ", ��ǰ��� =" + putAmount
				+ ", �Ǹŷ� =" + getAmoun
				+ ", �Ȱ� ���� �� =" + �������;
	}
	

}
