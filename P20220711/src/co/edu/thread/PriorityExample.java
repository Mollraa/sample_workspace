package co.edu.thread;

class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 2000000000; i++) {   //20억번돌리겠다
			if (i % 100000000 == 0) {  //1억초마다
				try {
					Thread.sleep(1);   //늦추겠다
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Thread: " + getName());
	}
}

public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("Thread-" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // setpri~ 우선순위를 주겠습니다.
			} else {
				thread.setPriority(Thread.MIN_PRIORITY);  //()에 숫자 넣어도됨.
			}
			thread.start(); // 작업실행
		}
	}

}
