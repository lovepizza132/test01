package b_operator;

/**
 * 	not : 결과를 반대로 하는 연산자
 * 			- 일반논리 not :  ! 	-> 일반논리 true와 false를 가지고 논하는 것
 * 					true -> false / false -> true로 변화
 * 			- 이진논리 not : ~		-> 각 비트의 값이  0 -> 1 / 1-> 0 즉, 양수 -> 음수 / 음수 -> 양수
 */
public class Ex02_Not {

	public static void main(String[] args) {
	
		boolean result = 3 > 4;
		System.out.println(result);//false
		System.out.println(!result);//true
		
		int a = 15;
		System.out.println(a);//
		System.out.println(~a);//
		//a 15	: 00000000	00000000	00000000	00001111
		//~a	: 11111111	11111111	11111111	11110000
	}

}
