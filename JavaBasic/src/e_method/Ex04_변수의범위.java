package e_method;

public class Ex04_변수의범위 {

	// 멤버변수(class 소속이라 모든 함수에 적용)heap에 잡힘 - 0으로 자동초기화가 됨 + 변수를 밖에 써놓으면 굉장히 위험, 이유: 수 많은 코드들 중 적용되는 변수를 개발자가 파악하기 어려움
	static int a, b;//메인 함수 밖에 변수 선언하여 전체 함수에 적용 + 자바의 메인함수는 static이기에 적용
	static int sum;
	
	public static void main(String[] args) {//메소드 안에 있는 변수 지역변수: 메모리가 stack에 잡힘
//		// 데이터 입력
//		a = 10;
//		//int a = 10; //지역변수   우선순위: 지역변수 > 멤버변수 이 경우 새로 int a = 10;을 새로 만듬(지역변수)
//		b = 20; //지역변수
//		add();
//		System.out.println("합: " + sum);
//	}
//
//	static void add() {//받는 인자도 없음
//		sum = a + b; //지역변수
		int min = 0;
		int	jumsu[] = {1,2,3,4,5};
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i]<jumsu[i+1]) {
				min=jumsu[i];
			}
			System.out.println(min);
		}
		//return min;
	}

}

