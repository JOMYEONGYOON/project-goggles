package controller;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

import container.SignInContainer;
import frame.MainFrame;
import vo.ViewNamesVO;

public interface MainFrameControlable {
	public default MainFrame run() {
		MainFrame mainFrame = MainFrame.getInstance();
		initView(mainFrame);
		setContainer(mainFrame, ViewNamesVO.SIGN_IN);
		return mainFrame;
	}

	public default void initView(JFrame frame) {
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.revalidate();
	}

	public default void setContainer(JFrame frame, String COMMAND_VIEW) {
		Container container = frame.getContentPane();
		if (container != null) {
			container.removeAll();

		}
		JPanel newContainer = new JPanel();
		if (ViewNamesVO.SIGN_IN == COMMAND_VIEW) {
			SignInContainer signInContainer = new SignInContainer();
			newContainer.add(signInContainer);
		} else if (ViewNamesVO.SIGN_UP == COMMAND_VIEW) {
			SignInContainer signUpContainer = new SignInContainer();
			newContainer.add(signUpContainer);
		}
		frame.add(newContainer);
		frame.revalidate();
		frame.setVisible(true);
	}

}
