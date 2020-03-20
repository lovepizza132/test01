package c_control;

public class Ex04_for개념 {

	public static void main(String[] args) {
		/*
		 * for( 초기치;조건식; 증가치){
		 * 반복구문
		 * }
		 */

//		//0. 인사말 5번 출력하기

				for( int i=0; i<5; i++ ) {
					System.out.println("안녕하세요");
				}
//		//1. 1부터 10까지의 합 구하기
//
//		//		int hap = 0;
//		//		for(int i=1; i <= 10000; i++ ) {
//		//			hap += i; //hap = hap + i;
//		//		}
//		//		System.out.println("합= " + hap);
//==================================================================
//		//2. 1부터 100까지 홀수의 합과 짝수의 합 구하기
//		int even = 0, odd = 0;
//		for( int i=0; i<=100; i++) {
//			if( i%2==0) {
//				even += i;
//			}else if( i%2==1 ) { //짝수가 아니면 홀수이기 때문에 else를 써서 odd += i;만 써도 가능
//				odd += i;
//			}
//		}
//		System.out.println("짝수의 합: " + even );
//		System.out.println("홀수의 합: " + odd );
//===================================================================
//		//3. A~Z까지 출력
//		for(char ch='A'; ch<='Z'; ch++) {
//			System.out.print(ch);
//		}
//		System.out.println();
//====================================================================		
//		//4. A~Z까지 출력(2개씩 건너뛰기)
//		for(char ch='A'; ch<='Z'; ch+=2) {
//			
//			System.out.print(ch);
//		}
		
		
		//5. Z~A까지 출력
		for(char ch='Z'; ch >='A'; ch--) {
			System.out.print(ch);
		}
		System.out.println();
		for(char ch='Z'; ch >='A'; ch-=2) {
			System.out.print(ch);
		}
		
	}
}
