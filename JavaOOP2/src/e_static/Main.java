package e_static;
/**
 * 
 * 단 하나로 공유: static
 * 
 * 		- 객체 명이 아닌 클래스 명으로 접근 가능
 *
 */
public class Main {

	public static void main(String[] args) {//static이 없으면 객체를 생성해서 불러야함, 있음으로 클래스명으로 불를 수 있음
		
		Book b1 = new Book();//객체 생성
//		Book b2 = new Book();
//		Book b3 = new Book();
		
		System.out.println("총 갯수: " + Book.getCount());//멤버변수가 private일 때 사용, 메소드 static은 class명 접근을 하기위해(0부터 카운트 가능)
//		System.out.println("총 갯수: " + b1.getCount());//인스턴트의 참조변수에 '.'을 찍어 호출 / 멤버변수가 private일 때 사용, 객체를 생성해야만 사용 가능


	}

}

