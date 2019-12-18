package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int port;

	public ChatSender(DatagramSocket ds, int port) {
		 this.ds=ds;
		 this.port=port;
	}

	@Override
	public void run() {
		// 创建Scanner对象,获取键盘输入
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("我说:");
				String str=sc.nextLine();
				byte[] zjsz;
				zjsz=str.getBytes("UTF-8");
				System.out.println("这条信息要发送给哪个IP:");
				String IP =sc.nextLine();
				DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName(IP),8900);
				//通过套接字发送数据报
				ds.send(dp);
			}catch(Exception e) {                                      
				e.printStackTrace();
				
			}
		}
	}
}


