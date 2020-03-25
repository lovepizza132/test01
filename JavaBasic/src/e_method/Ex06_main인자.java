package e_method;

public class Ex06_main인자 {

	public static void main(String[] args) {//jvm에서 인자를 따옴
		//서버 접속
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("위의 정보로 서버접속");

		
	}
}
/*
 * 	직접 운영체제에서 자바 실행할 때
 * 		(1) 자바 컴파일 (Hello.java -> Hello.class)
 * 			javac Hello.java
 * 		(2) 자바 실행(Hellp.class)
 * 			java Hello - 확장자를 뺀 파일명을 기술합니다.
 * 
 * 			문자열을 입력하여 실행
 * 				java Ex06_main인자 서버ip, 서버계정, 서버비밀번호
 */