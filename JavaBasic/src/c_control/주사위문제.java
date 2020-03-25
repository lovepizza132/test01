package c_control;

import java.util.Scanner;

public class 주사위문제 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("n값 입력");
		int n = input.nextInt();

		if(n<2 || n>12) {
			System.out.println("Error");
		}else {
			for(int i=1; i<=6; i++) {
				for(int j=1; j<=6; j++) {
					if(i+j==n) {
						System.out.print(i + "\t" + j + "\n");
					}
				}

			}

		}

	}

}
