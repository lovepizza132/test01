package h_inherit5;

/*
 * 	this : 자신 객체를 지칭하는 레퍼런스
 *  super : 부모 객체를 지칭하는 레퍼런스
 *  ------------------------------
 *  this() : 다른 생성자함수를 호출할 때 사용
 *  super() : 부모 생성자 함수를 호출할 때 사용
 */
public class Book extends Item{

	String author, publisher;

	public Book() {
		System.out.println("Book 기본 생성자");
	}
	
	public Book(String num, String title, String author, String publisher) {
		//super.num = num;
		//super.title = title;
		super(num, title);//부모 클래스 생성자 함수 호출
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book 인자 생성자");
	}

	public void output() {//오버라이딩 함-부모클래스와 같은 함수를 사용
		System.out.println(num);
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
	}
}
