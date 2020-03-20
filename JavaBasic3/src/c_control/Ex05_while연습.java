package c_control;

public class Ex05_while연습 {

	public static void main(String[] args) {
		// 3 6 9 게임 만들기
//		for(int i=1; i<=40; i++) {
//			int su = i;
//			boolean su369 = false;
//			
//			while(su !=0 ) {
//			int na = su%10;
//			if(na==3 || na==6 || na==9) {
//				System.out.print("짝");
//				su369 = true;
//			}
//			su /= 10;
//			}
//			if(su369)System.out.println(" ");
//			else System.out.print(i + " ");			
//		}	
//=========================================================================		
//		for(int i=1; i<=50; i++) { //i=1부터 50까지 반복
//			int su =i; //i값에 대한 변수 선언
//			boolean su369 = false; //su369에 대한 불린 변수 선언
//			
//			while(su != 0) { //변수 su가 0이 아니라면 반복문 진행
//				int na = su % 10; //수의 1의 자리를 뽑아 3,6,9 조건에 비교하기 위한 수식
//				if(na==3 || na==6 || na==9) { //ex. su값이 13이면 na에는 3값이 저장(13%10==3) 그 후, 3,6,9와 같은지 값 비교후 true면 "짝" 출력  
//					System.out.print("짝");
//					su369 = true; //3,6,9조건에 맞으면 su369가 true됨을 초기화
//				}
//				su /= 10; // su = su / 10; 과 같으며, su를 10으로 나눠 계속 su값의 숫자 십의 자리가 일의 자리로 만들어 줌(반목문 while안에 넣어 큰 수도 1의 자리까지 나머지를 구하도록 하는 함수)
//			}
//				
//			if(su369) System.out.println(); //su369가 true이면 공백을 출력 su369가 true일 경우는 위에 if문에서 (na==3 || na==6 || na==9)인 경우로 "짝"출력 후 3,6,9 출력이 되지 않도록 하기 위함
//			else System.out.println(i); // 3, 6, 9 조건이 안되는 경우에는 (int i=1; i<=50; i++)에 해당되는 숫자를 출력
//		}
//=================================================================================================
		//구글 기업문제
		int su8 = 0;
		for(int i=1; i<=100; i++) {
			int su = i;

			while( su != 0 ) {
				int na = su%10;
				if(na==8) {
					su8 += 1;
				}
				su /= 10;
			}

		}
		System.out.println(su8);

		
		
		
		
		
		
		
		
		
		
		
//		int su8 = 0;
//		for( int i=1; i<=10000; i++) {
//			int su = i;
//			
//			while(su !=0) {
//				int na = su % 10;
//			if(na==8) {
//				su8 += 1;
//			}
//			su /= 10;
//			}
//		}
//		System.out.println(su8);
//		
//		for(int i=1; i<=1000; i++) {
//			int su = i;
//			int num = 0;
//			
//				while(su != 0) {
//				int na = su % 10;
//				if(na==8) {
//					num += 1;
//				}			
//				su /= 10;
//			}
//			
//		}
//		System.out.println(num);	
//
//
	}

}
