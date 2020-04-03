package h_inherit3;

public class Dvd extends Item{


	String actor, director;

	public Dvd(){
		System.out.println("Dvd 기본 생성자");
	}
	
	public Dvd(String num, String title, String actor, String director){
		super.num = num;//부모것을 지칭할때는 super사용
		super.title = title;
		this.actor = actor;//내것은 this 사용
		this.director = director;
		System.out.println("Dvd 인자 생성자");
	}
	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(actor);
		System.out.println(director);
	}
}
