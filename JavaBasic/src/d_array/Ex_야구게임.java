package d_array;

import java.util.*;
import java.util.StringTokenizer;


public class Ex_야구게임 {

	public static void main(String[] args) {
		
		int [] baseball = new int [3];
		int [] answer = new int [3];

		//베이스볼 랜덤수 지정
		for(int i=0; i<baseball.length; i++) {
			baseball[i] = (int)(Math.random()*10);
			boolean jungbok = false;
			for(int j=0; j<i; j++) {
				if(baseball[j]==baseball[i]) {
					jungbok = true;
					i--;
				}
			}
			if(jungbok) {
				System.out.println();
			}
			else System.out.print(baseball[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int []baseball = new int[3]; // 변수 baseball 선언 및 배열
//		int []answer = new int[3];
//
//		//1. 임의의 수 3개를 baseball에 저장
//		//1-1. 중복수 배제
//		for(int i=0; i<3; i++) { //임의의 수 0번재,1번째,2번째 총 3개를 출력하기 위해 0, 1, 2까지 반복
//			baseball[i] = (int)(Math.random()*10);//0<=math.random()<1 사이의 랜덤의 수에 10을 곱해 정수로만들어주고 이 값을 변수 baseball[i]에 저장 ex) baseball[0] = 0,baseball[1] = 4, baseball[7] = 8 
//			boolean jungbok = false;// 불린변수 false값으로 초기화 나중에 반복되는 숫자가 저장 후 다시 출력되어 두번연속 출력됨 ex 7712 이 현상을 제거하기 위해 변수 지정
//			for(int j=0; j<i; j++) {//반복문을 활용해 중복값 없애기, j<i이기 때문에 j는 항상 i보다 앞에 있는 수이다. 그런 j와 i를 비교하여 같다면 다시 baseball[i]을 저장하도록 반복
//				if(baseball[j]==baseball[i]) {// 중복값이라면 i-- 실행 이로인해 for-i로 돌아갔을때 다시 원래수로 돌아가 다시 실행
//					jungbok = true;//중복값일 때 true로 지정 나중에 이를 이용해 중복값들이 2번 출력되는 것을 제거하여 1번만 출력되게 함
//					i--;//값이 true이기때문에 다시 반복문for-i로 돌아간다 그 때, -1이 되고 +1이 되면서 다시 원래 수로 진행
//				}
//
//			}//end for-j
//			if(jungbok)System.out.print(" ");
//			else System.out.print(baseball[i]);//변수 출력
//		}//end for-i
//
//		//2. 사용자 입력값 받기
//		for(int t=0; t<3; t++) {//입력값을 3번까지만 받기 위해서 반복문for에서 범위를 0~2까지 3번만 반복하도록 클래스
//
//			System.out.println("숫자를 입력해주세요 ex. 1/2/3");
//			Scanner input = new Scanner(System.in);//입력값의 가상통로 형성
//			String line = input.nextLine();//입력받은 값을 line변수에 저장
//			StringTokenizer st = new StringTokenizer(line, "/");// line변수의 값을 StringTokenizer "/"기준으로 나눠 변수 st에 저장 
//			for(int j=0; st.hasMoreTokens(); j++) {//hasMoreTokens->리턴할 다음 token값이 있으면 true 없으면 false 즉, 0부터 토큰의 갯수인 3개까지 +1진행
//				String token = st.nextToken();//변수 st의 값에서 토큰으로 분리된 문자열 값을 변수 token에 저장
//				answer[j] = Integer.parseInt(token);//문자형 token 값을 정수형으로 전환 후 answer[j]에 저장
//				//answer[j] = Integer.parseInt(st.nextToken); 위 2줄과 같은 의미
//
//
//
//			}
//			//3. 값비교
//			int strike = 0; // 변수 strike 선언 및 초기화
//			int ball = 0; // 변수 ball 선언 및 초기화
//			OUT://break라벨
//				for(int i=0; i<3; i++) {//임의의 수 3개의 값과 위치를  입력값 3개의 값과 위치를 각각 전부 비교하고자 반복문 for 사용 
//					for(int j=0; j<3; j++) { 
//						if(baseball[i] == answer[j]) {//출력값과 입력값이 같을경우
//							if(i==j) {//게다가  자리까지 같을 경우
//								strike++; // 스트라이크이며, 스트라이크++(개수를 파악하기 위해)
//								if(strike==3)break OUT;//그러다 스트라이크가 3개가 되면
//							}else {
//								ball++;//출력값과 입력값만 같은경우, 위치는 다른경우
//							}//end else
//						}//end if
//					}//end for-j
//				}//end for-i
//			System.out.println("strike: " + strike);//스트라이크 개수 출력
//			System.out.println("ball: " + ball);//볼 개수 출력
//		}//end for-t

	}

}
