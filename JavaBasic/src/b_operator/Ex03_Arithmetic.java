package b_operator;

import java.util.Scanner;// Ctrl + Shift + O

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
		
		//나머지 연산자 활용 - 홀/짝수 구하기
		
		// (1) 정수형 변수 su 선언
		int su = 0;
		
		// (2) Scanner 선언
		Scanner input = new Scanner(System.in);
	
		// (3) 화면에 "정수를 입력하세요" 출력
		System.out.println("정수를 입력하세요");
		
		// (4) 입력받은 정수를 su 변수에 저장
		su = input.nextInt();
		
		// (5) 입력받은 수 홀/짝수 구하기
		if(su%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// (6) 입력받은 수가 3의 배수인지 아닌지 확인
		if(su%3==0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		
//		int a = 0, b = 0;//변수 선언
//		
//		
//		Scanner input = new Scanner(System.in);//Scanner 선언
//		System.out.println("사칙연산 할 정수 a를 입력해 주세요");
//		a = input.nextInt();
//		System.out.println("사칙연산 할 정수 b를 입력해 주세요");
//		b = input.nextInt();
//		
//		int result = a+b;
//		System.out.println("덧셈 " + result);
//		int result2 = a-b;
//		System.out.println("뺄셈 " + result2);
//		int result3 = a*b;
//		System.out.println("곱셈 " + result3);
//		double result4 = (double)a/b;
//		System.out.println("나누기 " + result4);
//		int result5 = a%b;
//		System.out.println("나머지 " + result5);
		
	}

}
