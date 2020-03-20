package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		
//		int [] score = new int [] {88,61,92,35,56}; //
//		// max 변수 선언
//		int max = 0;
//		
//		// 반복문 (for) - 배열의 갯수 만큼
//		for(int i=0; i<score.length; i++) {
//			// score의 i번째 값과 max 값과 비교
//			if(score[i]>max) {
//				// max 값이 더 작다면 max에 저장
//				max = score[i];
//						
//			}
//		}
//		// 최댓값 max 출력		
//

//========================================================
//		int []score = new int[] {88,99,88};
//		int max = 0;
//		for(int i=0; i<score.length; i++) {
//			if(max < score[i]) {
//				max = score[i];
//			}
//		}
//		System.out.println(max);
//=======================================================
		//최대값 max를 출력하라
		int [] score = new int [3];
		int max = 0;
		System.out.println("수를 입력하세요 ex. 88 82 98");
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		for(int i=0; st.hasMoreTokens(); i++) {
			score[i] = Integer.parseInt(st.nextToken());
				}
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
		}
		System.out.println(max);
		
		
		
		
		
	}
}
