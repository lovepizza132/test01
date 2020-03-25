package e_method;

public class Ex03_1CallByValue {

	/**
	 *  메소드의 인자가 기본형인 경우
	 *  		-> 값만 복사됨
	 *  		call by value
	 */
	public static void main(String[] args) {
		 int a = 10, b = 20;
		 add(a, b);//리턴된 값이 없음
		 System.out.println("A=" + a + ", B=" + b );
	}
	
	static void add( int a, int b) {//12번 라인의 인수 add(a, b); 값을 받아옴 int a = 10;, int b = 20;
		a+= b;
		System.out.println("A=" + a + ", B=" + b );
	}

}
