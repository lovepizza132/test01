package h_inherit5;

public class Cd extends Item {

	String singer;
	public Cd() {
		System.out.println("Cd 기본생성자");//밑에 생성자가 사용 안됐을 때 기본적으로 출력되는 것
	}
	public Cd(String num, String title, String singer) {
//		
		super.num = num;
		super.title = title;
		//super(num,title);
		this.singer = singer;
		System.out.println("Cd 인자생성자");
	}


	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(singer);
	}
}
