package b_useful_class;

public class StringStringBuffer {

	public static void main(String[] args) {
		// 0.기본형
		int a = 10; //메모리 확보 후 10을 저장
		a += 5;
		System.out.println(a);
		
		// 1. String : 참조형 문자열이 가끔 변한다면 String 사용
		String s = new String("안녕");
		//String s = "안녕";//자주 써서 기본형인것처럼 사용할 수 있게 특권을 줌
		s = s +  "하세요";
		System.out.println(s);
		
		// 2. StringBuffer: 문자열이 계속 변한다면 무조건 사용
		StringBuffer sb = new StringBuffer("행복한");
		//StringBuffer sb2 = "행복한"; new가 없어서 에러남
		//sb = sb + "목요일";// 에러남 연산이 가능한 것도 String 만의 특권
		sb.append("목요일");
		System.out.println(sb);		
	}

}
