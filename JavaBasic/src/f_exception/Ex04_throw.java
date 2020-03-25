package f_exception;

public class Ex04_throw {

	public static void main(String[] args) {
		
		try {
			readArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}

	static void readArray() throws Exception{
		try {
			String [] msg = new String[]{"행복하자","끝내자","만난거먹자"};
			for(int i=0; i<=msg.length; i++) {
				System.out.println(msg[i]);
			}
			
		}catch(Exception ex) {
			//System.out.println("예외발생: " + ex.getMessage());
			throw new MyException();//throw로 일부로 예외를 만듬
		}
	}
}
