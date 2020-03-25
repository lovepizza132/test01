package temp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Remind {

	public static void main(String[] args) {
//		//3행 2열 행렬에 번호붙이기
//		
//		for(int j=0; j<3; j++) {
//			for(int i=0; i<2; i++) {
//				System.out.printf("< %d, %d >", j, i);
//			}
//			System.out.println();
//		}
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("자연수를 입력하세요");
//		int total = input.nextInt();
//
//
//
//		for(int i=1; i<7; i++) {
//			for(int j=1; j<7; j++) {
//				if(total==i+j) {
//					System.out.println("<" + i + "\t " +  j + ">");
//				}
//			}
//		}
//=============================================================================================
		// 야구 게임 만들기
		
		
//		
//		for(int i=0; i<3; i++) {
//			baseball[i]=(int)Math.random()*10;
//			for(int j=0; j<i; j++) {
//				if(baseball[j]==baseball[i]) {
//				}
//				i--;
//			}
//			System.out.println(baseball[i]);
//		}	
//		OUT:
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				if(baseball[i]==answer[j]) {
//					ball += i;
//				}else if(i==j) {
//					strike += i;
//				}else if(strike==3) break OUT;
//			}
//		}
//		System.out.println("strike: " + strike + "개");
//		System.out.println("ball: " + ball + "개");

//======================================================================
		int baseball[] = new int [3];
		int answer[] = new int [3];
		
		for(int i=0; i<3; i++) { 
			baseball[i] = (int)(Math.random()*10);
			if(baseball[i]==baseball[2]) {
				i--;
			}
			System.out.println(baseball[i]);
		}
		//입력
		Scanner input =new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ex. 8/9/0");
		String line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line, "/");
		for(int i=0; st.hasMoreTokens(); i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		
		//출력
		int strike = 0;
		int ball = 0;
		HERE:
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(strike==3) {
					break HERE;
				}else if(baseball[i]==answer[j]) {
					ball += i;
				}else if(i==j) {
					strike += i;
				}
			}
		}
		System.out.println(strike + "스트라이크");
		System.out.println(ball + "볼");
		
		
	}
}
