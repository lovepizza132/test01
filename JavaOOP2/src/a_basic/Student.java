package a_basic;

public class Student {
	//멤버변수 (member field)
	String name;
	int kor, eng, math;
	private int total;//private은 다른 클래스들이 접근을 못함(보이지 않음)
	private double avg;
	
	//멤버변수 (member method / member function)
	int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
}
