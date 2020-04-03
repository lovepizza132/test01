package d_constructor;

public class GradeExpr {
	private int [] jumsu;

	
	
	public GradeExpr(int jumsu[]) {
			this.jumsu= jumsu;
		
	}
	public double getAverage() {
		double avg = (double)getTotal()/jumsu.length;
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
		int max = 0;
		for(int i=0; i<jumsu.length; i++) {
			if(jumsu[i]>max) {
				max = jumsu[i];
			}
		}
		return max;
	}
	public int getBadscore() {
		int min = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(min>jumsu[i]) {
				min=jumsu[i];
			}
			}
		return min;
		}
	
	//setter, getter
	public int[] getJumsu() {
		return jumsu;
	}
	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	
	
}
