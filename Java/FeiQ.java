package com.uplooking.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;

public class FeiQ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//�ͻ���	���Ͷ�
		// 1.����DatagramSocket���󣬲��������˿ڣ��ͻ��˶˿ڿ���ʡ�ԣ����ڷ���˲���ע�˿ڣ�
		
	
		// 2.�ѷ��͵����ݷ�װ��DatagramPacket���Ұѷ���˵�IP�Լ��˿ڴ���
		
		for (int i = 0; i < 10; i++) {
		DatagramSocket datagramSocket=new DatagramSocket();
		InetAddress.getByName("192.168.1.2");
		String str="�ֵܣ�������Ц����Ϣ��ը";
	
		DatagramPacket datagramPacket=new DatagramPacket(
		getdata(str,i).getBytes(),getdata(str,i).length(), InetAddress.getByName("169.254.29.88"), 2425);//��ip:169.254.29.88
		
		// 3.����DatagramPacket
		datagramSocket.send(datagramPacket);
		
		// 4.�ر�DatagramSocket
		System.out.println("���ͳɹ�"+i);
		}
	
	}
	public static String getdata(String str,int i) {
		//version:   time:  sender: ip: flag:  content
		//�汾��       ʱ��   ������   ip   ���ͱ�ʶ��32   ����
		
		StringBuffer sb=new StringBuffer();
		sb.append("1.0:");
		sb.append(new Date().getTime()+":");
		sb.append("�����:");
		sb.append("69696969:");
		sb.append("32:");
		sb.append(str);
		
		return sb.toString();
		
		
		
	}

}
