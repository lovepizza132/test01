package h_inherit5;

public abstract class Item {//클래스 안에 단 한개의 추상 메소드가 있다면 클래스도 abstract를 붙여줘야한다.

	protected String num, title;

	public Item() {
		System.out.println("Item 기본 생성자");
	}
	
	public Item(String num, String title) {
		this.num = num;
		this.title = title;
		System.out.println("Item 인자 생성자");
	}
	//private < default < protected < public
	public abstract void output();//강제로 오버라이딩을 하기 위해 사용 / abstract 메소드는 반드시 오버라이딩으로 메소드를 완성해줘야한다.
	
//	public void output() {//다형성을 써서 오버라이딩할 것(기존방법)
//		System.out.println(num);
//		System.out.println(title);
//	}
}




