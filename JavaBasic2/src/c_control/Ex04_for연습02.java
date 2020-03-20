package c_control;

import java.util.Scanner;

public class Ex04_for연습02 {

	public static void main(String[] args) {
//		//for문 연습문제1
//		Scanner input = new Scanner(System.in);
//		System.out.println("자연수 n을 입력해주세요");
//		int n = input.nextInt();
//		
//		for(int j=1; j<=n; j++) {
//			for(int i=1; i<=n-j; i++) {
//				System.out.print(" ");
//			}
//			for(int i=1; i<=j; i++) {
//				System.out.print(i);
//			}
//			System.out.println();
//			
//		}
//===================다른 답안=======================================
		Scanner input = new Scanner(System.in);
		System.out.println("n값을 입력하세요");
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print(k+1);
			}
			System.out.println();
		}
		
		
		
//===================================================================
		//for문 연습문제2
//		Scanner input = new Scanner(System.in);
//		System.out.println("자연수 n을 입력해주세요");
//		int n = input.nextInt();
//		
//		int number = 1;
//		for(int j=0; j<n; j++) {
//			for(int i=1; i<=j; i++) {
//				System.out.print("\t");
//			}
//			for(int k=1; k<=n-j; k++) {
//				System.out.print(number++ + "\t");
//			}
//			System.out.println();
//		}
//====================================================================
		//구글문제
//		Scanner input = new Scanner(System.in);
//		System.out.println("자연수 n을 입력해주세요");
//		int n = input.nextInt();
//		
//		int num = 1;
//			for(int j=0; j<n; j++) {
//				for(int i=0; i<n; i++) {
//					System.out.print(num + "\t");
//					num += 2;				
//					if(num>10) {
//						num = 1;
//					}
//				}
//				
//				System.out.println();
//			}
		
	}
	
}
