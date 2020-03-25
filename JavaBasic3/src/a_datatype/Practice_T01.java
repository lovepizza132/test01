package a_datatype;

public class Practice_T01 {

	public static void main(String[] args) {


//	// 1번 문제
//		byte b = -128; // byte의 범위는 -128~127
//
//	//2번 문제	
//		int i = 12345678;
//		float f = 3.5; // 가능하게 하려면: float f = (double)3.5; or float f = 3.5f;
//		double d = 12345678.0;
//		String s = "";	
//		
//	//3번 문제
//		byte a = 64;
//		byte b = 64;
//		byte result = (byte)(a + b); // 합이 128임으로 127를 초과 따라서 부호비트가 1로 변환되어 마이너스가 된다.
//		System.out.println("result= " + result);
//	
//	//4번 문제
//		byte b = 36;
//		int i = (int)b;
//		System.out.println("b = "+ b);
//		System.out.println("i = "+ i);
//		
//	//5번 문제	
//
//		int i = 360;
//		byte b = (byte)i;
//		System.out.println("i= " +i);
//		System.out.println("b= " +b);
//
//		
	//6번 문제
		 byte  b = 127;

         char  ch = '글';

         int    i = 20000000;

     long  l =  1L;
		
     b = ( byte ) i;

     i = ( int ) ch;

     int  var = ( int ) b;

     float  f = (float) l;

     l = (long)i;
     
     System.out.println(l);
     System.out.println(b);
     System.out.println(i);
     System.out.println(var);
     System.out.println(f);
     
		
		
	}

}
