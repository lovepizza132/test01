package f_innerclass;

class Outer
{
	class Inner//Outer 입장에서 Inner 클래스는 멤버변수 취급 따라서 원래 class앞에는 static을 못 쓰지만 사용 가능
	//static class Inner//Outer 입장에서 Inner 클래스는 멤버변수 취급 따라서 원래 class앞에는 static을 못 쓰지만 사용 가능
	{
		void naJabara(){
			//static void naJabara(){//22번 라인 가능
			System.out.println("잡아보슈~~");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();//Outer 안에 
		//Outer.Inner in = new Outer.Inner();//static을 했기 때문에 Outer 객체를 생성안해도 가능
		in.naJabara();
		//Outer.Inner.naJabara();
	}
}


