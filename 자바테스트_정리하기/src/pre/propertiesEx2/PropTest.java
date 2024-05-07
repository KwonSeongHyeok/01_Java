package pre.propertiesEx2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropTest {
	
	// ���θ޼���
	public static void main(String[] args) {
		Properties p = new Properties();
		// p.fileSave(); -> p �ؿ��� �߰��� �������ų� �ۼ��� �� ����ϴ� ��
		// �޼��带 ���� �������� ������ �� ������� ������� ����
		
		fileSave(p);
		fileOpen(p);
	}
	
	
	public static void fileSave(Properties p) {
		p.setProperty("1", "��ǳ����ΰ�,1998,682");
		p.setProperty("2", "�ȹٷλ�ƶ�,2002,239");
		p.setProperty("3", "�����ǿ���,2024,16");
		p.setProperty("4", "�Ƴ�����Ȥ,2008,129");
		
		// xml : �ؽ�Ʈ ����� ���� ������ �б� ���ϵ��� < >�� ��Ģ�� �����ؼ� �ۼ��ϴ� ����
		// Properties xml ���Ϸ� ����
		try {
			FileOutputStream fos = new FileOutputStream("drama.xml");
			p.storeToXML(fos, null);
			fos.close();
			System.out.println("�����Ͱ� drama.xml ���Ͽ� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("drama.xml");
			p.loadFromXML(fis); // ���� �����ִ� xml ������ �ҷ�����
			fis.close();
			
			// Properties ��ü�� Ű-���� �־ List ����
			
			List<Drama> ��󸶵� = new ArrayList<>();
			// ������ �����Ͱ� ��� ����ִ��� �����͸� ���� ����Ʈ�� ������� ��
			
			// for������ �������Ͼȿ� �����ִ� �̸��� �������� ��� �߰��ϱ�
			for(String key : p.stringPropertyNames()) {
				// xml ���Ͼȿ� ����ִ� ��� ���� ���ڿ� ���·� �����ؼ� �˻��� �� �ֵ��� ��
				// ��� Ű�� ���� String[]�� �����ؼ� key ���� ��� ����� �� , ��������
				
				String[] values = p.getProperty(key).split(",");
				
				// ���� ������ ��Ƽ� ����
				// ������ �ȿ� �ִ� ������� ��� String�� ����� �� ������ ���̱� ������
				// ������ ��� String �� int�� �����ؼ� ����ؾ���
				String name = values[0];
				int ��ó⵵ = Integer.parseInt(values[1]);
				int ����� = Integer.parseInt(values[2]);
				
				Drama ��� = new Drama(name, ��ó⵵, �����);
				// ���� ���� ��󸶸� ��� �߰��ϱ�
				// ����ִ� ��󸶵� ����Ʈ�� ������ ��� �߰��ϱ�
				��󸶵�.add(���);
				
			}
			
			// ������ �� ���� �����ϴ� ����
			//		������ ���� �̸��̸� �̸� �⵵�� ����� �����ϴ� ����
			//	����ִ� ��󸶵��� �ٽ� �����Ұڴ�. �����ϴ� ���� Drama[0] = name
			Drama[] ������� = ��󸶵�.toArray(new Drama[0]);
			//Drama[] ������� = ��󸶵�.toArray(new Drama[1]); // ��ó⵵ ���� ����
			//Drama[] ������� = ��󸶵�.toArray(new Drama[2]); // ����� ���� ����
			Arrays.sort(�������);
			
			
			
			System.out.println("��� ��� : ");
			for(Drama d : ��󸶵�) {
				System.out.println(d);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
