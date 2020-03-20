package temp;

import java.util.Scanner;

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
		Scanner input = new Scanner(System.in);
		System.out.println("자연수를 입력하세요");
		int total = input.nextInt();



		for(int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				if(total==i+j) {
					System.out.println("<" + i + "\t " +  j + ">");
				}
			}
		}
//=============================================================================================



	}
}
