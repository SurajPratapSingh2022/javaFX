package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AbsolutePane extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane root=new Pane();
		Button b1=new Button("This is my big button");
		Button b2=new Button("Small Button");
		Button b3=new Button("I have my own positions");
		
		b3.setLayoutX(50);
		b3.setLayoutY(50);
				
		root.getChildren().add(b2);
		root.getChildren().add(b1);
		root.getChildren().add(b3);
		b1.relocate(100, 100);
		stage.setScene(new Scene(root,400,400));
		stage.setTitle("Absolute Pane");
		stage.show();
	}

}
