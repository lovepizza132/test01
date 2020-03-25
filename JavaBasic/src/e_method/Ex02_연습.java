package e_method;

import java.util.*;

public class Ex02_연습 {

/**
 * (문제 1) 영문자를 입력하여 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오.
  함수명 : checkLower
  매개변수 = 인자 : char
  리턴(반환) : boolean
*/
	public static void main(String[] args) {
		System.out.println("영문자를 입력하세요");
		Scanner input = new Scanner(System.in);
		char ch = input.nextLine().charAt(0);
		
		boolean alpha = checkLower(ch);
		System.out.println(alpha);
	}
	
	static boolean checkLower(char ch) {
		
		if('a'<=ch && ch<='z') {
			return true;
		}else {return false;
	}
	}
	
//	public static void main(String[] args) {
//		// 문자 입력
//		System.out.println("문자를 입력해주세요");
//		Scanner input = new Scanner(System.in);
//		char ch = input.nextLine().charAt(0);
//		
//		
//		boolean result = checkLower(ch); // checkLower(); 메소드에 보낼 데이터 인자(매개변수) 변수 ch 기입
//										 // static boolean checkLower(char ch)에서 리턴 받은 boolean값을 저장하기 위한 변수 boolean 선언 및 초기화
//		if(result)System.out.println("소문자");// 굳이 result == true를 적지 않아도 됨, 그러나 if문 조건을 명확하게 개발자가 인식하기 위해서 명시해 놓기도 함
//		else System.out.println("소문자가 아님");// result 값이 true 냐 false 냐에 따라 출력되는 것이 달라짐
//		
//	
//	}
//	
//	static boolean checkLower(char ch) {// 넘어온 인자 데이터를 저장할 같은 형태(char)의 변수 선언 - 헷갈리지 않기 위해 같은 ch로 명명
//										// + 메소드에 static + boolean(리턴할 변수형) 넣어주기
//		// 넘겨받은 인자 ch의 값이 소문자라면 return true;
//		// 그렇지 않으면 return false;
//		if('a'<=ch && ch<='z') {// 소문자라면의 조건 충족을 위한 if문
//			return true;//20번 라인으로 단 하나의 boolean형 변수 값 true 리턴
//		}
//		else {
//			return false;//20번 라인으로 단 하나의 boolean형 변수 값 false 리턴
//		}
//			
		
		
		

}
