package com.kh.fileEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePre {
	public static void main(String[] args) throws IOException {
		String �����̸� = "practice.txt";
		
		File file = new File(�����̸�);
		
		// ������ �����ϴ��� Ȯ��
		// �������� �ʴ´ٸ� �������
		// �����Ѵٸ� �̹� �����մϴ�. ��� ������ ���
		if(file.exists()) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			file.createNewFile();
			System.out.println("������ �����߽��ϴ�.");
		}
		
		
		// ���Ͽ� ���� �ۼ��ϱ�
		FileWriter �۾��� = new FileWriter(file);
		
		// Java \n File \n ��ü\n �����ϱ� ����
		�۾���.write("Java \n");
		�۾���.write("File \n");
		�۾���.write("��ü \n");
		
		�۾���.close();
		System.out.println("���Ͽ� ������ �ۼ��߽��ϴ�.");
		
	}
}
