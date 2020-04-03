package network1.basic;

import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleClient {
	
	public final static int PORT = 5000;
	public final static String HOST = "192.168.0.79";
	
	public static void main( String args[] ) {
		
		Socket client = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		
		// 콘솔 입력을 받기 위해
		Scanner stdin = new Scanner( System.in );
		

		try{ 
	//네트워크란 입출력으로 데이터를 주고받는 것
					
		// 1. 서버에 연결하기 위해 소켓 생성
		client = new Socket(HOST, PORT);//통신을 하는 기능	
			
		// 2. 소켓의 입출력 스트림 얻기
		in = new DataInputStream( client.getInputStream());//소켓안에 들어있는 스트림을 필터링 진행
		out = new DataOutputStream(client.getOutputStream());//소켓을 통해 출력하는 스트림에 필터링 진행
			
		
		// 3. 키보드 입력 받아 서버에 전송
		System.out.println("짝꿍에게 인사말을 ->");
		String inData = stdin.nextLine();
		out.writeUTF(inData);
				
		// 4. 서버로부터 응답을 받음
		String outData = in.readUTF();
		System.out.println(outData);
		
		// 5. 입출력 스트림의 닫음
			in.close();
			out.close();
			client.close();
			
			
		} catch ( Exception ex ) {
			System.out.println("Error writing.." + ex );	
		}
	}	
}