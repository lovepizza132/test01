package a_datatype;

import java.util.Scanner;

public class Re01 {

	public static void main(String[] args) {
	
//		String a = new String("홍길동");
//		String b = new String("홍길동");
//		
//		if( a == b ) {
//			System.out.println("동일인물");
//		}else {
//			System.out.println("다르다");
//		}
//		
//		if( a.equals(b)) {
//			System.out.println("동명이인");
//		}else {
//			System.out.println("다르다");
//		}
//==================================================================		
//		int kor = 95, eng = 21;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("국어점수 입력");
//		kor = input.nextInt();
//		System.out.println("영어점수 입력");
//		eng = input.nextInt();
//		
//		int total = kor + eng;
//		double avg = (double)total/2;
//		
//		
//		System.out.println("국어점수: " + kor + ", 영어점수: " + eng);
//		System.out.println("국어와 영어 점수 합계 " + total);
//		System.out.println("국어와 영어 점수 평균 " + avg);
//		
//		if( kor < 40 || eng < 40) {
//			System.out.println("성적 미달 재수강");
//		}else if( avg >= 90 && (kor>=95 || eng >= 95) ) {
//			System.out.println("성적최우수등급");
//		}else if( avg >= 90 ) {
//			System.out.println("A등급");
//		}else if( avg >= 80) {
//			System.out.println("B등급");
//		}else if( avg >= 70) {
//			System.out.println("C등급");
//		}else if( avg >= 60) {
//			System.out.println("D등급");
//		}else if( avg < 60) {
//			System.out.println("등급 미달 재수강");
//		}
//		
//		int temp;
//		temp = kor;
//		kor = eng;
//		eng = temp;
//		
//		System.out.println("국어점수: " + kor + ", 영어점수: " + eng);
//==================================================================	
		/**for문 연습
		 * 
		 */
		Scanner input = new Scanner(System.in); //값을 입력하는 가상의 통로
		System.out.println("N값을 입력하시오");
		int num = input.nextInt(); // 입력받은 n값을 저장하는 변수 num 선언
		
		int number = 1;
		for(int j=0; j<num; j++) {//입력받은 자연수 num만큼 줄수를 만듬
			for(int k=0; k<j; k++) {//j번째 줄보다 작은 수의 공백 수ex)2번째줄 2(0,1개)공백 
				System.out.print("\t");
			}
			for(int i=0; i<num-j; i++) {//공백+숫자를 출력하는 수의 합이 num이 되어야 한다.
				System.out.print(number++ + "\t");
			}
			System.out.println();
		}
	}
	
}
