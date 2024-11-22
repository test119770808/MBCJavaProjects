package ch19;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {
		// InetAddress 객체는 통신을 위한 주소 정보를 처리하는 객체
		try {
			// 객체 생성 : InetAddress 객체 생성
			// 1. getName() 객체 생성
			InetAddress ip = InetAddress.getByName("www.naver.com"); // 네이버
			System.out.println("1. getName()");
			System.out.println("hostname : " + ip.getHostName());
			System.out.println("IP : " + ip.getHostAddress());
			
			// 2. getAllByName() 객체 생성
			System.out.println("2. getALLByName()");
			InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
			for (InetAddress i : ips) System.out.println("IP 주소 : " + i);
			
			// ip 주소 값을 byte[] 배열로 리턴
			byte[] ipAddr = ip.getAddress();
			for (byte b : ipAddr) {
				System.out.print(((b < 0)? b+256:b)+".");
			}
			System.out.println();
			
			// 3. getLocalHost() 객체 생성 - Local은 현재 컴퓨터
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("현재 컴퓨터의 IP : " + local);
			System.out.println("현재 컴퓨터의 IP : " + local.getHostAddress());
			
			// 4. getByAddress() 객체 생성
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostName()+"주소 : "+ip2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
