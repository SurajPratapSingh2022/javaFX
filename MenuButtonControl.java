package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuButtonControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root,600,400);
		stage.setScene(scene);
		stage.setTitle("MenuButton Example");
		stage.show();
		
		MenuButton menuButton=new MenuButton("Languages");
		MenuItem menuItem1=new MenuItem("MenuItem 1");
		MenuItem menuItem2=new MenuItem("MenuItem 2");
		MenuItem menuItem3=new MenuItem("MenuItem 3");
		
		menuButton.getItems().addAll(menuItem1,menuItem2,menuItem3);
		root.setCenter(menuButton);
		
		Label label=new Label("Result Here");
		root.setBottom(label);
		
		menuItem1.setOnAction(e->label.setText("MenuItem1 Clicked"));
		menuItem2.setOnAction(e->label.setText("MenuItem2 Clicked"));
		menuItem3.setOnAction(e->label.setText("MenuItem3 Clicked"));
		
		
	}
	
}
