package c_control;

import java.util.*;


public class Ex01_if_주민번호 {

	public static void main(String[] args) {
//		String result = (gender == '1' | gender == '3' | gender == '9')? "남자" : "여자";
//		System.out.println("귀하의 성별은: " + result);
		
		//주민번호, 학번 등은 문자열이다!
		//gender변수에 값이 1이면 "남자"를 출력
		//그렇지 않고 값이 2이면 "여자"를 출력
		
		String id = "930820-1234567";
		char sung = id.charAt(7);
		// 1이거나 3이거나 9이면 "남자" 출력, 2이거나 4이거나 0이면 "여자"를 출력
		
		if(sung == '1' || sung == '3' || sung == '9') {
			System.out.println("남자");
		}else if( sung == '2' | sung == '4' | sung == '0') {
			System.out.println("여자");
		}
		

		String nai = id.substring(0, 2);//start번째부터 end번째 앞까지
				//nai = "93"
		//문자열을 정수로 변환
		int nai2 = Integer.parseInt(nai);
				//nai2 = 93
		
		
		//위의 성별이 1이거나 2이면 1900, 3이거나 4이면 2000을 더하자.
		//올해 년도구하기
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		int age = 0;
		if(sung == '1' || sung == '2') {
			age = year - (1900 + nai2) + 1;
		}
		else if(sung == '3' || sung == '4') {
			age = year - (2000 + nai2) + 1;	
		}
		else if(sung == '9' || sung == '0')
			age = year - (1800 + nai2) + 1;	
		
		System.out.println("나이" + age );
		
	}

}
