package thread.basic;

public class Ex2_RunnableTest {

	public static void main(String[] args) {
		MakeCar2 mc1 = new MakeCar2("차틀만들기");
		Thread t1 = new Thread(mc1);
		t1.start();//Runnable에는 start()함수가 없다 따라서 Thread 객체를 생성한 후, Thread 객체에 mc1클래스 객체를 넣어 t1.start()안에 mc1 객체를 사용하여 mc1의 멀티쓰래드를 작동시킨다.

//		MakeCar2 mc2 = new MakeCar2("엔진부착");
//		Thread t2 = new Thread(mc2);
//		mc2.run();
		new Thread(new MakeCar2("엔진부착")).run();//윗줄 코딩의 축약형
	}

}

class MakeCar2 implements Runnable{
	String work;//멤버변수
	MakeCar2(String work){
		this.work = work;
	}
	public void run() {//오버라이딩 Runnable안에는 run()함수가 들어있어 오버라이딩 가능
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