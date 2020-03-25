package b_operator;

import java.util.Scanner;

public class Ex11_윤달 {

	public static void main(String[] args) {
		// 윤달 계산 4년에 한번, 100년, 400년마다는 제외
		
		int year = 0;
		while(true) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("윤달 확인기 - 년도를 입력하세요.");
		year = input.nextInt();
		
		if( ( year%4==0 ) && (year%100!=0) || year%400==0 ) {
			System.out.println("윤달입니다.");
		}else {
			System.out.println("윤달이 아닙니다.");
		}
		/*  1. 4년마다 윤년 						-> if(year%4==0)
			2. 1번조건 수렴 후, + 100년마다 윤년이 아님 	-> if((year%4==0) && (year%100!=0))
			3. 2번조건까지 수렴 후, 400년마다 윤년		-> if(((year%4==0) && (year%100!=0)) || (year%400==0){
		*/
		}

	}

}
