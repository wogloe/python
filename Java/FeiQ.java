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
		
		//客户端	发送端
		// 1.创建DatagramSocket对象，并且声明端口（客户端端口可以省略，对于服务端不关注端口）
		
	
		// 2.把发送的内容封装到DatagramPacket并且把服务端的IP以及端口带上
		
		for (int i = 0; i < 10; i++) {
		DatagramSocket datagramSocket=new DatagramSocket();
		InetAddress.getByName("192.168.1.2");
		String str="兄弟，开个玩笑，消息轰炸";
	
		DatagramPacket datagramPacket=new DatagramPacket(
		getdata(str,i).getBytes(),getdata(str,i).length(), InetAddress.getByName("169.254.29.88"), 2425);//徐ip:169.254.29.88
		
		// 3.发送DatagramPacket
		datagramSocket.send(datagramPacket);
		
		// 4.关闭DatagramSocket
		System.out.println("发送成功"+i);
		}
	
	}
	public static String getdata(String str,int i) {
		//version:   time:  sender: ip: flag:  content
		//版本号       时间   发送人   ip   发送标识符32   内容
		
		StringBuffer sb=new StringBuffer();
		sb.append("1.0:");
		sb.append(new Date().getTime()+":");
		sb.append("徐振家:");
		sb.append("69696969:");
		sb.append("32:");
		sb.append(str);
		
		return sb.toString();
		
		
		
	}

}
