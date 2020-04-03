package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
	
		ArrayList<Student> list = method();
		for(Student data : list) {//Student가 데이터 타입, list가 가져오는 매서드, data가 변수선언
			System.out.println(data);
		}
//		for(int i=0; i<list.size(); i++) {
//			Student data = (Student)list.get(i);//캐스팅진행 (Student) -> String, int로 이루어짐
//			System.out.println(data);
//		}
		// 여기서 출력
	}
	static ArrayList<Student> method() {
		// 세명의 학생 정보를 저장 : ArrayList 이용
		Student a = new Student("홍길동", 25);
		Student b = new Student("홍길자", 35);
		Student c = new Student("홍길숙", 20);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(a);
		list.add(b);
		list.add(c);
//		for(String data : list)
//		System.out.println(data);
		return list;

	}
}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
