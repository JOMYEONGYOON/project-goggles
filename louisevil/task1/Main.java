package task1;

import manager.MemberTableManager;
import object.Member;
import object.MySQL;

public class Main {
	public static void main(String[] args) {
		MemberTableManager memberTableManager = new MemberTableManager();
		
		try {
			memberTableManager.connect(new MySQL());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		memberTableManager.insert(new Member());
		
	}
}
