package application;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ToolBarControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ToolBar toolbar=new ToolBar();
		Button b1=new Button("New");
		Button b2=new Button("Open");
		Button b3=new Button("Save");
		Button b4=new Button("Exit");
		
		toolbar.getItems().addAll(b1,b2,b3,new Separator(),b4);
		toolbar.setOrientation(Orientation.VERTICAL);
		
		BorderPane root=new BorderPane();
		root.setTop(toolbar);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		
		
		stage.show();
	}

}
