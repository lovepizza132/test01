package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest {

		
		public static void main(String[] args) {
		CalculatorExpr s = new CalculatorExpr();//객체 생성
		String answer = "";
		do {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력");
		int first = input.nextInt();
		int second = input.nextInt();
		//입력값을 멤버변수에 저장
		
		s.setNum1(first);
		s.setNum2(second);

		//사칙연산 메소드 호출하여 출력
		System.out.println("덧셈: " + s.getAddion());
		System.out.println("뺄셈: " + s.getSubtraction());
		System.out.println("곱셈: " + s.getMultiplication());
		System.out.println("나눗셈: " + s.getDivision());
		
		
			System.out.println("계속 진행하시겠습니까? y/n ");
			answer = input.next();
		}while(answer.equals("y"));
//			if(answer.equlas("n")) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			else if(answer.equal("y")) {
//				System.out.println("두 정수를 다시 입력해주세요");
//			
//				s.setNum1(input.nextInt());
//				s.setNum2(input.nextInt());
//				System.out.println("덧셈: " + s.getAddion());
//				System.out.println("뺄셈: " + s.getSubtraction());
//				System.out.println("곱셈: " + s.getMultiplication());
//				System.out.println("나눗셈: " + s.getDivision());
//			}
//			else {
//				System.out.println("잘못 입력하셨습니다.");
//			}
//			
//		}
	}

}
