package task1;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

import manager.DatabaseManager;
import object.MySQL;

public class FileRunner {

	public String run(String command, String target) {
		System.err.println("----------------------------------------------");
		System.out.printf("command:%10s \n target:%10s\n", command, target);
		File file = new File(target);
		String fileExtension = FilenameUtils.getExtension(target);
		if (fileExtension.equals("sql")) {
			System.out.println("sql");
			System.err.println("----------------------------------------------");
			DatabaseManager databaseManager = new DatabaseManager();
			try {
//				MySQL wrongPasswordMySQL = new MySQL();
//				wrongPasswordMySQL.setPassword("wrong password");
//				databaseManager.connect(wrongPasswordMySQL);
				databaseManager.connect(new MySQL());
				System.out.println("DB 연결성공");
			} catch (Exception e) {
				System.err.println("DB 연결실패");
				return "DB 연결실패";
			}
		} else {
			System.out.println("others type");

		}
		return "완료";
	}

}
