package com.kh.serverEx;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		int port = 3000;
		
		ServerSocket server;
		
		try {
			
			server = new ServerSocket(port);
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			
			// BufferedReader ���ڸ� �ǽð����� �о����
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// PrintWriter�� ����ؼ� �о�� ���� ����ϱ�
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			
			// ���������� ���� �޼��� �����ϱ�
			String m;
			while((m = in.readLine()) != null ) {

				System.out.println("send success : " + m);
				out.println(" c h e c k");
				// Ŭ���̾�Ʈ�� ������ �޼��� �����ְ� ����
			}
			client.close();
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
