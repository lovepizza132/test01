package c_array;

import java.util.Scanner;

public class Main {

	/**
	 * 			배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력할 학생 수? ");

		Student [] s = new Student[in.nextInt()];		//배열을 위한 객체생성 학생 수 3은 배열의 갯수를 의미한다.

		for(int i=0; i<s.length; i++) {
			s[i] = new Student();//클래스를 위한 객체 생성
		}

		//학생의 이름과 국영수 점수를 입력받아 이름과 총점, 평균 출력
		//String name = in.next();
		//s[0].setName(name);
		for(int j=0; j<s.length; j++) {
			System.out.print((j+1) + "번 학생 정보를 입력하세요 ");
			String name = in.next();
			int kor = in.nextInt();
			int eng = in.nextInt();
			int math = in.nextInt();
			
			
			s[j].setName(name);
			s[j].setKor(kor);
			s[j].setEng(eng);
			s[j].setMath(math);
//			System.out.println((j+1) + "번째 학생: " + s[j].getName() + " 총점: " + s[j].calTotal() + " 평균: " +  s[j].calAverage() );
//			System.out.println();
		}
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<i; j++) {
				Student temp;
				if(s[i].calTotal()>s[j].calTotal()) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
			}
				
			}
		}
		for(int k=0; k<s.length; k++) {
			System.out.println((k+1) + "번째 학생: " + s[k].getName() + " 총점: " + s[k].calTotal() + " 평균: " + s[k].calAverage() );
			
		}
	}
}
