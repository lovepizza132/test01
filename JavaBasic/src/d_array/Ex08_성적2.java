package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_성적2 {

	public static void main(String[] args) {
		// 학생수 입력받기
		Scanner input = new Scanner(System.in);//입력받을 가상통로
		System.out.println("학생수를 입력하세요");
		int su = input.nextInt();//변수 su에 정수형 입력값 저장
		input.nextLine();
		
		//점수를 저장할 변수(score)를 학생 수만큼 선언
		int score[][] = new int[su][3];
		
		//입력
		for(int i=0; i<score.length; i++) {// 입력받은 정수형 변수 su=의 값 만큼 반복
			System.out.println((i+1) + "번째 학생의 성적을 입력 -> ex 50/77/88");
			String jumsu = input.nextLine();
			StringTokenizer st = new StringTokenizer(jumsu, "/");
			for(int j=0; st.hasMoreTokens(); j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//출력
		int total [] = new int [score.length];// 정수형 total 1행 형태의 배열 score.length만큼의 메모리 방을 만든다.ex) score.length = su, su=2일 경우 int total [2]로 2개의 메모리 방을 만든다.
		double avg = 0;//평균 값을 위한 변수 선언 및 초기화
		for(int i=0; i<score.length; i++) {//[i]x[]행렬의 행을 의미하며, score.length만큼의 행을 만듬
			System.out.print((i+1) + "째 학생의 총점 ");
			for(int j=0; j<score[i].length; j++) {//[i]x[j]행렬의 열을 의미 score[i].length만큼의열을 만듬
			total[i] += score[i][j];//total[i]는 score.length만큼의 행이며 각 행에 score[i][j] 값의 합을 담는다.
			avg = (double)total[i]/score[i].length;
			}
			System.out.println(total[i] + " 이고 평균은 " + avg + " 입니다");
			System.out.println();
		}
			
		
	}

}
