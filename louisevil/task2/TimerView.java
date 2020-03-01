package task2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import swing.ColorPanel;

public class TimerView extends ColorPanel {
	private JLabel timerLabel;

	public TimerView(Color color) {
		super(color);
		setLayout(new BorderLayout());
		setSize(500, 120);
		// 타이머 값을 출력할 레이블 생성
		timerLabel = new JLabel();
		timerLabel.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 80));
		add(timerLabel); // 레이블을 컨텐트팬에 부착

		// 타이머 스레드 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerService timeRunnable = new TimerService(timerLabel);
		Thread th = new Thread(timeRunnable);

		th.start(); // 타이머 스레드의 실행을 시작하게 한다.

		setVisible(true);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}