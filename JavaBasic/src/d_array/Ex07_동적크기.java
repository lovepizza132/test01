package d_array;

public class Ex07_동적크기 {

	public static void main(String[] args) {
		char star [][] = new char [5][];//행의 메모리 방이 조건에 의해 생성되게 뒤를 비어둠

		//입력
		char ch = '*';
		for(int i=0; i<star.length; i++) {//줄(행)
			star[i] = new char[i+1];//동적크기 배열 메모리 방을 생성 ex) 0번째 줄의 배열에 char변수의 배열 [1]개의 메모리 방을 만들어 준다.
			
			for(int j=0; j<i+1; j++) {//줄(열) j값의 범위를 i+1보다 작게 함으로  i+1-j만큼의 방이 생성ex)1-0=1, 2-0=2
				star [i][j] = ch;
			}//end for-i
		}//end for-j
		
		
		//출력
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}//end for-j
			System.out.println();
		}//end for-i
	
		
	}
}
