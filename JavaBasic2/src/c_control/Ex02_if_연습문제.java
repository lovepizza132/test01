package c_control;


public class Ex02_if_연습문제 {

	public static void main(String[] args) {

		//		String hakbun = "2019211001";
		//		
		//		String year = hakbun.substring(0, 4); // 0부터 4전의 것까지 - 2017	
		//		char daehak = hakbun.charAt(4);
		//		String colleage = "";
		//		
		//		//학과 구하기
		//		String majorNo = hakbun.substring(5,7);
		//		String major = "";
		//		
		//		if(daehak =='1') {
		//			colleage = "공대";
		//		if(majorNo.equals("11")) {
		//			major = "컴퓨터학과";
		//		}
		//		else if(majorNo.equals("12")) {
		//			major = "소프트웨어학과";
		//		}
		//		else if(majorNo.equals("13")) {
		//			major = "모바일학과";
		//		}
		//		else if(majorNo.equals("22")) {
		//			major = "자바학과";
		//		}
		//		else if(majorNo.equals("33")) {
		//			major = "서버학과";
		//		}
		//		}
		//		else if(daehak == '2') {
		//			colleage = "사회대";
		//			if(majorNo.equals("11")) {
		//				major = "사회학과";
		//			}
		//			else if(majorNo.equals("12")) {
		//				major = "경영학과";
		//			}
		//			else if(majorNo.equals("13")) {
		//				major = "경제학과";
		//			}
		//		}
		//		
		//		System.out.println( hakbun + " 는 " + year + "년도에 입학한 " + colleage + " " + major + " 학생입니다");


		String hakbun = "2019211001";

		String year = hakbun.substring(0, 4); // 0부터 4전의 것까지 - 2017	
		char daehak = hakbun.charAt(4);
		String colleage = "";

		//학과 구하기
		String majorNo = hakbun.substring(5,7);

		String major = "";

		if(daehak =='1') {
			colleage = "공대";
			switch(majorNo) {
			case "11" : 
				major = "컴퓨터학과";
				break;
			case "12" : 
				major = "소프트웨어과";
				break;
			case "13" : 
				major = "모바일학과";
				break;
			case "22" : 
				major = "자바학과";
				break;
			case "33" : 
				major = "서버과";
				break;
			}
			}
		if(daehak =='2') {
			colleage = "사회대";
			switch(majorNo) {
			case "11" :
				major = "사회학과";
				break;
			case "12" :
				major = "경영학과";
				break;
			case "13" :
				major = "경제학과";
				break;
			}
			}
		System.out.println( hakbun + " 는 " + year + "년도에 입학한 " + colleage + " " + major + " 학생입니다");	
	}
}