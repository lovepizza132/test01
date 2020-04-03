package thread.basic;

class Bread 
{
	String bread;

	//##  	
	boolean isCheck = false;//디폴트가 false값
	
	
	public void setBread( String bread )//만들고
	{
		this.bread = bread;
		//## 		
		isCheck = true;
		synchronized(bread) {
			notifyAll();
		}
	}	

	public String getBread()//꺼내고
	{
		//## 		
		if(isCheck == false) {
			try {
				synchronized(bread) {
					wait();//하면 notifyAll로 풀어줘야한다. 그리고 wait, notify에 싱크로나이즈를 해줘야 한
					//start();라는 명령어로 대기실에 입장(실행하지는 않고 기다림), run();메소드에서 실행이 됨 (start()에서 이곳으로 옮겨져야함), wait()을 통해 올려주고 notifyAll()로 다시 start();로 내려준다.
					//윈도우의 라운드로빈방식으로 자바의 우선순위설정대로 진행되지 않음
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return bread;
	}
}

class Baker extends Thread
{
	Bread bbang;

	Baker( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		bbang.setBread("진열된 완성된 맛있는 빵");
	}
}

class Customer extends Thread
{
	Bread bbang;

	Customer( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class Ex8_BreadTest
{
	public static void main(String[] args) 
	{
		Bread  bread = new Bread();

		Baker  baker = new Baker( bread );
		Customer customer = new Customer( bread );
		customer.start();
		baker.start();

		try{
			customer.join();
			baker.join();			
		}catch( Exception ex ){}

	}
}
