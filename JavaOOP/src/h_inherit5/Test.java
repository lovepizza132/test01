package h_inherit5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		Item i = null;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("상품선택(1. Book 2.Dvd 3. Cd");
//		int sel = input.nextInt();
//		switch(sel){
//		// (1) 부모 클래스에 자식 객체 생성(상속관계가 되있어야 한다.)
//		case 1: i = new Book("0001","자바","홍길동","코스모");break;
//		case 2: i = new Dvd("002","킹덤","주지훈","김은희");break;
//		case 3: i = new Cd("00001","아는노래","지코");break;
//		}
//		// (2) overriding
//		i.output();//다형성 코딩은 하나 경우에 따라 
//========================================================================	  
		Item [] Item = method();
		for(int  i=0; i<Item.length; i++) {
			Item[i].output();//
		}
	}

	static Item[] method() {
//		Item z = new Item();//객체 생성 못함 - 추상클래스이기 때문에 이에따라 부모클래스의 역할만 가능
		
		Book b = new Book("001","자바","홍길동","코스모");//객체선언
		Cd c = new Cd("002","아는노래","지코");
		Dvd d = new Dvd("003","킹덤","배두나","김은희");
		
		Item [] i = new Item[3];//위에 3개는 모두 아들클래스 부모클래스로 하나의 배열을 만들어 리턴할 수 있게 조치 (그 후 리턴하면 부모클래스의 메모리만나옴 그렇기에 부모와 아들 클래스에 output()이라는 같은 함수로 오버라이딩을 통해 각 아들클래스의 값을 출력)
		i[0]=b;
		i[1]=c;
		i[2]=d;
		
		
		return i;//1. 리턴의 값은 단 하나 이에따라 배열, 클래스로 묶어서 보내야함
	}
}
