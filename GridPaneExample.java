package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Button b1=new Button("Button1");
		Button b2=new Button("Button2");
		Button b3=new Button("Button3");
		Button b4=new Button("Button4");
		Button b5=new Button("Button5");
		Button b6=new Button("Button6");
		
		GridPane gridPane=new GridPane();
		
		gridPane.add(b1,0,0,2,2);
		gridPane.add(b2,2,0,1,1);
		gridPane.add(b3,2,1,1,1);
		gridPane.add(b4,0,2,1,1);
		gridPane.add(b5,1,2,1,1);
		gridPane.add(b6,2,2,1,1);
		
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		Scene scene=new Scene(gridPane,300,300);
		stage.setScene(scene);
		stage.setTitle("GridPane Example");
		stage.show();
	}

}
