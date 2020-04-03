
public class Main {
	int var;
	public static void main(String[] args) {
		
		String name = "홍길자";
		int age = 24;
		double height = 190.99;
		
		method(name, age, height);

	}
	static void method(String name, int age, double height) {
		//출력
		//System.out.println("이름: " + name + " " + age + "살 " + height + "cm");
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
