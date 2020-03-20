package b_operator;

import java.util.Scanner;

public class Ex09_Samhang2 {

	public static void main(String[] args) {
		// 학생 점수를 입력받아 80점 이상이면 "합격"을 출력, 그렇지 않으면 "불합격"을 출력
		
		int score = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생의 점수를 입력해주세요-> ");
		score = input.nextInt();
		
		
		String result = (score >= 80)? "합격" : "불합격";
		System.out.println("결과 : " + result);

		
//		int score = 0;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("점수를 입력해 주세요");
//		score = input.nextInt();
//
//		String result = (score >= 80)? "합격":"불합격";
//		System.out.println(result);
		
	}

}
