 package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		// ShortCircuitLogic : 일반논리에서만 발생하는 개념 -> 여기서 생기는 현상을 잡기위해 '&&'가 아닌 이진논리의 '&'를 사용
		// 하나의 조건으로 전체 조건이 판명되면 나머지 조건을 시행하지 않습니다.
		int a = 3;
		
		// if( 3 & 4 ) -> 이진논리
		// if( 3>1 & 4>1 ) -> 일반논리를 대신
		
		if(a > 3 & ++a > 3) {
			System.out.println("조건만족"); // 출력되지 않는다
		}
		System.out.println("a= " + a); // a = 4
		
		if( a>1 | ++a > 3 ) {
			System.out.println("조건만족2"); //출력 된다
		}
		System.out.println("a = " + a); // a = 5
	
	
	}

}
