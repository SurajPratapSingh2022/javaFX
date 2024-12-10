package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application{
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
		
		b1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		b5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		VBox root=new VBox();
		root.getChildren().addAll(b1,b2,b3,b4,b5);
		root.setVgrow(b4, Priority.ALWAYS);
		root.setSpacing(10);
		root.setPadding(new Insets(10));
		
		
		Scene scene=new Scene(root,200,300);
		stage.setScene(scene);
		stage.setTitle("VBox Example");
		
		stage.show();
	}

}
