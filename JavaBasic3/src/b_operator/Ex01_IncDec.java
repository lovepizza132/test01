package b_operator;

/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5; //정수형 변수 a에 값 5를 초기화
		int b = 7;
		
		
//		// [1]
//		System.out.println("a= " + a + " , b= " + b);
//		System.out.println("a= " + a+1 + " , b= " + b+1); // a = 51, b = 71
//		System.out.println("a= " + (a+1) + " , b= " + (b+1)); // a = 6, b = 7
				
		
//		// [2]
//		a++; //a = a + 1; -> a에 있는 거에 +1해서 a에 다시 저장해주세요
//		b--; //b = b - 1; -> b에 있는 거에 -1해서 b에 다시 저장해주세요
//		System.out.println("a=" + a + ", b=" + b);
//
//		++a;
//		--b;
//		System.out.println("a=" + a + ", b=" + b);
	
		
	
		
		// [3] 증가감소 연산자는 위치가 매우매우 중요!
		int result = ++a;//++연산자가 앞에있는 경우 기존 변수 a의 값을 증가 시키고 뒤에 대입
		System.out.println("결과: " + result);// a = 6
		
		int result2 = b--;//--연산자가 뒤에있는 경우 기존 변수 b의 값을 먼저 대입하고 감소시킴
		System.out.println("결과: " + result2);// b = 7
		System.out.println("결과: " + b);// b = 6
		
		// [4]
		System.out.println("a=" + ++a + ", b=" + --b);//a=6, b=6
		System.out.println("a=" + a++ + ", b=" + b--);//a=6, b=6
		System.out.println("a=" + a + ", b=" + b);//a=7, b=5
		
		

	}

}
