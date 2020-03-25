package e_method;

import java.util.Scanner;

public class Ex00_복습2 {
	
	static int jumsu;
	
	
	public static void main(String[] args) {
		String result = func();//23,24에서 반환되는 리턴값을 저장할 변수 선언하기
		// 여기서 합격 여부를 출력하려면?
		System.out.println("결과: " + result);
		
		method();
	
	}

	/** 
	 * method1
	 *  	- 점수를 입력받아 합격여부 확인하는 메소드
	 */
	static  String func() {
		System.out.println("점수를 입력해주세요");
		Scanner in = new Scanner(System.in);	
		jumsu = in.nextInt(); // int jumsu 선언으로 지역변수 값이 이력되는 실수를 주의하자
		if( jumsu >= 80) return "합격";//8번 라인으로 리턴 + 리턴하기 때문에 jumsu를 멤버변수로 둘 것
		else return "불합격";//8번 라인으로 리턴
	}
	
	/**
	 * 점수를 넘겨받아 성적을 구하는 메소드
	 */
	static void method() {
		switch(jumsu/10) {
		case 10:
		case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		default: System.out.println("F"); break;
		}
//		if(jumsu >= 90) {
//			return "A";
//		}
//		else if(jumsu >= 80) {
//			return "B";
//		}
//		else if(jumsu >= 70) {
//			return "C";
//		}
//		else if(jumsu >= 60) {
//			return "D";
//		}
//		else {
//			return "F";
//		}
//		
		
	}

}
