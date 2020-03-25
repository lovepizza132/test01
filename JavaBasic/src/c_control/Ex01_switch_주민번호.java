package c_control;

public class Ex01_switch_주민번호 {

	public static void main(String[] args) {

		String id = "930820-1534567";
		char chul = id.charAt(8); // '2'
		String home = "";
		int i =0;
		
		//switch 문은 무조건 break;로 빠져나올것 (default도 예외없음)
		switch(chul){
		default : home = "한국인"; break;
		case '0' : home = "서울"; break;
		case '1' : home = "인천/부산"; break;
		case '2' : home = "경기도"; break;
		}
		System.out.println("출신지-" + home );
	}

}
