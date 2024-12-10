package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(200,200,Color.BLUE);
		Rectangle r2=new Rectangle(150,150,Color.GREEN);
		Rectangle r3=new Rectangle(100,100,Color.YELLOW);
		Rectangle r4=new Rectangle(50,50,Color.RED);
		
		r1.setStroke(Color.BLACK);
		r2.setStroke(Color.BLACK);
		r3.setStroke(Color.BLACK);
		r4.setStroke(Color.BLACK);
		
		StackPane root=new StackPane();
		root.getChildren().add(r1);
		root.getChildren().add(r2);
		root.getChildren().add(r3);
		root.getChildren().add(r4);
		
		root.setAlignment(Pos.TOP_LEFT);
		root.setAlignment(r4,Pos.BOTTOM_RIGHT);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("StackPane Exmaple");
		
		
		stage.show();
	}

}
