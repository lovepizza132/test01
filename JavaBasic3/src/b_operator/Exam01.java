package b_operator;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력
		
		// (1) 학생점수 변수 선언 동시에 초기화
		int num1 = 0;//
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");
		num1 = input.nextInt();
		
		if(num1 >= 80 && num1 <= 90) {
			System.out.println("평균");
		} else {
			System.out.println("평균이 아닙니다.");
		}
		

	}

}
