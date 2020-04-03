package thread.basic;

class Count{
	int i;
	void increment() {//싱크로나이즈, 동기화 tc1이 실행하는 동안 다른 것들은 접근x
		synchronized(this) {//메소드 전체를 동기화하는건 비효율적 따라서 블럭을 형성하여 실행, 객체를 넣어줘야하는 데 넣을게 없어 일반적으로 this를 많이 씀
		i++;
	}
		// 다른 코딩이 많으면 처리 속도가 많이 느려짐 따라서 필요한 것만 블럭처리해서 사용할 것
}
}
class ThreadCount extends Thread{//쓰레드 구현 단독으로 움직이겠음
	Count cnt;//멤버변수
	
	ThreadCount(Count cnt){//객체생성 및 Count를 인자로
		this.cnt = cnt;
	}
	public void run() {
		for(int i=0; i<100000000; i++) {
			cnt.increment();
		}
	}
}

public class Ex05_SynchTest {
	public static void main(String[] args) {
		Count cnt = new Count();
		ThreadCount tc1 = new ThreadCount(cnt);
		tc1.start();
		ThreadCount tc2 = new ThreadCount(cnt);
		tc2.start();
		
		try {
			tc1.join();//쓰레드가 끝날때까지 기다려주셈
			tc2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		System.out.println("i의 결과: " + cnt.i);

	}

}
