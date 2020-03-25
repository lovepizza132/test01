package e_method;

public class Ex02_인자와반환2 {

//	public static void main(String[] args) {
//		// 데이터 입력
//		int a = 10, b =20;//여기서 만들어진 변수는 여기서만 사용가능 따라서 데이터를 보내줘야 함(인자)
//		add(a, b);//인자, 인수 - 넘어가는 데이터를 표기
//	}
//	
//	static void add(int a, int b) {//넘어오는 데이터를 명확하게 표기
//		// 입력받은 데이터의 합을 구해서 출력
//		int sum = a + b;
//		System.out.println("합: " + sum);
//	}
//=========================================================================================
	public static void main(String[] args) {
		
		int sum = add();//30번 line에서 리턴한 값을 저장할 변수를 꼭 설정해줘야한다. ex) int sum - 반환받은 리턴값과 똑같은 형태의 변수로 설정
		// 출력
		System.out.println("출력: " + sum);
		
		}
	
	static int add() {//void의 뜻은 리턴하는 아무런 값이 없다는 뜻. 따라서, 반환하는 변수의 형태에 맞춰 줄 것 ex) void add()-> int add(), double add() 등으로
		// 데이터 입력
		int a=10, b=20;
		// 계산
		int sum = a + b;//19번 라인의 변수 sum과는 다른 변수이다. 이유: 아래 add()메소드에서 생성된 변수는 여기서만 사용 되기때문
		return sum;		//단 하나의 변수만 보낼 수 있음 19라인의 add();로 리턴함
	}

}
/*
 *	return : 프로그램 흐름을 반환시킴 + 제어권 반환
 *			 단 하나의 변수를 반환할 수 있다.
 */
