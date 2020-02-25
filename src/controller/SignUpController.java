package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import impl.method.SignUpActionListener;
import impl.vo.StringVO;
import model.view.SignInFrame;
import model.view.SignUpFrame;
import service.SignUpService;

public class SignUpController implements StringVO {
	public static void main(String[] args) {
//		new SignUpController().getMemberByFrame(frame));;
	}

	private SignUpService service;

	private SignUpFrame view;

	public SignUpController() {
		newInstanceView();
		setInstanceView();
		addInstanceView();
	}

	private void addInstanceView() {
		view.getPanel_1().add(view.getLblNewLabel_7(), BorderLayout.CENTER);
		view.getLeftPanel().add(view.getPanel_2());
		view.getPanel_2().setLayout(new BorderLayout(0, 0));
		view.getPanel_2().add(view.getLblNewLabel_2(), BorderLayout.CENTER);
		view.getLeftPanel().add(view.getPanel_3());
		view.getPanel_3().setLayout(new BorderLayout(0, 0));

		view.getPanel_3().add(view.getLblNewLabel_4(), BorderLayout.WEST);
		view.getLeftPanel().add(view.getPanel_4());
		view.getPanel_4().setLayout(new BorderLayout(0, 0));

		view.getPanel_4().add(view.getLblNewLabel_6(), BorderLayout.CENTER);

		view.getLeftPanel().add(view.getPanel_5());
		view.getPanel_5().setLayout(new BorderLayout(0, 0));

		view.getPanel_5().add(view.getLblNewLabel_3(), BorderLayout.CENTER);
		view.getLeftPanel().add(view.getPanel_6());
		view.getPanel_6().setLayout(new BorderLayout(0, 0));
		view.getPanel_6().add(view.getLblNewLabel_5(), BorderLayout.CENTER);

		view.getLeftPanel().add(view.getPanel_7());
		view.getPanel_7().setLayout(new BorderLayout(0, 0));

		view.getPanel_7().add(view.getLblNewLabel_8(), BorderLayout.WEST);

		view.add(view.getTopPanel(), BorderLayout.NORTH);
		view.getTopPanel().setLayout(new BorderLayout(0, 0));

		view.getSignUpLabel().setFont(new Font(StringVO.CONSOLAS, Font.PLAIN, 24));
		view.getTopPanel().add(view.getSignUpLabel());

		view.getTopPanel().add(view.getPanel_8(), BorderLayout.SOUTH);

		view.add(view.getBottomPanel(), BorderLayout.SOUTH);

		view.getBottomPanel().add(view.getPanel_9());

		view.add(view.getCenterPanel(), BorderLayout.CENTER);
		view.getCenterPanel().setLayout(new GridLayout(10, 1, 0, 0));

		view.getIdTF().setText(StringVO.EXAMPLE);
		view.getCenterPanel().add(view.getIdTF());
		view.getIdTF().setColumns(10);

		view.getPasswordTF().setText(StringVO._1234);
		view.getCenterPanel().add(view.getPasswordTF());
		view.getPasswordTF().setColumns(10);

		view.getNameTF().setText(StringVO.CHOI);
		view.getCenterPanel().add(view.getNameTF());
		view.getNameTF().setColumns(10);

		view.getBirthTF().setText(StringVO._1989_03_01);
		view.getCenterPanel().add(view.getBirthTF());
		view.getBirthTF().setColumns(10);

		view.getGenderCB().setModel(new DefaultComboBoxModel(new String[] { StringVO.MALE, StringVO.FEMALE }));
		view.getCenterPanel().add(view.getGenderCB());
		view.getPhoneTF().setText(StringVO._010_000_0000);
		view.getCenterPanel().add(view.getPhoneTF());
		view.getPhoneTF().setColumns(10);

		view.getEmailTF().setText(StringVO.EXAMPLE_EMAIL);
		view.getCenterPanel().add(view.getEmailTF());
		view.getEmailTF().setColumns(10);

		view.getEtcTF().setText("etc....");
		view.getCenterPanel().add(view.getEtcTF());
		view.getEtcTF().setColumns(10);

		view.setVisible(true);

	}

