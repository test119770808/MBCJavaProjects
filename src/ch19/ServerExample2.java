package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerExample2 {

	// TCP 서버의 스레드풀 사용
	// 스레드 제한을 통한 서버부하 줄이기... 
	private static ServerSocket serverSocket = null;
	
	// 1)스레드풀 생성... (스레드 숫자 제한 : 10)
	private static ExecutorService executorService =
			Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요. ");
		System.out.println("-------------------------------------------------");
		
		// TCP 서버 시작
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
		// 작업 스레드 정의
		Thread thread = new Thread() {
			// 스레드 동작 정의
			public void run() {
				// 서버 작업을 위한 코드
				try { 
					// ServerSocket 생성 및 Port 바인딩
					// 1. 생성자를 이용한 포트 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버]가 시작됨");
					
					while(true) {  
						System.out.println("\n[서버] 연결 요청 기다림\n");
						// 2. accept()를 이용해서 연결 수락을 기다림... 
						// 연결되면 Socket 객체를 반환
						Socket socket = serverSocket.accept();
						
						//2) 스레드 풀에 실행한 코드를 작성... 
						executorService.execute(() -> {
							try {
								// 연결된 클라이언트 정보 얻기
								InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
								System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");
								
								// 전송 데이터 받기 
								InputStream is = socket.getInputStream();
								DataInputStream dis = new DataInputStream(is);
								String message = dis.readUTF();
								System.out.println("[서버] 클라이언트에게 받은 데이터 : " + message);
								
								// 데이터 전송하기 
								OutputStream os = socket.getOutputStream();
								DataOutputStream dos = new DataOutputStream(os);
								dos.writeUTF(message);
								dos.flush();
								System.out.println("[서버] 받은 데이터를 다시 보냄 : " + message);						
								
								// 4. 연결 끊기
								socket.close();
								System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
							} catch (Exception e) {}
						});
					}
				} catch (IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
			
		};
		// 스레드 시작
		thread.start();
	}
	
	public static void stopServer() {
		try {
			// ServerSocket을 닫고, Port 언바인딩
			serverSocket.close();
			executorService.shutdownNow();
			System.out.println("[서버] 종료됨");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
