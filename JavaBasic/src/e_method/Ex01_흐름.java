package e_method;

public class Ex01_흐름 {

//	public static void main(String[] args) {// 자바를 실행하는 것은 "Java Virtual Machine"이 main함수를 실행시킴 
//											// 실행순서: 5line 실행>8,9line 진행>14,15,16line진행>다시 9line진행>10,11line 진행
//											// 자바의 main 함수가 static이기 때문에 모든 함수는 static이어야 한다.(static이 아니면 사용불가)
//		System.out.println("main 함수의 시작");
//		method();
//		System.out.println("main 함수의 끝");
//	}
//	
//	static void method () {//함수에 대한 기본구조 형태
//		System.out.println("method 실행");
//	}
//==============위에 것이랑 같은 결과, 이유: main부터 실행되기 때문에==============
		static void method () {
			System.out.println("method 실행");
	}
		
		public static void main(String[] args) {
		System.out.println("main 함수의 시작");
		method();
		System.out.println("main 함수의 끝");
	}

}
/**
*	명명규칙
*		1. 문자 + 숫자 + _ + $ 조합가능
*		2. 길이 제한 없음
*		3. 첫글자에 숫자만 아니면 됨
*		4. 대소문자 구별
*		5. 예약어(keyword)는 사용 불가
*
*	권장사항
*		- 클래스명의 첫글자는 대문자
*		- 변수(명사형)와 메소드명(동사형)의 첫글자는 소문자
*		- 라벨명은 전부 대문자로
*		- 패키지명은 소문자
*/