package e_method;

import java.util.Scanner;

//public class Ex06_복습3 {
//	static int total = 0;
//	static double avg = 0;
//	public static void main(String[] args) {
//		
//		int score[] = input();
//		calScore(score);// 리턴값은 없지만 	
//		output();
//	}
//	//출력
//	static void output() {
//		System.out.println("총점: " + total);
//		System.out.println("평균: " + avg);
//	}
//	
//	// 입력받은 국영수 점수로 총점, 평균을 구하기
//	static void calScore(int score []) {
////		int total = 0;// 다른 데이터 타입을 묶어서 보내야하는 사항이라면 멤버변수로 설정하는게 좋다
////		double avg = 0;// 
//		for(int i=0; i<score.length; i++) {
//			total += score[i];
//		}
//		avg = (double)total / score.length;
//	}
//	
//	// 국영수 점수를 입력받기
//	static int[] input() {
//		int kor=0, eng=0, math=0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("국어, 영어, 수학 점수를 입력해주세요");
//		kor = input.nextInt();
//		eng = input.nextInt();
//		math = input.nextInt();
//		int score[] = {kor, eng, math};//return할 수 있는 값이 단 하나임으로 배열로 묶어서 반환
//		return score;
//		
//		
//		
//	}
	public class Ex06_복습3 {
		
		static int total = 0;
		static double avg = 0;
		
		public static void main(String[] args) {
			int score [] = input();
			calScore(score);
			output();
			
		}
		
		static void output() {
			System.out.println("합계: " + total);
			System.out.println("평균: " + avg);
		}
		
		// 입력받은 점수 합계, 평균구하기
		static void calScore(int score []){
			for(int i=0; i<score.length; i++) {
				total += score[i];
			}
			avg = (double)total / score.length;
		}
		
		// 국어, 영어, 수학 점수 입력받기
		static int [] input()	{
			int kor, eng, math = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("국어, 영어, 수학 점수를 입력해주세요");
			kor = input.nextInt();
			eng = input.nextInt();
			math = input.nextInt();
			int [] score = {kor, eng, math};
			return score;
		}
		
}
