package e_method;

public class Ex03_3CallByString {
	
	
	public static void main(String[] args) {// 참조형은 new를 사용해야한다.
		String a = new String("안녕");//참조형은 heap 영역에 주소로 데이터 저장 (기본형은 stack 영역에 값으로 데이터 저장)
		String b = new String("하이");
		add(a, b);//static void add(String a, String b)에서 반환한 값은 없다. heap에는 a = "안녕", b = "하이", a+b= "안녕하이"가 있다.
		System.out.println("A= " + a + ", B= " + b);//안녕, 하이
		
	}
	
	static void add(String a, String b) {
		a += b;// heap영역에 a+b의 새로운 데이터를 저장함 즉, heap에는 a = "안녕", b = "하이", a+b= "안녕하이" 총 3개가 생김 
		System.out.println("A= " + a + ", B= " + b);//안녕하이, 하이
		
		
		
	}

}