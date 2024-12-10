package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneExample extends Application{
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
		Button b7=new Button("Button7");
		
		b1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		b2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		b3.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		b4.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		b5.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		b6.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		b7.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
		
		b2.setPrefSize(80, 60);
		TilePane root=new TilePane();
		root.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7);
		TilePane.setMargin(b3, new Insets(10));
		root.setHgap(10);
		root.setVgap(20);
		root.setPadding(new Insets(20));
//		TilePane.setAlignment(b4, Pos.TOP_LEFT);
//		root.setAlignment(Pos.CENTER);
//		root.setOrientation(Orientation.VERTICAL);
		
		Scene scene=new Scene(root,400,300);
		stage.setScene(scene);
		stage.setTitle("TilePane Example");
		stage.show();
	}

}
