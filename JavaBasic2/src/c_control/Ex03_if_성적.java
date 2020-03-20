package c_control;

import java.util.Scanner;

public class Ex03_if_성적 {

	public static void main(String[] args) {
		// 0. 국, 영, 수 점수 입력받아서 총점, 평균 출력
		// 1. 평균에 따른 학점(A~F)출력
		//*** if 문 이용

		int kor = 0, eng = 0, math = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요.");
		kor = input.nextInt();

		System.out.println("영어점수를 입력해주세요.");
		eng = input.nextInt();

		System.out.println("수학점수를 입력해주세요.");
		math = input.nextInt();

		int total = kor + eng + math;
		double avg = (double)total / 3;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);

		//90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F
		String hakjum = "";

		if(avg >= 90) {
			hakjum = "A학점";
		}
		else if(avg >= 80) {
			hakjum = "B학점";
		}
		else if(avg >= 70) {
			hakjum = "C학점";
		}
		else if(avg >= 60) {
			hakjum = "D학점";
		}
		else {
			hakjum = "F학점";
		}

		System.out.println( hakjum );	
	}
}
