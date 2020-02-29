package task1;

import java.io.File;

import javax.swing.JLabel;

import org.apache.commons.io.FilenameUtils;

import manager.DatabaseManager;
import object.MySQL;

public class FileRunner {

	public void run(String command, String target, JLabel stateLabel) {
		// 실행파일 명령, 대상 출력
		System.err.println("----------------------------------------------");
		System.out.printf("%10s %8s \n%10s %20s\n", "command", command, "target", target);
		String fileExtension = FilenameUtils.getExtension(target);

		// 파일 확장자가 SQL일 때만 데이터베이스 연결
		if (fileExtension.equals("sql")) {
			System.out.println("sql");
			DatabaseManager databaseManager = new DatabaseManager();
			try {
//				MySQL wrongPasswordMySQL = new MySQL();
//				wrongPasswordMySQL.setPassword("wrong password");
//				databaseManager.connect(wrongPasswordMySQL);
				MySQL mySQL = new MySQL();
				// 명령어 판단하는 부분
//				System.out.println(command);
				String baseName = FilenameUtils.getBaseName(target);
				System.out.println(baseName);
				// 명령과 타겟에 따라 데이터베이스 매니저에서파일로 연결 실행
				databaseManager.connectServer(mySQL);
				if (target.equals("resources\\sql\\create\\dictionary.sql")) {
					databaseManager.connectServer(mySQL);
				} else {
					databaseManager.connect(mySQL);
				}
				if (command.equals("create")) {
					databaseManager.executeQueryByFile(new File(target));
				} else if (command.equals("delete")) {
					databaseManager.executeUpdateQueryByFile(new File(target));
					System.out.println(target);
				} else if (command.equals("insert")) {
					databaseManager.executeUpdateInsertQueryByFile(new File(target));
				} else {

				}
				String result = String.format("%s %s %s", command, target, "완료");
				System.out.println(result);
			} catch (Exception e) {
				String result = String.format("%s %s %s", command, target, "실패");
				System.out.println(result);
				e.printStackTrace();
			}
		} else {

		}
	}

}
