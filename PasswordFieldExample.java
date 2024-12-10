package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class PasswordFieldExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
			PasswordField password=new PasswordField();
			Label label=new Label();
			label.setFont(Font.font("Roboto",FontWeight.BOLD,14));
			
			password.setSkin(new CustumPasswordFieldExample(password));
			password.setFont(Font.font(25));
			
			password.onKeyReleasedProperty().set(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent arg0) {
					int length=password.getText().toString().length();
					if(length==0) {
						label.setText("Please enter some password");
						label.setTextFill(Color.BLACK);
					}
					else if(length<4) {
						label.setText("Weak");
						label.setTextFill(Color.RED);
					}
					else if(length>=4 && length<=8) {
						label.setText("Good");
						label.setTextFill(Color.BLUE);
					}
					else if(length>8) {
						label.setText("Strong");
						label.setTextFill(Color.GREEN);
					}
				}
			});
			HBox root=new HBox(10);
			root.setPadding(new Insets(10));
			root.getChildren().add(password);
			root.getChildren().add(label);
			
			Scene scene=new Scene(root,400,400);
			stage.setScene(scene);
			stage.setTitle("Password Field Example");
			stage.show();
			
			
	}
}
