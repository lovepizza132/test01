package h_inherit;
/*
 * 		overloading: 동일한 함수명으로 인자의 자료형과 갯수가 다른함수들
 * 		overridng: 상속관계에서 인자와 반환값까지 완전히 동일한 함수
 */
 
public class Test {

	public static void main(String[] args) {
//		Umma u = new Umma();
//		u.gene();
//		u.job();
//		
//		Ddal d = new Ddal();
//		d.gene();
//		d.study();
		
//		//* 엄마 클래스에 있는 job()메소드를 상속받음
//		d.job();

//		// 2. 부모변수에 자식 객체 생성
//		Umma dal = new Ddal();
//		//dal.study(); 변수가 엄마클래스이기에 안됨
//		dal.job();// 엄마 클래스 안에 있어 호출 가능
//		//*
//		dal.gene();//엄마 클래스를 지나 딸 클래스에 있는 지니도 호출할 수 있음 -> 오버라이딩(상속관계에서 인자와 반환값까지 완전히 동일한 함수)
		
		// 3. 객체임을 확인
		Ddal d = new Ddal();//Ddal은 Umma객체까지 
		if( d instanceof Ddal) {//클래스와 객체간의 관계를 물어보고 싶을때 사용
			System.out.println("딸 객체");
		}
		
		if( d instanceof Umma) {
			System.out.println("부모 객체");
		}
		
		// 4. 형변환
		//	(casting) : 기본형 / 상속관계의 클래스는 된다.
		//String a = new String("Hello");
		
		
		
		
//		Umma a = new Umma();
//		Ddal b = (Ddal)a;//a는 엄마만 메모리를 지님, 그러나 b는 엄마+딸이므로 딸 메모리는 저장을 안한 상태 컴파일 오류 x 에러는 뜬다.
		
//		Ddal c = new Ddal();
//		Umma d = (Umma)c; // up-casting -> 부모변수로 상변환
//		Ddal e = (Ddal)d; // down-casting -> 자식변수로 상변환
	}

}
