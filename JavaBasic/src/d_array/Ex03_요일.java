package d_array;

import java.util.Calendar;

public class Ex03_요일 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		System.out.print(y + "년" + (m+1) + "월" + d +"일");
		System.out.print(h + "시" + min + "분" + s + "초");
		
		String [] yoil = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일");
		
		
	}

}
