package test.initial;
import java.util.Vector;

public class InitialWordTest {
	/*****************
	 * Member Fields
	 *****************/
	public static Vector<String> indexedWords = new Vector<>();
	public static Vector<String> savedWords = new Vector<>();

	/*****************
	 * Method
	 *****************/
	public static void addWord(String word) {
		savedWords.add(word);
	}

	public static void addWords(Vector<String> inputWords) {

		for (int i = 0; i < inputWords.size(); i++) {
			addWord(inputWords.get(i));
		}
	}

	public static String getInitial(String text) {
		String[] chs = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ",
				"ㅎ" };
		String result = "";
		if (text.length() > 0) {
			for (int i = 0; i < text.length(); i++) {
				char chName = text.charAt(i);
				if (chName >= 0xAC00) {
					int uniVal = chName - 0xAC00;
					int cho = ((uniVal - (uniVal % 28)) / 28) / 21;
					result += chs[cho];
				} else {
					return null;
				}
			}
		}
		return result;
	}

	
}
