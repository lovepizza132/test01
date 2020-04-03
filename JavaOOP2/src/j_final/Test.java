package j_final;

private class Parent{//부모클래스가 될 수 없다
	 final String field = "부모님꺼";
	final public void jib (){
	  System.out.println("부모님이 만드신거");
	 }
	} 
class Child extends Parent{//class에 final이 붙어 상속관계 불가
	
	Child(){
		//super.field = "내꺼";//final이 붙으면 수정 불가
	}
//	public void jib (){//final로 오버라이딩 못함
//		System.out.println("물려받아서 탕진함");
//	}
}

public class Test {
	 public static void main(String[] args) {
		 Child p = new Child();
		  System.out.println(p.field);
		  p.jib();
	 }
	}
