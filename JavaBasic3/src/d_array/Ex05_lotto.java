package d_array;

public class Ex05_lotto {

	public static void main(String[] args) {
		// 값대입=> ## 동일 숫자 배제
		int []lotto = new int [6];
		for(int j=0; j<6; j++) {
			lotto[j] = (int)(Math.random()*45)+1;//45개의 랜덤의 숫자에 0부터 시작함으로 1을 더해 1부터 45까지의수로 변수lotto에 값을 저장
			//lotto[0] = 값;
			//lotto[1] = 값;
			//lotto[2] = 값;
			//lotto[3] = 값;
			//lotto[4] = 값;
			//lotto[5] = 값;
			
		}//버블정렬
		for(int i=lotto.length-1; i>0; i--) {
			for( int k=0; k<i; k++) {
				if(lotto[k]>lotto[k+1]) {//k열의 값 > k+1열의 값이면 k열의 값을 swap을 통해 k+1로 초기화 즉, 앞열 과 뒤열의 수를 비교해 앞열이 크면 뒷열로 이동시켜 제일 끝으로 이동
					int temp = 0;//swap을 통해 큰값을 뒷열로 보냄
					temp = lotto[k];
					lotto[k] = lotto[k+1];
					lotto[k+1] = temp;
				}
				else if(lotto[k]==lotto[k+1]) {//중복값: 앞열과 뒷열의 값이 같을 경우에는 lotto[k]값 초기화
					lotto[k]=(int)(Math.random()*45)+1;
					k--;//다시 원래대로 진행
				}
				
//		========중복값을 제거하는 다른 방법===========================================
//				for( int j=0; j<k; j++) {
//					if(lotto[j]==lotto[k]) { 
//						lotto[k]=(int)(Math.random()*45)+1;
//						j--;
//					}
//			}//end for=j
//		=======================================================================		
			}//end for-k
		}//end for-i
		
		for(int j=0; j<6; j++) {
			System.out.print(lotto[j] + "/");
		}

	}

}
