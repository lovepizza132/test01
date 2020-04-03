package a_basic;

public class Main {

	public static void main(String[] args) {
		
		// 변수 선언
		// Student s;
		// 객체 생성(메모리에 확보)
		Student s = new Student();// Student-class명, s-객체명(변수명) 에 객체를 생성하고 담음/ instance = object 객체
		s.kor = 70;//instance 안에 있는 걸 멤버라고 하며, '.'을 찍어 불러옴
		s.eng = 88;
		s.math = 99;
		System.out.println("총점: " + s.calTotal());// 클래스 안에 멤버에 접근하려면 s 변수명에 '.'을 붙여 멤버를 지정하여 사용
		//s.total = 100;//private을 설정했기때문
		System.out.println("평균: " + s.calAvg());//ctrl 누르고 클릭
	}

}
