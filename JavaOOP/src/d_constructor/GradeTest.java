package d_constructor;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GradeTest {

	public static void main(String[] args) {
		//처리하렿는 데이터의 개수를 표준 입력 받는다.
		System.out.println("점수를 입력해 주세요 ex) 50,100,40,60,70");
		Scanner input = new Scanner(System.in);
		String temp = input.next();
		StringTokenizer st = new StringTokenizer(temp, ",");
		int n = st.countTokens();
		//입력된 데이터 개수 크기의 원소를 갖는 int 타입 배열을 생성한다.
		int [] jumsu = new int[n];//for문안에서 n개 만큼 입력받은 점수값을 저장할 변수 선언
		for(int i=0; st.hasMoreTokens(); i++) {
			jumsu[i] = Integer.parseInt(st.nextToken());
			
		}
		//표준입력으로 데이터를 받아서 첫 번째 원소부터 마지막 원소까지 저장
		GradeExpr ge = new GradeExpr(jumsu);
		//출력
		System.out.println("점수들 : " + temp );
		System.out.println("총점: " + ge.getTotal());
		System.out.println("평균: " + String.format("%.2f", ge.getAverage()));
		System.out.println("최고 점수 : " + ge.getGoodScore());
		System.out.println("최저 점수 : " + ge.getBadscore());
		
		
	}

}
