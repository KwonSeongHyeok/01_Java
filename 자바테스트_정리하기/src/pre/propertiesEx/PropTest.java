package pre.propertiesEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropTest {
	public static void fileSave(Properties p) {
		// Properties�� XML ���Ϸ� ���� �����ϱ�
		
		p.setProperty("1", "�йи���,4,2000");
		p.setProperty("2", "������Ż,5,2023");
		p.setProperty("3", "����ο�,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movies is fun");
			fos.close(); // ���� ���� �� ����
			
			System.out.println("������ movies.xml ���Ͽ� ����Ǿ����ϴ�.");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	// fileOpen xml ���Ͽ� �ִ� ���� ���
	
	public static void fileOpen(Properties p) {
		
		try {
			FileInputStream fis = new FileInputStream("movies.xml");
			p.loadFromXML(fis);
			fis.close();
			
			List<Movies> ��ȭ�� = new ArrayList<>();
			
			for(String key : p.stringPropertyNames()) {
				String[] values = p.getProperty(key).split(",");
				String name = values[0];
				int ���� = Integer.parseInt(values[1]);
				int ������ = Integer.parseInt(values[2]);
				
				Movies ��ȭ = new Movies(name, ����, ������);
				��ȭ��.add(��ȭ);
			}
			
			System.out.println("��� ��� : ");
			for(Movies m : ��ȭ��) {
				System.out.println(m);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
		fileOpen(p);
	}
	
}