	private void setInstanceView() {
		view.setSize(600, 480);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setForeground(Color.BLACK);
		view.getRightPanel().setForeground(Color.BLACK);
		view.add(view.getRightPanel(), BorderLayout.EAST);
		view.getRightPanel().setLayout(new GridLayout(4, 2, 0, 0));
		view.getRightPanel().add(view.getPanel_12());
		view.getPanel_12().setLayout(new GridLayout(3, 2, 0, 0));

		view.setCheckButton(new JButton(CHECK));
		view.getCheckButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MemberDTO member = getMemberSignUpText();
//				checkMemberIdByName(view.getIdTF().getText());
			}
		});
		view.getPanel_12().add(view.getCheckButton());
		view.getPanel_12().add(view.getSignUpBtn());
		view.getSignUpBtn().setEnabled(false);
		view.getSignUpBtn().setForeground(Color.BLACK);
		view.getSignUpBtn().addActionListener(new SignUpActionListener(view));
		view.getSignUpBtn().setBounds(222, 34, 77, 21);
		view.getPanel_12().add(view.getPanel_10());
		view.getResetButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getIdTF().setText("");
				view.getNameTF().setText("");
				view.getPhoneTF().setText("");
				view.getBirthTF().setText("");
				view.getEmailTF().setText("");

				view.getPasswordTF().setText("");
				view.getEtcTF().setText("");
				view.getSignUpBtn().setEnabled(false);
			}
		});
		view.getPanel_12().add(view.getResetButton());
		view.getResetButton().setForeground(Color.BLACK);

		view.getPanel_12().add(view.getPanel_11());

		view.getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignInFrame();
				// ##
				view.dispose();
			}
		});
		view.getPanel_12().add(view.getCancelButton());
		view.getCancelButton().setForeground(Color.BLACK);
		view.getCancelButton().setBounds(222, 65, 77, 21);

		view.add(view.getLeftPanel(), BorderLayout.WEST);
		view.getLeftPanel().setLayout(new GridLayout(10, 2, 0, 0));

		view.getLeftPanel().add(view.getPanel_0());
		view.getPanel_0().setLayout(new BorderLayout(0, 0));

		view.getPanel_0().add(view.getLblNewLabel_1(), BorderLayout.WEST);

		view.getLeftPanel().add(view.getPanel_1());
		view.getPanel_1().setLayout(new BorderLayout(0, 0));

	}

	public void newInstanceView() {
		view.setRightPanel(new JPanel());
		view.setPanel_12(new JPanel());
		view.setPanel_10(new Panel());
		view.setResetButton(new JButton("Reset"));
		view.setPanel_11(new Panel());
		view.setCancelButton(new JButton(StringVO.CANCEL));
		view.setLeftPanel(new JPanel());
		view.setPanel_0(new JPanel());
		view.setLblNewLabel_1(new JLabel(StringVO.ID));
		view.setPanel_1(new JPanel());
		view.setSignUpBtn(new JButton(StringVO.SIGN_UP));
		view.setLblNewLabel_7(new JLabel(StringVO.PASSWORD));
		view.setPanel_2(new JPanel());
		view.setLblNewLabel_2(new JLabel(StringVO.NAME));
		view.setPanel_3(new JPanel());
		view.setLblNewLabel_4(new JLabel(StringVO.BIRTH));
		view.setPanel_4(new JPanel());
		view.setLblNewLabel_6(new JLabel(StringVO.GENDER));
		view.setPanel_5(new JPanel());
		view.setLblNewLabel_3(new JLabel(StringVO.PHONE));
		view.setPanel_6(new JPanel());
		view.setLblNewLabel_5(new JLabel(StringVO.EMAIL));
		view.setPanel_7(new JPanel());
		view.setLblNewLabel_8(new JLabel(StringVO.ETC));
		view.setTopPanel(new JPanel());
		view.setSignUpLabel(new JLabel(StringVO.SIGN_UP));
		view.setPanel_8(new JPanel());
		view.setBottomPanel(new JPanel());
		view.setPanel_9(new JPanel());
		view.setCenterPanel(new JPanel());
		view.setIdTF(new JTextField());
		view.setPasswordTF(new JPasswordField());
		view.setNameTF(new JTextField());
		view.setBirthTF(new JTextField());
		view.setGenderCB(new JComboBox());
		view.setPhoneTF(new JTextField());
		view.setEmailTF(new JTextField());
		view.setEtcTF(new JTextField());
		view.setPanel_14(new JPanel());
	}

	public SignUpService getService() {
		return service;
	}

	public SignUpFrame getView() {
		return view;
	}

	public void setService(SignUpService service) {
		this.service = service;
	}

	public void setView(SignUpFrame view) {
		this.view = view;
	}
}
