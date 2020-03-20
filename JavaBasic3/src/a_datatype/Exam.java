package a_datatype;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {


		// 나이와 키를 입력받아서 출력
				
		Scanner input = new Scanner(System.in);
	
		
		System.out.println("춘추가 어떻게 되시나요? __살 ");
		int age = input.nextInt();
		
		System.out.println("키는 얼마나 크시나요? __cm ");
		double hieght = input.nextDouble();
		
		System.out.println("성함이 어떻게 되시나요? ");
		input.nextLine(); //input.nextLine();의 메소드는 스페이스바, 엔터를 누르면 입력값 입력이 끝났다고 판단하여 위에 nextDouble 메소드에 대한 입력을 위해 엔터를 누르면 String name에 입력을 못한채 넘어가기 때문에 그 사이에 의미없는 메소드를 하나 넣어줌
		String name = input.next();
		
		
		System.out.println("이름: " + name + " 나이: " + age + " 키: " + hieght);
		
	}	

}
