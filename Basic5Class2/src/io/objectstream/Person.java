package io.objectstream;

import java.io.Serializable;

// 직렬화: 객체가 스트림을 통과하기 위해서(스트림을 통과하기위해 일직선으로 나열한것)
public class Person implements Serializable {//오버라이딩 필요없음 일종의 신호이기 때문에

	private String name;
	private int age;
	private double height;
	private char bloodType;
	
	
	
	
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
	public char getBloodType() {
		return bloodType;
	}
	public void setBloodType(char bloodTpye) {
		this.bloodType = bloodTpye;
	}
	
	
}
