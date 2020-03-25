package e_method;

public class Ex02_인자와반환 {

	public static void main(String[] args) {
		// 데이터 입력
		int a = 10, b =20;//여기서 만들어진 변수는 여기서만 사용가능 따라서 데이터를 보내줘야 함(인자)
		add(a, b);//인자, 인수 - 넘어가는 데이터를 표기
	}
	
	static void add(int x, int y) {// 넘어오는 데이터를 명확하게 표기 그 이유는  넘어오는 데이터는 8번 라인의 입력 순서이기에 변수명은 따지지 않아 헷갈릴 수 있다. 
		// 입력받은 데이터의 합을 구해서 출력
		int sum = x + y;
		System.out.println("합: " + sum);
	}
	

}
