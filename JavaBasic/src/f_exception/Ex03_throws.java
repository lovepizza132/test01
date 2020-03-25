package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03_throws {

	public static void main(String[] args) {
		try {
			readFile();//main 함수로 thorws할 경우 JVM에게 예외를 보낸다. 아무의미가 없음으로 main전에는 예외를 잡아야한다.
			System.out.println("파일처리 성공");	
		}catch(Exception ex) {
			System.out.println("실패");
		}

	}
	
	static void readFile() throws Exception{//readFile();로 예외를 떠넘긴다.
		
		FileInputStream fis = new FileInputStream("data2.txt");//파일 통로 / 파일이 제대로 불러오지 않을 경우 모든 소스코드가 작동하지 않게됨으로 예외처리를 꼭 해야 진행됨
		System.out.println("파일 연결");
	}
}
