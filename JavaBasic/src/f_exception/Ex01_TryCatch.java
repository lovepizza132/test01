package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String [] msg = new String[]{"행복하자","끝내자","만난거먹자"};
		try{//이 구문안에 문제가 발생하면
			for(int i=0; i<msg.length; i++) {
				System.out.println(msg[i]);
			}
			return;
		}catch(Exception ex) {//catch가 잡아줌
				System.out.println("예외처리: " + ex.toString());
		}finally {//무조건 실행하는 구문
			System.out.println("무조건 실행 구문");
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	

}
/*
 * 	오류
 * 		- 에러 : 심각한  오류 (컴파일 오류)
 * 		- 예외 : 심각하지 않은 오류
 * 				-> 예외처리 : 프로그램 정상 종료를 위해
 * 			(1) try~ catch(예외 잡으세요~~)
 * 				try {
 * 					예외가 발생할 구문
 * 				} catch( Exception ex){
 * 				} finally{
 * 					예외관계없이 무조건 실행 구문
 * 				}
 * 			(2) 메소드 뒤에 throws(예외 던지세요~~)
*/

