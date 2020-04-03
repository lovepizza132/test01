package h_inherit4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Language l = null;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("언어를 선택하세요 (1. 한국어, 2. 영어, 3. 일본어");
			switch(input.nextInt()) {
			case 1: l = new Korean(); break;
			case 2: l = new English(); break;
			case 3: l = new Japanese(); break;
			}
			System.out.println("메시지를 선택하세요(1. 인사말, 2. 자기소개, 3. 하고픈 말");
			switch(input.nextInt()) {
			case 1: l.Hello();break;//다형성 + 오버라이딩
			case 2: l.Introduce();break;
			case 3: l.Say();break;
			}
			System.out.println("종료하시겠습니까?( y / n");
		}while(input.next().charAt(0)=='y');
		

	}

}
