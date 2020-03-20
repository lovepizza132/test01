package b_operator;

/**
 *  shift : 모든 비트의 값을 이동하는 연산자 -> 하드웨어 컨트롤을 할 때 사용함
 *  
 *  [예] 0000 0010	<<1 		0000 0100
 *  	  0000 0010	>>1		0000 0001
 */
public class Ex04_Shift {

	public static void main(String[] args) {

		int su = -4;
		System.out.println(su);//4
		System.out.println(su << 2);// -16  10000000 00000100  -> 00000000 00010000
		System.out.println(su >> 2);// -1   10000000 00000100  -> 00000000 00000001
		
		System.out.println(su >>> 1);//부호비트에 0으로 채움
		
	}

}
