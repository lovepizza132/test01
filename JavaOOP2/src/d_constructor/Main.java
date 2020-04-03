package d_constructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		// 입력받은 데이타로 Student 클래스의 멤버 변수에 초기화한다면?
		Scanner in = new Scanner(System.in);
		System.out.println("이름->");
		String name = in.next();
		System.out.println("국어점수->");
		int k = in.nextInt();
		System.out.println("영어점수->");
		int e = in.nextInt();
		System.out.println("수학점수->");
		int m = in.nextInt();
		
		Student stu = new Student();
		//Student stu = new Student(name, k, e, m);// ()안에 인자를 넣지않으면 Student안에 있는 생성자 함수로 인해 클래스가 초기화 됨
		System.out.println(stu.getName());
		System.out.println("총점: " + stu.calTotal());
		System.out.println("평균: " + stu.calAverage());

	}

}
