package pre.propertiesEx;

public class Movies implements Comparable<Movies>{
//�ʵ�
	private String name;
	private int ����;
	private int ������;

// �޼���
	// �⺻ ������
	public Movies() {
		// TODO Auto-generated constructor stub
	}
	
	// �ʼ� ������
	public Movies(String name, int ����, int ������) {
		super();
		this.name = name;
		this.���� = ����;
		this.������ = ������;
	}
	// Getter Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int get����() {
		return ����;
	}
	public void set����(int ����) {
		this.���� = ����;
	}

	public int get������() {
		return ������;
	}
	public void set������(int ������) {
		this.������ = ������;
	}

	// toString
	@Override
	public String toString() {
		return "name=" + name
				+ ", ����=" + ����
				+ ", ������=" + ������;
	}
	
	// campareTo
	@Override
		public int compareTo(Movies o) {
			// �񱳴� ������ ����� ������ ���ϱ� ���� ó���� 0
			return this.name.compareTo(o.name);
		}
	
	
}
