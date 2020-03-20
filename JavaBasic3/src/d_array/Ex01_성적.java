package d_array;

public class Ex01_성적 {

	public static void main(String[] args) {
//		//int [] kor;
//		//kor = new int[5]; stack에 주소를 저장 주소지인 heap에 데이터 저장 + heap에서는 데이터가 초기화 가능
//		int [] kor = new int[5]; //객체 생성과 동시에 변수 선언 
//		kor[0] = 90;
//		kor[1] = 88;
//		kor[2] = 89;
//		kor[3] = 70;
//		kor[4] = 77;
//		//kor[5] = 99; 0~4로 5개인데 kor[5]까지 가면 6개로 오류발생
//		
//		//배열 초기화
		int []kor = new int[]{90, 88, 89, 70, 77}; // == int []kor = {90, 80, 89, 70, 77};
		
		double avg=0;
		int total=0;
		for(int i=0; i<kor.length; i++) {
			System.out.println(kor[i]);	
			total += kor[i];
		}
		avg = (double)total / kor.length;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg );
//====================================================================================================
		
//		int [] score = new int [] {80, 90, 100};
//		int total = 0;
//		double avg = 0;
//		for( int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//			total += score[i]; // == total = score[0] + score[1] + score[2]; 
//		
//		}
//		avg = (double)total / score.length;
//		System.out.println("합계: " + total);
//		System.out.println("평균: " + avg);
		
	}
}
