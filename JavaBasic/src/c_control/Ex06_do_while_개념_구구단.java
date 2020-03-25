package c_control;

import java.util.Scanner;

public class Ex06_do_while_개념_구구단 {

	public static void main(String[] args) {
		//숫자 입력 받기 -> 구구단으로
//	while(true) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int num = input.nextInt();
//
//
//		for(int i=1; i<=9; i++) {
//			System.out.printf(" %d * %d = %d \n", num, i, num*i);
//		}
//		System.out.println("구구단 다시 할까요?");
//		String result = input.next();
//		if(result.equals("N") || result.equals("n") ) break;
//	}

		String result = "";//do{}while문 안에서 선언한 변수는 {}밖에서는 사용할 수 없기때문에 {}밖에서 String result변수 다시 선언(위에 거랑 비교해보기
	do{
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = input.nextInt();


		for(int i=1; i<=9; i++) {
			System.out.printf(" %d * %d = %d \n", num, i, num*i);
		}
		System.out.println("구구단 다시 할까요?");
		result = input.next();
		//if(result.equals("N") || result.equals("n") ) break;
	}while(result.equals("Y") || result.equals("y"));//do while - 다시할까요 / while - 멈출까요? 의 차이점 조건문을 뒤에 놓을지에 따라 다름
//***********************while문은 조건문이 false면 아예 수행을 안함 / do while문은 조건문이 false라도 1번은 수행한다.**************************
//=============================================================================================================		
		
	}

}
