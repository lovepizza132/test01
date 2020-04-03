package e_static_sample;

public class ViewB {
	DBConnect db = null;//클래스의 변수명에는 자동으로 null값이 들어감


	public ViewB(){
		db = DBConnect.getInstance();//객체 생성 및 호출
	}

	public void use() {
		System.out.println("디비 작업중");

	}
}

