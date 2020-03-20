package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Ex01_성적_입력 {

	public static void main(String[] args) {
		// 학생점수를 입력받아 평균과 총점을 출력
		// 입력형식: 80/88/77
		// 출력형식: 총점: XXXXX
		//		    평균: xxxxx
		
//===============================교수님 답안=============================
//		int []score = new int[3];
//		//1. 입력받아 score 변수에 저장
//		System.out.println("성적을 입력하세요 (80/88/77)");
//		Scanner input = new Scanner(System.in);
//		String temp = input.nextLine();
//		StringTokenizer st = new StringTokenizer(temp, "/");
//		int total = 0;
//		double avg =0;
//		for (int i=0; i<st.countTokens(); i++) { // st.hasMoreTokens()와 같이 쓸 수 있다.
//			String token = st.nextToken();
//			score[i] = Integer.parseInt(token);
//			total += score[i];
//			
//		}
//		System.out.println("총점: " + total);
//		avg = (double)total/score.length;
//		System.out.println("평균: " + avg);
//=============================================================================
//		int score[] =new int [3];
//		int total = 0;
//		double avg = 0;
//		System.out.println("점수를 입력해주세요 ex. 88/98/20");
//		Scanner input = new Scanner(System.in);
//		String line = input.nextLine();
//		StringTokenizer st = new StringTokenizer(line, "/");
//		for(int i=0; st.hasMoreTokens(); i++) {
//			score[i] = Integer.parseInt(st.nextToken());
//			total += score[i];
//		}//end for-i
//		avg = (double)total / score.length;
//		System.out.println("합: " + total);
//		System.out.println("평균: " + avg);
	}

}
