package e_static_sample;

public class 클래스정의 {
	int 멤버변수;
	static int static변수;
	
	public static void main(String[] args) {
		int 지역변수;
		
		멤버변수 = 10;
		static변수 = 20;

	}
	// static 메소드는 일반 멤버변수를 접근할 수 없음 즉, static메소드는 static만 접근할 수 있다.
}
//========================================
/*
 * 	클래스 a = new 클래스();
 * 	클래스 b = new 클래스();
 */
