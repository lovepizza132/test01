package g_access;

import g_access.sub.Access;//import는 다른 폴더, 패키지, 라이브러리에 있기 때문에 사용한것 

// 2. 다른 패키지에서 확인
class Main
{
	public static void main(String[] args) 
	{
		Access me = new Access();
		me.a = "프라이빗 변경";
		me.b = "퍼블릭데이터 변경";
		me.c = "프로텍티드 데이터 변경";
		me.d = "디폴트 데이터 변경";
		
		
		me.output();
	}
}

