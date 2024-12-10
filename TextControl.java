package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		HBox root=new HBox();
		TextField textField=new TextField();
		textField.setPromptText("Enter your name here");
		textField.setFocusTraversable(false);
		
		textField.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				String str=textField.getText();
				System.out.println(str);
				textField.setText("");
				
			}
		});
		root.getChildren().add(textField);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("TextControl Example");
		stage.show();
	}

}
