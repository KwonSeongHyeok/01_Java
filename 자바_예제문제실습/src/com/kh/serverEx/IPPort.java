package com.kh.serverEx;
/*
 ���� IP�� 192.200.3.58 �� �� ������ �����ϴ� ����� �����ؼ� �ۼ��ϱ� 
 */
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class IPPort {
	public static void main(String[] args) {
		try {
			
			
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIP);
									// severIP = 192.168.0.19 ���� ��ǻ�� IP�ּ�
			Socket socket = new Socket(serverIP, 3000);
			System.out.println(socket);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
