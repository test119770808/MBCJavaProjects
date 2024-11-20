package ch18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample1 {
	
	/*
	 *  File 클래스 
	 *   : file 객체를 생성하는 클래스. 파일(파일과 디렉터리)과 과련된 작업을 진행할 수 있음. 
	 */

	static String env_path = "C:\\Program Files\\Python312\\Scripts\\;C:\\Program Files\\Python312\\;C:\\Program Files\\Python313\\Scripts\\;C:\\Program Files\\Python313\\;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\Program Files (x86)\\NVIDIA Corporation\\PhysX\\Common;C:\\Program Files\\Java\\jdk-21\\bin;C:\\Program Files (x86)\\Windows Kits\\10\\Windows Performance Toolkit\\;C:\\Users\\Admin\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\Admin\\AppData\\Local\\Programs\\Microsoft VS Code\\bin";
	
	
	public static void main(String[] args) {
		// File 객체 생성
		File f = new File("D:/Temp/a.txt"); // 일반 파일 정보를 담은 객체
		File dir = new File("./");			// 디렉터리 파일 정보를 담은 객체
		// "./"는 현재 디렉터리를 의미함. 
	
		// 1. exists : 파일 혹은 디렉터리의 존재 여부 확인
		System.out.println("exists? : " + f.exists());
		System.out.println("exists? : " + dir.exists());
		
		// 2. isDirectory : 디렉터리인지 여부 확인 (파일이면 false )
		System.out.println("isDirectory? : " + f.isDirectory());
		System.out.println("isDirectory? : " + dir.isDirectory());
		
		// 3. isAbsolute : 해당 경로가 절대 경로인지 여부 확인
		// 절대 경로 : 최상이 디렉터리부터 모든 경로를 다 표시하는 경우
		//  C:\Program files\java\jdk-21\bin\java.exe
		//  D:\Temp\a.txt
		// File 작업에서 디렉터리 구분값을 "\\" 또는 "/"
		// 상대 경로 : 현재 작업 위치로부터 경로를 표시하는 경우
		//  ./ : 현재 디렉터리,  ../ : 상위 디렉터리(바로 위)
		//  ../test/test.txt  -> 부모 디렉터리에서 test디렉터리에 있는 test.txt 파일
		System.out.println("isAbsolute?" + f.isAbsolute());
		System.out.println("isAbsolute?" + dir.isAbsolute());
		
		// 4. canExecute, canRead, canWrite : 권한 확인
		System.out.println("canExecute? " + f.canExecute());
		System.out.println("canRead? " + f.canRead());
		System.out.println("canWrite? " + f.canWrite());
		
		// 5. getAbsolutePath : 절대 경로 반환 (상대경로를 절대경로로 찾아줌)
		System.out.println("./의 실제 위치 (절대 경로) : " + dir.getAbsolutePath());
		
		// 6. 부모 폴더를 문자열로 반환 : getParent()
		String parentDir = f.getParent();
		System.out.println(parentDir);
		
		// 7. 부모 폴더를 file객체로 반환 : getParentFile()
		File f_parent = f.getParentFile();
		System.out.println(f_parent);
		
		// 8. File 상수값 : 구분값 기호
		System.out.println(File.separator);			// \ 디렉터리 구분값
		System.out.println(File.separatorChar);		// \
		System.out.println(File.pathSeparator);		// ; 경로 구분값
		System.out.println(File.pathSeparatorChar);	// ;
		
		// 환경 변수
		String[] path = env_path.split(File.pathSeparator);
		
		for (String p : path) {
			System.out.println(p);
		}
		
		// 파일 생성/수정/삭제 메서드
		File test = new File("D:/Temp/temp/abc");
		// mkdir : 해당 경로에 폴더(디렉터리)를 만든다.
		// mkdirs : 존재하지 않는 부모 폴더(디렉터리)까지 모두 포함해서 폴더 생성
		if(!test.exists()) {
//			test.mkdir(); // 경로에 부모 디렉터리중 하나라도 없으면 생성 X, 반환값 boolean
			test.mkdirs();
		}
		
		// createNewFile : 파일이 없으면 새로 생성
		test = new File("D:/Temp/filetest3/test/a.txt");
		
		try {
			File testDir = test.getParentFile(); // 부모 디렉터리를 File객체로 반환
			if(!testDir.exists()) {
				if(testDir.mkdirs()) {
					System.out.println("디렉터리 생성");
					if(test.createNewFile()) {  // 반환 타입이 boolean
						System.out.println("파일 생성");
					}else System.out.println("파일 생성 실패");
				}else {
					System.out.println("디렉터리 생성 실패");
					throw new FileNotFoundException("파일 경로 못찾음");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성 중 에러가 발생했음.");
		}
		
		// 디렉터리 내에 정보 확인 : listFiles() 디렉터리 내용 출력
		File[] dirFiles = f_parent.listFiles();
		System.out.println("D:\\Temp 디렉터리 내용");
		for (File af : dirFiles) {
			System.out.println(af);
		}
		System.out.println();
		
		// delete : 파일이나 디렉터리를 삭제. 디렉터리는 비어있지 않으면 삭제 불가.
		test = new File("D:/Temp/filetest3/test/");
		
		if (!test.delete()) {  // 삭제 실패시
			if (test.isDirectory()) {
				System.out.println("디렉터리 삭제 실패");
				System.out.println(test + " 디렉터리가 비어있지 않음");
				for (File df :test.listFiles()){
					System.out.println(df);
					if(!df.delete()) {
						System.out.println(df + " 삭제 실패!");
					}else {
						System.out.println("삭제 성공");
					}
				}
				if (test.delete()) System.out.println("디렉터리 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			
		}else {
			System.out.println("삭제를 성공했습니다.");
		}
		
		
	}

}



