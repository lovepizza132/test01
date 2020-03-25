package afterclass;

import java.util.*;

public class Re0316 {

	public static void main(String[] args) {
		//스위치문에는 무조건 break; 넣기
		int i =1, j=0;
		switch ( i ) {
		case 2 : j += 6; break;// j = j + 6
		case 4 : j += 1; break;
		default : j += 2;  // i = 0 이기때문에 default 값으로 바로 리턴, 그 후 break;가 없어서 case0까지 진행 따라서 답 6
		case 0 : j += 4; break;
		}
		System.out.println( j );
	}
}
