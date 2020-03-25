package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_도전문제 {
	static int hubo;
	public static void main(String[] args) {
		int[] votes = input();
		String win = solution(votes);
		System.out.println(win);
	}
	static int[] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("후보의 수 입력");
		hubo = sc.nextInt();
		sc.nextLine();
		int [] votes ;
		System.out.println("투표 결과 입력 ex) 1 4 5 4 2");
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		votes = new int[st.countTokens()];// 14542 순으로 쌓여있다. 2를 꺼내서 vote[0]에 4를 꺼내서 vote[4]에 넣는다.
		for (int i = 0; st.hasMoreTokens(); i++) {
			int vote = Integer.parseInt(st.nextToken());
			if(vote>=1&vote<=hubo) {
				votes[i] = vote;
			}else i--;//만약 조건에 벗어나면 토큰은 버려지고 votes[i]의 메모리방에 값을 저장 못하고 다음 votes[i+1]로 넘어가기 때문에 i--;를 적어준다.
		}
		return votes;


	}
	static String solution(int[] votes) {
		int[] huboVote = new int[hubo];// int []hubovote의 배열은 변수의 hubo의 값만큼의 크기를 지님
		LOOP1 : for (int i = 0; i < votes.length; i++) {
			for (int j = 0; j < huboVote.length; j++) {
				if(votes[i]==(j+1)) {
					huboVote[j]+=1;
					continue LOOP1;
				}
			}
		}
		String huboNum = "";
		int max = 0,maxHubo = 0;
		for (int i = 0; i < huboVote.length; i++) {
			if(huboVote[i]>max) {
				max = huboVote[i];
				maxHubo = i;
			}
		}
		boolean first = false;
		for (int i = 0; i < huboVote.length; i++) {
			if(first) {
				if(huboVote[i] == max) huboNum += (","+ (i+1));}
			else {
				if (huboVote[i] == max) {
					huboNum += ((i+1));
					first = true;
				}
			}
		}
		return huboNum ;
	}
}
//import java.util.*;
//
//public class Ex06_도전문제 {
//
//	public static void main(String[] args) {
//		input();
//		//output();
//	}
//
//	static void input() {
//		System.out.println("후보자 수 n을 입력하시오 (후보수 1 ~ 10명)");
//		Scanner input  = new Scanner(System.in);
//		int N = input.nextInt();
//		input.nextLine();
//
//		int votes [] = new int [] {};
//		System.out.println("투표결과를 입력하시오");
//		String temp = input.nextLine();
//		StringTokenizer st = new StringTokenizer(temp, ",");
//		votes = new int[st.countTokens()];
//		for(int i=0; st.hasMoreTokens(); i++) {
//			votes[i] = Integer.parseInt(st.nextToken());
//			//System.out.println(votes[i]);
//		}
//		solution(N, votes);
//	}
//
//	static void solution(int N, int votes[]) {
//		int hubo [] = new int [votes.length];
//		int pyosu []= new int [];
//		for(int i=0; i<votes.length; i++) {
//			for(int j=1; j<N; j++) {
//				if(result [i]==j) {
//					num++;
//				}
//			}
//		}
//		System.out.println(num);
//}
//}