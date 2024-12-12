package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SplitMenuButtonControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root,600,400);
		stage.setScene(scene);
		stage.setTitle("SplitMenuButton Example");
		stage.show();
		
		SplitMenuButton splitMenuButton=new SplitMenuButton();
		splitMenuButton.setText("Laguages");
		MenuItem menuItem1=new MenuItem("MenuItem1");
		MenuItem menuItem2=new MenuItem("MenuItem2");
		MenuItem menuItem3=new MenuItem("MenuItem3");
		splitMenuButton.getItems().addAll(menuItem1,menuItem2,menuItem3);
		
		root.setCenter(splitMenuButton);
		
		Label label=new Label("Result Here");
		BorderPane.setAlignment(label, Pos.CENTER);
		root.setBottom(label);
		
		splitMenuButton.setOnAction(e->label.setText("Button Clicked"));
		menuItem1.setOnAction(e->label.setText("MenuItem1 Clicked"));
		menuItem2.setOnAction(e->label.setText("MenuItem2 Clicked"));
		menuItem3.setOnAction(e->label.setText("MenuItem3 Clicked"));
		
	}

}
