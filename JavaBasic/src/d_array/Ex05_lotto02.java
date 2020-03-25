package d_array;

public class Ex05_lotto02 {

	public static void main(String[] args) {
		// 값대입=> ## 동일 숫자 배제
				int[][]lotto = new int[5][6];//[][] 앞에거는 줄, 뒤에거는 열
				for(int i=0; i<5; i++) {
					for(int j=0; j<6; j++) {
						lotto[i][j] = (int)(Math.random()*45)+1;
					
						
						
//					//lotto[0] = 값;
//					//lotto[1] = 값;
//					//lotto[2] = 값;
//					//lotto[3] = 값;
//					//lotto[4] = 값;
//					//lotto[5] = 값;
					}
				}
			//======정렬==================================
//				for(int k=lotto.length-1; k>0; k--) {
//					for(int n=lotto[k]-1; n>0; n--) {
//						for(int h=0; h<n; h++) {
//							if(lotto[h]>lotto[h+1]) {
//								
//							}
//						}
//					}
//					  
//				}
			//=========================================
				for(int i=0; i<5; i++) {
					for(int j=0; j<6; j++) {
						System.out.print(lotto[i][j] + "/");
					}
					System.out.println();
				}

	}

}
