package io.bytestream;

/*
	======================================================
	InputStream을 구현한 FileInputStream을 이용한 예
	======================================================
	
	@ int read()
		` 한 바이트를 읽고 이를 0-255사이의 값을 리턴하지만4byte의 int 형으로 리턴
		` 리턴되는 값은 0-255 부호없는 바이트이지만 형변환 과정에서 -128 ~127의 부호 있는 바이트가 된다
		
		
		` 데이타를 읽어들이기 전까지 기다리므로 다른 부분을 실행할 수가 없다
			-> 쓰레드 적용 필요
			
		` 더이상 읽을 바이트가 없으면 -1 리턴
		
		
		
		[ 참고 ]
			int i =  b >= 0 ? b : 256 + b;
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputTestFirst
{
	public static  void main( String args[] ) 
	{
		try {
			// 1. a.txt 파일에서 읽을 수 있는 스트림을 생성
			FileInputStream fis = new FileInputStream("a.txt");
			// 2. 스트림을 통해 읽어서 화면에 출력
//			for(int i=0; i<26; i++) {//파일에 있는 문자의 수
//				int data = fis.read();// 파일에 있는 모든 문자의 수를 읽음
//				System.out.print((char)data);
//			}
			//파일이 끝날 때(EndOfFile : EOF-1)까지 읽어라
			while(true) {
				int data = fis.read();
				if(data==-1)break;
				System.out.print((char)data);
			}
			
			fis.close();//스트림을 생성하면 꼭 닫기
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않는 예외발생");
		} catch(IOException e) {
			System.out.println("읽기 실패: " + e.getMessage());
		}
	
		
		
	}	
}

//출력을 보고 입력을 만들어야 한다.
/*
	======================================
		결과 출력
	======================================

	` 숫자만 나오는데, 우선 열개만 읽어서 숫자 자체로 출력하고
	나머지는 읽어서 (char) 형변환 하면 문자로 출력될 것이
*/