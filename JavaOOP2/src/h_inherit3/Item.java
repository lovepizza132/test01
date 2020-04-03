package h_inherit3;

public class Item {

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
	public void output() {
		System.out.println(num);
		System.out.println(title);
	}
}




