package g_access.sub;

public class Access {
	private	  String a = "프라이빗 데이타";// 모든 클래스 차단 / 같은 클래스 내
	public    String b = "퍼블릭 데이타";// 누구나
	protected String c = "프로텍티드 데이타";// 같은 패키지 내
		  String d = "디폴트 데이타";// 같은 패키지 내
	public void output(){
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);
	}

}
