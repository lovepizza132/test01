package c_control;

public class Ex04_for중첩 {

	public static void main(String[] args) {
		// *****
//				for( int i=0; i<5; i++) {
//					System.out.print("*");
//				}
//===============================================================
		//*****
		// ****
		//  ***
		//   **
		//    *
//		for(int j=0; j<5; j++) {	//줄의 갯수
//			for(int i=0; i<j; i++) {	//공백의 갯수
//				System.out.print(" ");
//			}
//			for(int i=0; i<5-j; i++) {	//*의 갯수
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//===============================================================	
//		//A~Z 한줄에 출력
//		for(int i=0; i<26; i++) {
//			for( char ch='A'; ch<='A'+i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//=================================================================
//		//문제 1
//		for( int i=0; i<26; i++ ) {
//			for( char ch='A'; ch<='A'+i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//================================================================
//		//문제 2
//		for( int i=0; i<26; i++ ) {
//			for( char ch='A'; ch<='Z'-i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//================================================================
//		//문제 3
//		for( int i=0; i<26; i++ ) {
//			for( char ch=(char)('A'+i); ch<='Z'; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//================================================================
		//문제 4
		for( int i=0; i<26; i++ ) {
			for( char ch='Z'; ch>='Z'-i; ch--) {
				System.out.print(ch);
			}
			System.out.println();
		}
//================================================================
//		//문제 5
//		for( int i=0; i<26; i++ ) {
//			for( int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for( char ch=(char)('A'+i); ch<='Z'; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//================================================================
//		for(int i=0; i<26; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(char ch=(char)('A'+i); ch<='Z'; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
//================================================================	
	}
}
