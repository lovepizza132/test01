package io;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		File f = new File("a.txt");
		
		if(f.isFile()) {
			System.out.println("파일입니다.");
		}else if (f.isDirectory()) {
			System.out.println("디렉토리입니다.");
			String [] sub = f.list();//배열과 콜렉션은 향상된 반복문 사용 가능
			for(String m:sub) {//상변화 안해도 되어서 좋음
				System.out.println(m);
			}
			
		}
		
		f.delete();
	}

}
