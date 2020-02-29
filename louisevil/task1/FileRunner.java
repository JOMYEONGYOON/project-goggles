package task1;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

import manager.DatabaseManager;
import manager.ResourceManager;
import object.MySQL;

public class FileRunner {

	public String run(String command, String target) {
		// 실행파일 명령, 대상 출력
		System.err.println("----------------------------------------------");
		System.out.printf("%10s %8s \n%10s %20s\n", "command", command, "target", target);
		File file = new File(target);
		String fileExtension = FilenameUtils.getExtension(target);

		// 파일 확장자가 SQL일 때만 데이터베이스 연결
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
				// 명령어 판단하는 부분
				System.out.println(command);
				
				//사전 데이터베이스 연결
				
				if (command.equals("create")) {
					if (target.equals(ResourceManager.CREATE_DICTIONARY_SQL_PATH) ) {
						databaseManager.executeQueryByFile(new File(ResourceManager.CREATE_DICTIONARY_SQL_PATH));
					}
				}else if (command.equals("delete")) {
					
				}else if (command.equals("insert")) {
					
				}else {
					
				}
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
