package d_constructor;

public class GradeExpr02 {
	int [] jumsu;//멤버변수 선언
	
	//멤버점수 jumsu에 매개변수 jumsu의 값을 할당
	public GradeExpr02(int [] jumsu) {//생성자 함수 void조차 없음 리턴하는 값이 없기 때문에
		this.jumsu = jumsu;//생성자 함수에만 this를 사용할 수 있으며, 첫번째 줄에서 사용 가능
	}
	public double getAverage() {
		double avg = (double)getTotal() / jumsu.length;
		return avg;
		
	}
	public int getTotal() {
		int total = 0;
		for(int i=0; i<jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}
	
	
	public int getGoodScore() {
		
	}
	public int getBadScore() {
		
	}
}
