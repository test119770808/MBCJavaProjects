package ch19;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {

	// 1. 필드 생성
	ServerSocket serverSocket;
	// 스레드풀 생성
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	// 채팅 메시지 처리를 위한 객체 생성(SocketClient 나중에 생성)
	Map<String, SocketClient> chatRoom = 
			Collections.synchronizedMap(new HashMap<>());
	
	
	// 메서드 : 서버 시작
	public void start() throws IOException {
		// ServerSocket 객체를 생성... 
		serverSocket = new ServerSocket(50005);
		System.out.println("[서버] 시작됨");
		
		Thread thread = new Thread(() -> {
			try {
				while(true) {
					Socket socket = serverSocket.accept();
					// SocketClient 연결을 생성... 
					SocketClient sc = new SocketClient(this, socket);
				}
			}catch (Exception e) {}
		});
		thread.start();
	}
	
	// 메서드 : 클라이언트 연결시 SocketClient 생성 및 추가
	public void addSocketClient(SocketClient socketClient) {
		// key를 생성하기 위한 chatName과 clientIp를 사용... 
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		System.out.println("addSocketClient : "+key);
		chatRoom.put(key, socketClient);
		System.out.println("입장 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
	}
	
	// 메서드 : 클라이언트 연결 종료시 SocketClient 제거
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("나감 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");
	}
	
	// 메서드 : 모든 클라이언트에게 메시지 보냄
	public void sendToAll(SocketClient sender, String message) {
		// 메시지를 전달방식은 JSON형태로 생성
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();
		
		Collection<SocketClient> socketClients = chatRoom.values();
		for (SocketClient sc : socketClients) {
			if(sc == sender) continue;
			// 메시지 전달을 위한 메서드... SocketClient 내에... 
			sc.send(json);
		}
	}
	
	// 메서드 서버 종료
	public void stop() {
		// 객체 정리.. 
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			for (SocketClient sc : chatRoom.values()) {
				sc.close();  // SocketClient 정리... 
			}
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {}
	}
	
	public static void main(String[] args) {
		// 서버 구동... 
		try {
			ChatServer chatServer = new ChatServer();
			chatServer.start();
			
			System.out.println("-------------------------------------------------");
			System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요. ");
			System.out.println("-------------------------------------------------");
			System.out.println();
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String key = scanner.nextLine();
				if(key.equals("q")) break;
			}
			scanner.close();
			chatServer.stop();
			
		} catch (IOException e) {
			System.out.println("[서버] " +e.getMessage());
		}
	}

}
