package e_method;

import java.util.Scanner;

public class Ex05_연습_원본{
	
	public static void main(String[] args) {
		char result [][] = input();
		output(result);
	}

	/*
	 *  두 정수와 알파벳 문자 하나를 입력받기
	 *  예) 3 4 F
	 */
	static char[][] input() {
		System.out.println("두 정수와 알파벳 문자 하나를 입력받기");
		Scanner input = new Scanner(System.in);
		int first = input.nextInt();
		int second = input.nextInt();
		char alpha = input.next().charAt(0);
		char [][] result = makeSquare(first, second, alpha);
		return result;
	}
	/*
	 * 입력받은 첫 번째 정수만큼의 행과 두번째 정수만큼의 문자 배열을 만들어
	 * 입력받은 문자로 시작하는 알파벳을 저장하기
	 * 	
	 * 	  F G H I
	 *    J K L M
	 *    N O P Q
	 *    	  
	 */
	
	static char[][] makeSquare(int first, int second, char alpha){
		char ch [][] = new char [first][second];
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++) {
				ch[i][j]=alpha;
				alpha++;
			}
		}
		return ch;
	}
	// 출력
	
	static void output(char [][] ch) {
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
	}
			
		
	

	

}
