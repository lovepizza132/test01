package e_method;

public class Ex01_흐름2 {

//	static void method () {
//		System.out.println("method 실행");
//	}
//	public static void main(String[] args) {
//		System.out.println("main 함수의 시작");
//		Ex01_흐름2 ex = new Ex01_흐름2();//내가 만든 클래스를 메모리에 저장 - 객체를 생성해서 호출 or 17번 라인에 static을 넣기
//		method();//
//		System.out.println("main 함수의 끝");
//	}
//==========위에 것과 같은 결과, 위에는 static을 사용, 아래는 객체를 생성해서 호출============
		void method () {
			System.out.println("method 실행");
	}
		public static void main(String[] args) {
		System.out.println("main 함수의 시작");
		Ex01_흐름2 ex = new Ex01_흐름2();//내가 만든 클래스를 메모리에 저장 - 객체를 생성해서 호출 or 17번 라인에 static을 넣기
		ex.method();//
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