package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Ex05_while_개념 {

	public static void main(String[] args) {
//		// 1~10까지 합
//		int hap = 0;
//		int i=1;//초기치
//		//for(; i<=10; ) {
//		while( i<=10 ) {
//			hap += i;
//			i++;//증가치는 원하는 반복구문 수행 후 위치
//		}
//		System.out.println("합: " + hap);		
//============================================================
//		//숫자 입력 받기 -> 구구단으로
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자를 입력");
//		int n = input.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			System.out.printf(" %d * %d = %d \n", n, i, n*i);
//		}
//=-=-=-=-=-=-=-=-=-0위에는 for, 밑에는 while-=-=-=-=-=-=--=-=-=-=
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int num = input.nextInt();
//		
//		int i=1;
//		//for(int i=1; i<=9; i++) {
//		while(i<=9){
//		System.out.printf(" %d * %d = %d \n", num, i, num*i);
//		i++;
//		}
//=============================================================
//		//문장을 입력받아 단어로 나눠서 출력
//		///"빨리 코로나 끝났으면 좋겠습니다."
//		Scanner input = new Scanner(System.in);
//		System.out.println("점수를 입력해주세요.(ex. 90/80/70/60)");
//		String line = input.nextLine();
//		StringTokenizer st = new StringTokenizer(line, "/"); //
//		System.out.println(st.countTokens()); // 설정한"/"기준으로 나눠진 Tokens의 갯수를 셈
//		while(st.hasMoreTokens()) { //리턴할 토큰이 있으면 true, 없으면 false를 리턴한다=>while때문에 false가 나올때 가지 리턴
//			String temp = st.nextToken(); //이전 토큰 값을 제거+++값st(입력받은 문장을 토큰으로 구분시켜 놓은 토큰 값)에서 각각의 토큰을 변수   문자형 변수 temp에 저장
//			//int su = Integer.parseInt(temp); // String -> int
//			System.out.println(temp);
//		}
//=============================================================
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ex. 10 20 33 55");
		String line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		
		int even = 0;
		int odd = 0;
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			int su = Integer.parseInt(temp);
			
			if(su%2==0) {
				even += 1;
			}else {
				odd += 1;
			}
		}
		System.out.println("짝수: " + even + "개");
		System.out.println("홀수: " + odd + "개");
		
		
		
		
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 입력하셈 (ex. 10 20 30 55 66 77 88 99 100 15)");
//		String line = input.nextLine();
//		StringTokenizer st = new StringTokenizer(line, " ");
//		int even =0; //전역변수(전체에서 사용가능 - while내에서도 가능)
//		int odd = 0; //전역변수
//		while(st.hasMoreTokens()) {
//			String temp = st.nextToken();//지역변수 (while문 안에서만 사용)
//			int su = Integer.parseInt(temp);//지역변수
//			
//			if(su%2==0) {
//				even += 1;
//			}else if(su%2==1) {
//				odd += 1;
//			}
//		}
//		System.out.println("짝수 : " + even + "개" );
//		System.out.println("홀수 : " + odd + "개");
//=============================================================
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 (ex 10 23 31 50)");
//		String line = input.nextLine();
//		StringTokenizer st = new StringTokenizer(line, " ");
//		int even = 0;
//		int odd = 0;
//		while(st.hasMoreTokens()) {
//			String temp = st.nextToken();
//			int su = Integer.parseInt(temp);
//			System.out.println(temp);
//			if(su%2==0) {
//				even += 1;
//			}else {
//				odd += 1;
//			}
//		}//while 문
//		System.out.println("짝수 : " + even + "개"); // if 밑에 놓으면 true마다 계속 출력
//		System.out.println("홀수 : " + odd + "개");
	}
}
