package c_control;

import java.util.Scanner;

public class Ex03_0316test {

	public static void main(String[] args) {
		// 세 정수 A, B, C가 주어진다. 이 때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
		// 첫째줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다.(1<=A, B, C <=100)
		// 두번째로 큰 정수를 출력한다.
		int A = 0, B = 0, C = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("세 정수를 입력해주세요.");
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		
		int secondBigNum = 0;
		
		if( A < C && A < B && B < C)//A가 제일 작은 수 일 때, 나머지 중 작은거가 2번째 큰 수
		System.out.println();
		
	}

}
