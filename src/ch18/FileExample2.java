package ch18;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {

	public static void main(String[] args) {
		// renameTo : 파일이나 폴더의 이름 및 경로를 변경
		File originFile = new File("D:/Temp/a.txt");
		File renameFile = new File("D:/Temp/renameA.txt");
		originFile.renameTo(renameFile);
		
		File originDir = new File("D:/Temp/temp");
		File renameDir = new File("D:/Temp/temp2");
		originDir.renameTo(renameDir);
		
		// D:\Temp 디렉터리 내용 출력
		File temp = new File("D:/Temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();  // 줄바꿈 처리... 
		}
		
		// Files 객체
		try {
			String data = "" +
					  "id: winter\n"
					+ "emaile : winter@mycomputer.com\n"
					+ "tel : 010-1234-1234";
			
			//Path 객체 생성
			Path path = Paths.get("D:/Temp/user.txt");
			
			//파일 생성 및 데이터 저장
			Files.writeString(path, data, Charset.forName("UTF-8"));
			
			//파일 정보 얻기 
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 : " + Files.size(path) + " bytes");
			
			// 파일 읽기
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
