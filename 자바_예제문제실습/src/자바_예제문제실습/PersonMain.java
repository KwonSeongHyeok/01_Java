package �ڹ�_���������ǽ�;

import java.io.*;

public class PersonMain {
	public void fileSave(String �����̸�) {
		File file = new File(�����̸�);
		
		try {
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person ��� = new Person();
			
			bw.write(���.toString());
			bw.close();
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		PersonMain ����������ϸ���� = new PersonMain();
		
		����������ϸ����.fileSave("�迵����������.txt");
	}
	
	
}
