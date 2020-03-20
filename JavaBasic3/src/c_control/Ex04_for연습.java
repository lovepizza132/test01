package c_control;

import java.util.Scanner;

public class Ex04_for연습 {

	public static void main(String[] args) {
//
//				int a = 0;
//				System.out.println("N의 값을 입력하세요 ");
//				Scanner input = new Scanner(System.in);//숫자를 입력받을 가상통로
//				a = input.nextInt();//숫자를 입력받아 변수 a에 저장
//				
//				for( int i=1; i<=a; i++) {//입력받은 a값만큼 반복
//					System.out.print(i + "\t");//\t 공백효과 숫자 순차대로 출력
//					if( i%5==0 ) { //5의 배수만큼
//						System.out.println();//줄바꿈 출력
//					}
//				}
		
//=======================================================================		
//		//2. 연습문제
//		
//		System.out.println("N값을 입력해주세요");
//		Scanner input = new Scanner(System.in);
//		char N = input.next().charAt(0); // character값을 가져오는 방법+ 입력받은 값을 저장할 수 있는 변수n에 대한 선언 및 초기화
//		
//
//		//입력한 문자가 소문자라면
//		if('a'<=N && N<='z') {
//			for(char ch = 'a'; ch <= N; ch++) {
//				System.out.print(ch);
//			}
//		//입력한 문자가 대문자라면
//		}else if('A'<=N && N<='Z') {
//			for( char ch = N; ch <= 'Z'; ch++) {
//				System.out.print(ch);
//			}
//		//그외라면
//		}else {
//			System.out.println("Error");
//		}
//=======================================================================		
//		//3.연습문제
//		Scanner input = new Scanner(System.in);
//		System.out.println("문구를 입력하세요");//입력받은 문자열 저장 변수
//		String mun = input.next();//문자열의 길이 입력 변수
//	
//		
//		int length = mun.length();//문자열의 길이 입력 변수
//		for(int i = length-1; i>=0; i--) {
//			System.out.print(mun.charAt(i));
//		}	
//		
		Scanner input = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String mun = input.next();
		int length = mun.length();
		
		for(int i=length-1; i>=0; i--) {
			System.out.print(mun.charAt(i));
		}
		
		
		
	}		
}