package d_array;

public class Ex06_복습 {

	public static void main(String[] args) {
		//1. 3x4의 char형 배열 ch를 선언하기
		char ch [][] = new char[3][4];
		
		//2. 값 입력
		char eng = 'A';
		for( int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++, eng++) {//abcd를 출력하기 위해서는 변수 eng에 알파벳 값을 저장하고 계속 1씩 증가시켜줘야한다. 그렇게하기위해서 기존 반복문을 활용 eng++을 넣어진행
				ch[i][j] = eng;
			}//end for-j
	
		}//end for-i
		
		//3. 출력
		for( int i=0; i<ch.length; i++) {//행을 만드는 반복문
			for(int j=0; j<ch[i].length; j++) {//열을 만드는 반복문 
				System.out.print(ch[i][j]);
			}//end for-j
		}//end for-i
		
		
		
		
	}

}
