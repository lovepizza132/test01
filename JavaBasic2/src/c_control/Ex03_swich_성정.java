package c_control;

import java.util.Scanner;

public class Ex03_swich_성정 {

	public static void main(String[] args) {
		// 0. 국, 영, 수 점수 입력받아서 총점, 평균 출력
		// 1. 평균에 따른 학점(A~F)출력
		//*** switch 문 이용

		int kor = 0, eng = 0, math = 0;
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요");
		kor = input.nextInt();

		System.out.println("영어점수를 입력해주세요");
		eng = input.nextInt();

		System.out.println("수학점수를 입력해주세요");
		math = input.nextInt();

		int total = kor + eng + math;
		double avg = (double)total / 3;

		System.out.println("총점: " + total);
		System.out.println("평균: " + avg );

		//90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F

		String hakjum = "";

		switch((int)avg / 10) {
		case 10 :
		case 9 :
			hakjum = "A학점";
			break;
		case 8 :
			hakjum = "B학점";
			break;
		case 7 :
			hakjum = "C학점";
			break;
		case 6 :
			hakjum = "D학점";
			break;
		default :
			hakjum = "F학점";
			break;
		}
		System.out.println( hakjum );


		}
	}
}
