package e_static;

/**
 * 
 * 단 하나로 공유: static
 * 
 * 		- 객체 명이 아닌 클래스 명이 접근 가능
 *
 */
public class Book {
	private static int count;//멤버변수에 static은 공유하고 싶어서 private 지정(값을 쉽게 바꾸지 못하도록) 하지만 이 class에서만 사용 가능함으로 메소드를 생성

	public Book(){//생성자 함수
		count++;
		System.out.println("책 한개 생성");
	}
	
	public static int getCount() {//메소드 static은 class명 접근을 하기위해(0부터 카운트 가능)
		return count;
	}
	
}
