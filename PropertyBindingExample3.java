package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PropertyBindingExample3 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox root=new VBox();
		root.setPadding(new Insets(10));
		Font font=new Font(18);
		
		Label label=new Label();
		TextField textField1=new TextField();
		TextField textField2=new TextField();
		
		
		label.textProperty().bind(textField1.textProperty());//single way binding
		textField2.textProperty().bindBidirectional(textField1.textProperty());
		
		root.getChildren().addAll(textField1,textField2,label);
		
		stage.setScene(new Scene(root,400,400));
		stage.setTitle("Bi Directional Binding");
		
		
		
		stage.show();
	}

}
