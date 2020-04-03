package i_abstract;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 화면가정 - 여기서 그림을 그린다 가정
		Sharp s = method();
		s.draw();

	}

	static Sharp method(){
		Scanner in = new Scanner(System.in);
		System.out.println("님이 원하는 도형은? 1.사각 2.원 3.삼각");
		int sel = in.nextInt();
		Sharp s = null;
		switch(sel){
		case 1 : s = new Rect(); break;
		case 2 : s = new Circle(); break;
		case 3 : s = new Tri(); break;
		}
		
		
		s.draw();
		return s;
	}
	//		[ 추가 ] 밑변이나 높이 등의 값을 각각 입력 받아 넓이 구하기
}

abstract class Sharp{//부모클래스
	int i = 0;
	int j = 0;
	Scanner input = new Scanner(System.in);
	public Sharp() {}
	public abstract void draw();
}
	
class Rect extends Sharp{
	public void draw() {
		System.out.println("사각형의 높이와 길이를 입력하세요");
		i = input.nextInt();
		j = input.nextInt();
		double size = i*j;
		System.out.println("사각형의 넓이는 " + size + " 입니다.");
	}
}
class Circle  extends Sharp{
	public void draw(){
		System.out.println("원의 반지름을 입력하세요");
		i = input.nextInt();
		double size = (double)i*i;
		System.out.println("원의 넓이는 " + size + " 입니다.");
	
	}
}
class Tri  extends Sharp{
	public void draw(){
		System.out.println("삼각형의 높이와 길이를 입력하세요");
		i = input.nextInt();
		j = input.nextInt();
		double size = (i*j)/2;
		System.out.println("삼각형의 넓이는 " + size + " 입니다.");
	}
} 

