package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);//generics 사용
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		for(String data : list) {//data 타입과 generics가 사용되어야만 가능 / 형변환이 생략되어 프로그램이 빨라짐
			System.out.println(data);
		}
		
//		for(int i=0; i<list.size(); i++) {
//			String data = (String)list.get(i);// .get은 기본형에 상관없이 상위 클래스인 Object형으로 값을 준다 따라서 필요한 형으로 형변환해서 사용한다.
//			System.out.println(data);
//		}
	}
}
