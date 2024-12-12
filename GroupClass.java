package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GroupClass extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root=new Group();
		
		Button b1=new Button("This is my big button");
		Button b2=new Button("small button");
		Button b3=new Button("Button3");
		b3.setLayoutX(50);
		b3.setLayoutY(50);
		
		root.getChildren().add(b1);
		root.getChildren().add(b2);
		root.getChildren().add(b3);
		b1.relocate(100, 150);
		stage.setScene(new Scene(root,400,400));
		stage.setTitle("Group Class");
		stage.show();
	}

}
