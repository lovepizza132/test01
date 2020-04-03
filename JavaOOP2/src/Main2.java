
public class Main2 {

	public static void main(String[] args) {
	
		
		Person p = method();
		output(p);
		//출력
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println(p.getHeight());
	}
	static void output(Person p) {
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getHeight());
		
	}
	
	static Person method() {
		String name = "홍길자";
		int age = 24;
		double height = 190.99;
		
		Person p = new Person();
		p.setName(name); 
		p.setAge(age);
		p.setHeight(height);
		
		return p;
	}
}

class Person {//비추함 , 잘못된 점이 있을 때 "Person"이라는 파일 명이 없어 오류를 찾기 함들다. public 선언불가, 자바파일은 1개, 클래스파일은 2개
	private String name;
	private int age;
	private double height;
	
	//setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}