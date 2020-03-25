package e_method;

public class Ex02_인자와반환3 {

	public static void main(String[] args) {
		
		int arr [] = add();
		// 데이터를 넘겨받아서 합을 구하고 출력
		//int sum = arr[0] + arr[1];
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		System.out.println(sum);
	}
	static int[] add() {//void 자리에는 리턴하는 데이터의 자료형을 기업->int[]
		// 입력데이터
		int a = 10, b = 20;
		int arr [] = {a, b};//배열: 여러개의 값을 하나로 묶어주는 역할 리턴은 단 하나의 값을 보낼 수 있기에 묶어서 하나로 보내기 위해 배열을 사용
		return arr;//int arr[]의 변수 값을 7번라인으로 반환 
	}

}
/*
 *	return : 프로그램 흐름을 반환시킴 (+ 제어권 반환)
 *			 단 하나의 변수를 반환할 수 있다.
 */
