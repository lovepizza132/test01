package a_basic_class;

public class Ex01_ObjectEqualsEx//주소를 비교하는 것
{
	public static void main(String[] args)
	{
		 StudentA  a = new StudentA("012345", "송혜교");
		 StudentA  b = new StudentA("012345", "송혜교");
		 //Object의 equals() : ==
		 if( a.equals(b)) {// a == b
			 System.out.println("객체 a와 b는 같다");
		 }else {
			 System.out.println("객체 a와 b는 다르다");
		 }

		 System.out.println( a.toString() );//()에 클래스가 들어가면 자동으로 .toString이 들어가있다.
		 System.out.println( b  );
	}
}

class StudentA extends Object//extends Object도 자동으로 써짐
{
	String  hakbun, name;
	StudentA( String  hakbun, String name)
	{//생성자함수
		this.hakbun = hakbun;
		this.name = name;
	}	
	
	public String toString() {
		return hakbun + "/" + name;
	}

}