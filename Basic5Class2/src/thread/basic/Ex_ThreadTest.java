package thread.basic;

public class Ex_ThreadTest {

	public static void main(String[] args) {
		MakeCar1 work1 = new MakeCar1("차틀만들기");
		work1.start();//start가 run을 호출
		
		MakeCar1 work2 = new MakeCar1("엔진부착");
		work2.start();
		

	}

}

class MakeCar1 extends Thread{
	String work;
	
	MakeCar1(String _work){//Sting work;
		work = _work;//this.work = work;를 쓰지 않기위해 초기화
	}
	public void run() {//오버라이딩
		for(int i=0; i<5; i++) {
			System.out.println(work+"작업중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
// 멀티프로그래밍 비슥(멀티쓰레드)
// 1. Thread 상속 또는 Runnable 구현
// 2. run() 오버라이딩
// 3. run()호출 : start() ->run()호출됨
// 4. 