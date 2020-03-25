package e_method;

/*
 * 	오버로딩( overloading )
 * 		- 인자의 자료형과 갯수가 다른 동일한 함수들
 * 		- 리턴형만 다른것은 '오버로딩'이 아닙니다. 반드시 '인자형'과 '개수'가 달라야합니다!
 */
public class Ex07_overloading {

	public static void main(String[] args) {
		// 각각의 자료형 변수의 값에 "화이팅!!" 더하여 출력
		String str = new String("홍길순");
		StringBuffer sb = new StringBuffer("홍길자");
		char [] ch = new char[] {'홍','길','이'};
		fighting(str);//인자의 자료형이 모두 달라 함수명이 같다한들 뒤에있는 자료형으로 분류하여 호출됨 : 오버로딩
		fighting(sb);
		fighting(ch);
		
	}
	
	static void fighting(char ch []) {
		String st = new String();//String은 "홍", "홍길", "홍길이" 3개가 저장 되어  불필요한 쓰레기가 생김 따라서 StringBuffer를 이용하는게 좋을것
		for(int i=0; i<ch.length; i++) {
			st += ch[i];
		}
		System.out.println(st + "화이팅!!");
	}
	static void fighting(StringBuffer s) {
		System.out.println(s.append("화이팅!!"));// StringBuffer는 원래 
	}
	static void fighting(String str) {
		System.out.println(str + "화이팅!!");
	}
	

}
