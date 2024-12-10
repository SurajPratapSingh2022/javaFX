package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		TextArea textArea=new TextArea();
		Button b1=new Button("Open");
		Button b2=new Button("Close");
		
		AnchorPane root=new AnchorPane();
		root.getChildren().addAll(textArea,b1,b2);
		root.setTopAnchor(textArea, 10.0);
		root.setLeftAnchor(textArea, 10.0);
		root.setRightAnchor(textArea, 65.0);
		root.setBottomAnchor(textArea, 10.0);
		
		root.setRightAnchor(b2, 10.0);
		root.setBottomAnchor(b2, 10.0);
		root.setRightAnchor(b1, 10.0);
		root.setTopAnchor(b1, 10.0);
		
		Scene scene=new Scene(root);
		stage.setScene(scene);
		stage.setTitle("AnchorPane Example");
		stage.show();
	}
}
