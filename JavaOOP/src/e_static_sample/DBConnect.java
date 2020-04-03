package e_static_sample;

public class DBConnect {
	
	static DBConnect con = null;//static은 static만 접근 가능하기에 static 넣어주기
	
	private DBConnect(){//생성자 함수 앞에 아무것도 없어야하고 클래스명과 같아야한다.
		System.out.println("실제로 디비 연결");
	}
	
	public static DBConnect getInstance() {//싱글톤 방식
		if(con==null) con = new DBConnect();//메모리에 객체 하나만 올리기 위해서어어
		return con;//con의 자료형은 5line을 보면 앞에 위치
	}
	
}
