package task1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import task6.TimerService;

public class TimerView {
	private JFrame frame;
	private JLabel timerLabel;
	private Container container;

	public TimerView() {
		frame = new JFrame("Thread를 상속받은 타이머 스레드 예제");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 120);
		frame.setLocationRelativeTo(null);

		// 타이머 값을 출력할 레이블 생성
		timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		frame.add(timerLabel); // 레이블을 컨텐트팬에 부착

		// 타이머 스레드 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
				TimerService timeRunnable = new TimerService(timerLabel);
				Thread th = new Thread(timeRunnable);

				th.start(); // 타이머 스레드의 실행을 시작하게 한다.

		frame.setVisible(true);
	}
	public static void main(String [] args) {
		new TimerView();
	}
}