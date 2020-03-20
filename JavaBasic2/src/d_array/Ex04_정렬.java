package d_array;

public class Ex04_정렬 {

	public static void main(String[] args) {
		
		int []score = {88,99,88,24,53};
		
		for(int i=score.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(score[j] > score[j+1]) {//j가 j+1보다 크다면 두 수를 바꾼다.
					//swapping 진행
				//	int temp = 0;
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;				
				}
			}
		}
	for(int a = 0; a < score.length; a++) {
		System.out.print(score[a] + "/");
	}
	//변수들을 순서대로 배치하자
//		int [] score = new int [] {50, 30, 40, 20, 10};
//		for(int i=score.length-1; i>0; i--){
//			
//		}
//		
	
	
	}

}
