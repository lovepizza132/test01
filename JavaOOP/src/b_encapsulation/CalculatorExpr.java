package b_encapsulation;

public class CalculatorExpr {
	// 멤버변수 선언
	private int num1;
	private int num2;
	
	public int getAddion() {
		return num1 + num2;
	}
	public int getSubtraction() {
		return num1 -num2;
	}
	public int getMultiplication() {
		return num1 * num2;
	}
	public double getDivision() {
		return (double)num1 / num2;
	}
	// setter와 getter 설정
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}