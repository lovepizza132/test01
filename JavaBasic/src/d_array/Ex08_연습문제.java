package d_array;

public class Ex08_연습문제 {

	public static void main(String[] args) {
			// 문제 : 각 행의 값들의 합이 가장 큰 행을 출력하기
			// int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
			// 결과 : 0행
		
		

//=========================================================================================================
//		int a [][] = new int [] [] {{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
//		int sum[] = new int [a.length];
//		int total = 0;
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//			sum[i] += a[i][j];
//			}
//		}
//		int max = 0;
//		for(int i=0; i<a.length; i++) {
//			if(sum[i]>sum[max]) {
//				max = i;
//			}
//		}
//		System.out.println("결과: " + max + "행");
//===========================================================================================================			
		
		int a [][] = new int [] [] {{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		
		int sum [] = new int [a.length];
		int total = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum[i] += a[i][j];
				
			}//end for j
			//System.out.println(sum[i]);
		}//end for-i
		int max = 0;
		for(int k=0; k<a.length; k++) {
			if(sum[k]>sum[max]) {
				max = k
			}
		}
		System.out.println("결과: " + max + "행");
	}

}
