package io.bytestream;

/*
	===========================================================
	OuputStream을 구현한 FileOutputStream을 이용한 예제
	===========================================================
	
	@ write( int )
		` 0-255 사이의 정수를 인자로 받아 해당하는 바이트를 출력스트림에 쓴다
		` 인자로 정수형을 받지만, 실제로는 부호없는 바이트로 전송
		  ( 자바에서 정수형은 32bit이지만 그 중 8bit만 사용 )
	
	
	
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTestFirst
{
	public static void main( String args[] ) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("a.txt");//파일을 출력하는 메소드 // writing할때는 파일이 없으면 만들어줌

			for( int ch = 'A'; ch <='Z'; ch++)
			{
				fos.write(ch);//write을 진행
			}
				
			fos.close();//통로를 사용했으면 반드시 닫아줘야한다.
			
		}catch( IOException ex ){
			System.out.println("파일전송실패 :" + ex.toString() );
		}
	}	
}
//출력을 보고 입력을 만들어야 한다.
/****************************************************
	a.txt 를 노트패드와 워드패드로 읽어보기
*/