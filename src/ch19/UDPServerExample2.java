package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UDPServerExample2 {

	// DatagramSocket 객체를 멤버로 선언
	private static DatagramSocket datagramSocket = null;
	// 스레드 풀 생성 (10개 스레드로 제한)
	private static ExecutorService executorService = 
			Executors.newFixedThreadPool(10);
	
	
	public static void main(String[] args) throws Exception{
		System.out.println("-------------------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요. ");
		System.out.println("-------------------------------------------------");

		// startServer() 구현... 
		startServer();
		
		
		// 키보드 입력
		Scanner scan = new Scanner(System.in);
		while(true) {
			String key = scan.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}
		}
		scan.close();
		
		// TCP 서버 종료
		stopServer();
	}

	public static void startServer() {
		// UDP통신을 위한 설정.... 
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// 1. DatagramSocket 객체 생성 및 바인딩
					datagramSocket = new DatagramSocket(50002);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						// 클라이언트가 구독하고 싶은 뉴스 주제 얻기 (데이터를 생성)
						// 2. DatagramPacket생성. 이 객체를 통해서 데이터를 전송. 
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						// DatagramSocket이 받은 데이터를 위한 receive()
						datagramSocket.receive(receivePacket);
						
						executorService.execute(() -> {
							try {
								String newsKind = new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
								
								// 3. 클라이언트의 IP와 Port 주소 얻기(**)
								SocketAddress socketAddress = receivePacket.getSocketAddress();
								
								// 4. 데이터 처리...
								// 10개의 뉴스를 클라이언트로 전송
								for (int i=1;i<=10;i++) {
									String data = newsKind + ": 뉴스" + i;
									byte[] bytes = data.getBytes("UTF-8");
									// 5. 처리된 데이터를 DatagramPacket으로 전달하기 위해서 묶어줌
									DatagramPacket sendPacket = new DatagramPacket(
											bytes,
											0, 
											bytes.length, 
											socketAddress
									);
									// 6. 데이터 전송 처리
									datagramSocket.send(sendPacket);
								}
							} catch (Exception e) {}
						});
					}
				} catch (Exception e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		// 스레드 시작
		thread.start();
	}
	
	public static void stopServer() {
		// DatagramSocket을 닫고, port 언바운딩
		datagramSocket.close();
		executorService.shutdownNow();
		System.out.println("[서버] 종료됨 ");
	}

}
