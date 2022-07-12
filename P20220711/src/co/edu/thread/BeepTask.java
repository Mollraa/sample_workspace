package co.edu.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override // beepTask에 빨간줄 클릭하면생김
	public void run() {
		// 스피커소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
