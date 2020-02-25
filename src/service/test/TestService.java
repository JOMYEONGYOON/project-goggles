package service.test;

import javax.swing.JLabel;

import dto.JComponentStateDTO;
import service.impl.StateCheckable;

public class TestService implements StateCheckable{

	public  void test() {
		JComponentStateDTO dto =  new JComponentStateDTO(new JLabel("test"));;
		checkStateService(dto);
		
	}
	public static void main(String [] args) {
		new TestService().test();
	}
}
