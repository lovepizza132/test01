package b_encapsulation;



public class Main {

	public static void main(String[] args) {
		Student s = new Student();// Student-class명, s-객체명(변수명) 에 객체를 생성하고 담음/ instance = object 객체
//		s.kor = 70;//instance 안에 있는 걸 멤버라고 하며, '.'을 찍어 불러옴
//		s.eng = 88;
//		s.math = 99;
		s.setKor(70);
		s.setEng(88);
		s.setMath(99);
		s.setName("정아인");
		
		System.out.println(s.getKor() + "/" + s.getEng() + "/" + s.getMath());
		System.out.println("총점: " + s.calTotal());// 클래스 안에 멤버에 접근하려면 s 변수명에 '.'을 붙여 멤버를 지정하여 사용
		System.out.println("평균: " + s.calAvg());//ctrl 누르고 클릭
		System.out.println("이름: " + s.getName());//ctrl 누르고 클릭
		
		
	}
	/*
	 * [ 결론내기 ] 캡슐화란??? 
	 */
}
