package application;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.TextFieldSkin;


public class CustumPasswordFieldExample extends TextFieldSkin{
	private char mask_char='*';
	
	public CustumPasswordFieldExample(TextField arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected String maskText(String text) {
		if(getSkinnable() instanceof PasswordField) {
			int size=text.length();
			StringBuilder builder=new StringBuilder(size);
			for(int i=0; i<size; i++)
				builder.append(mask_char);
			return builder.toString();
		}
		else
			return text;
	}
	

}
