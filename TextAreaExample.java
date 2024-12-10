package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextAreaExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		TextArea textArea=new TextArea();
		textArea.setWrapText(true);
		textArea.setFont(Font.font(20));
		textArea.setText("This is my first text");
		textArea.setEditable(false);
		textArea.appendText("This is my new Text1");
		String str=textArea.getText();
		System.out.println(str);
		
		FlowPane root=new FlowPane();
		root.getChildren().add(textArea);
		stage.setScene(new Scene(root,400,400));
		stage.show();
	}

}
