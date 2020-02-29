package task1;

import javax.swing.JTextArea;

public interface JTextAreaUtil {
	public default void getRow(JTextArea textArea) {
//		int caretPos = textArea.getCaretPosition();
//		int rowNum = (caretPos == 0) ? 1 : 0;
//		for (int offset = caretPos; offset > 0;) {
//			try {
//				offset = Utilities.getRowStart(textArea, offset) - 1;
//			} catch (BadLocationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			rowNum++;
//		}
//		System.out.println("Row: " + rowNum);
//		try {
//			offset = Utilities.getRowStart(textArea, caretPos);
//		} catch (BadLocationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int colNum = caretPos - offset + 1;
//		System.out.println("Col: " + colNum);
	}
}
