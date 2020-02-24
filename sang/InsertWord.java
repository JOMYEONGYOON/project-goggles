import java.util.Vector;

public class InsertWord {
	/*****************
	 * Member Fields
	 *****************/
	public static Vector<String> savedWords = new Vector<>();

	public static void insertWordTest(String inputWord) {
		inputWord = "상금"; // test data
		System.out.print(getCurrentMethodNameTest() + "");
		System.out.println(inputWord);
		savedWords.add(inputWord);
		System.out.println(savedWords);
	}

	public static void insertWordsTest(Vector<String> inputWords) {
		inputWords = new Vector<String>(); // test data
		System.out.print(getCurrentMethodNameTest());
		inputWords.add("시계");
		inputWords.add("사과");
		inputWords.add("수건");
		inputWords.add("시간");
		System.out.println(inputWords);
		for (String testInputWord : inputWords) {
			savedWords.add(testInputWord);
		}
		System.out.println(savedWords);

	}

	public static String getCurrentMethodNameTest() {
		return Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	public static void test() {
		insertWordTest(null);
		insertWordsTest(null);
	}

}
