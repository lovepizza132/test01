package e_method;

public class Ex03_2CallByRef {
	/**
	 *  메소드의 인자가 참조형인 경우
	 *  		-> 주소 복사됨
	 *  		call by reference 
	 */
	
	public static void main(String[] args) {// 참조형은 new를 사용해야한다.
		StringBuffer a = new StringBuffer("안녕");//참조형은 heap 영역에 주소로 데이터 저장 (기본형은 stack 영역에 값으로 데이터 저장)
		StringBuffer b = new StringBuffer("하이");
		add(a, b);//static void add(StringBuffer a, StringBuffer b) 반환된 값은 없지만 주소 값이 변함 a = 안녕하이, b = 하이
		System.out.println("A= " + a + ", B= " + b);//static void add(StringBuffer a, StringBuffer b)에서 주소값이 변했기 때문에->a = 안녕하이, b = 하이
		
	}
	
	static void add(StringBuffer a, StringBuffer b) {//(기본형)값이 아니라 (참조형)주소값을 가져옴
		//a += b;// 산수연산자는 기본형만 사용가능 -> 하지만 참조형이라 변수.append(); 사용
		a.append(b);// 주소값을 변경시킴-> a = 안녕하이, b = 하이
		System.out.println("A= " + a + ", B= " + b);// a = 안녕하이, b = 하이
		
	}

}

