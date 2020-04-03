package h_inherit2;

/* has-a : MyFrame1 has a Frame*/

import java.awt.*;


class MyFrame1{
	Frame f;//멤버변수 설정 클래스안 모든 메소드에 적용하기 위해
	
	MyFrame1(){//생성자 함수
		f = new Frame("나의 첫 화면");//창이름  + 객체를 생성(구현에 필요한 여러 설정과 기능을 위해 변수와 메소드가 필요하고 이를 담기위한 class가 필요)
		f.setSize(500, 300);//사이즈 픽셀
		f.setVisible(true);//화면에 띄을래?
		
	}
	
}

public class Test {
	public static void main(String[] args) {
		new MyFrame1();//사용할 일이 없으면 변수 안써도 됨
		
	}
	
}