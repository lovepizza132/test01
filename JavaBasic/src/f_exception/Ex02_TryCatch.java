package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;//fis.read();와 fis.close();의 변수 위치가 각각 달라 멤버변수로 설정해 줘야 적용가능
		try {
			fis = new FileInputStream("data2.txt");//파일 통로 / 파일이 제대로 불러오지 않을 경우 모든 소스코드가 작동하지 않게됨으로 예외처리를 꼭 해야 진행됨
			System.out.println("파일 연결");
			fis.read();//읽기 시작
			//**
//		} catch (FileNotFoundException e) {//구체적으로 경우에 따라서 처리하기 위해서는 사용
//			System.out.println("파일없음 예외");
//			//e.printStackTrace();
//			
//		} catch(IOException e) {
//			System.out.println("읽을 때 예외발생");
			
		} catch(Exception e){// 모든 예외를 다 잡음
			System.out.println("그 외 예외처리");
			
		}finally {
			try {
				fis.close();
			} catch (IOException e) {}
			
		}
		

	}

}
