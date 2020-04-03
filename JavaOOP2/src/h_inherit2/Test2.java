package h_inherit2;

import java.awt.*;


/* is-a : MyFrame2 is a Frame */
class MyFrame2 extends Frame{//부모가 하나밖에 안됨
	
	MyFrame2(){//생성자
		//내가 아무것도 기술하지 않으면 부보의 모든 생성자 함수를 잡아줌
		super("나의 두번째 화면");//우리가 지정하지 않아도 생성자 함수가 들어가짐
		setSize(500, 300);
		setVisible(true);
	}
}

public class Test2 {
	public static void main(String[] args) {
		new MyFrame2();

	}

}
