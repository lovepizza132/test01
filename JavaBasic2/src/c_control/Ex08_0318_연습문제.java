package c_control;

import java.util.Scanner;

public class Ex08_0318_연습문제 {

	public static void main(String[] args) {
		/*	0123456789....  0 ->여기 제일 끝에서 한줄로 떨어지는 줄이 첫번째 for문
		 *  0123456789....  1
		 *	0123456789....  2
		 * 	0123456789....  3
		 * 	0123456789....  4
		 *		.			.
		 * 		.			.
		 * 		.			
		 * 		.       	
		 * 012345...계속 떨어지는 수가 2번째 for문
		 */
//		Scanner input = new Scanner(System.in);
//		System.out.println("N값을 입력해주세요");
//		int n = input.nextInt();
//		int result = 1;
//		for(int i=0; i<n; i++) {
//			
//		
//			for(int j=0; j<n; j++) {
//				System.out.print(result + "\t");
//				result += n;
//			}
//			System.out.println();
//		}
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("N을 입력하세요");
//		int n = input.nextInt();
//		
//		
//		//int su1 = 1;
//		for(int i=0; i<n; i++) {// 줄을 표현 01234...이 print'ln'으로 한줄씩 띄어져 줄이 됨  ****8번 줄 참고
//			int su1 = 1+i;
//			for(int j=0; j<n; j++) {
//
//				System.out.print(su1 + "\t");
//				su1 += n;
//				//if(j==n-1) {
//				//su1 = 2+i;
//			//}
//		}
//		System.out.println();
//	}
//=================================================================================================
		//n이 높이, m이 넓이
//		Scanner input = new Scanner(System.in);
//		System.out.println("높이를 입력해주세요");
//		int n = input.nextInt();
//
//		System.out.println("너비를 입력해주세요");
//		int m = input.nextInt();
//
//		int num = 0;
//		for(int i=0; i<n; i++) {
//			if(i%2==0) {
//				for(int j=0; j<m; j++) {
//					System.out.print(++num + "\t");
//				}
//				
//			}else {
//				for(int k=0; k<m; k++) {
//					System.out.print(num+ "\t");
//				}
//			}
//				
//
//			System.out.println();
//		}
		int n =1;
		int sum = 0;
		while(true) {
			sum += n;
			if(n++ > 10)break;
		}
		System.out.println(sum);
		}
}
