package b_encapsulation;

/******* 캡슐화  
 
B.	private / public 	-> private 멤버 변수 만든 후 main 에서 에러 확인
							-> public 멤버 메소드를 만들지 않아도 에러는 발생하진 않지만 명확하게 public 지정

		* private : 다른 클래스에서의 접근 차단
		* public : 모든 클래서에서의 접근 허용




C.	setter / getter
D.	 this 
		

 */
public class Student {
	// 1. 멤버변수는 private / 멤버 메소드는 public --캡슐화
	private String name;
	private int kor, eng, math;
	private int calTotal;
	private double calAvg;
	
	public int calTotal()		{  
		calTotal = kor + eng + math;  
		return calTotal;
	}
	public double calAvg()	{  
		calAvg = (double)calTotal / 3;   
		return calAvg;
	}

	
	// 2. 필요한 것만 setter / getter 만든다 // 오른쪽 클릭 - source - Generate getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;//this 가 소속된 클래스를 가지고옴 
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
}
