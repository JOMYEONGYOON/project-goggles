package task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JLabel;

public class TimerService implements Runnable {
	private JLabel timerLabel; // 타이머 값이 출력되는 레이블
	private String time;

	public TimerService(JLabel timerLabel) {
		this.timerLabel = timerLabel; // 타이머 카운트를 출력할 레이블
	}

	// 스레드 코드. run()이 종료하면 스레드 종료
	@Override
	public void run() {
		while (true) { // 무한 루프
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
			Calendar c = Calendar.getInstance();
			String dTime = formatter.format(c.getTime());
			timerLabel.setText(dTime);
			try {
				Thread.sleep(1000); // 1초 동안 잠을 잔다.
			} catch (InterruptedException e) {
				return; // 예외가 발생하면 스레드 종료
			}
		}
	}
}
