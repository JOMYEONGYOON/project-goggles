package impl.method;

import javax.swing.JTextField;

import dto.MemberDTO;
import impl.vo.StringVO;
import model.view.SignUpFrame;

public interface SignUpCheckable extends StringVO {
	public default boolean checkMemberIdByName(JTextField idTF) {
		String idTextFieldText = idTF.getText();
		return true;
	}

	public default MemberDTO getMemberByFrame(SignUpFrame frame) {

		
		return null;
	}
}
