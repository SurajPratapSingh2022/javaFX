package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PropertyBindingExample2 extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane root=new Pane();
		
		Circle circle=new Circle();
		circle.setRadius(50);
		circle.setCenterX(100);
		circle.setCenterY(100);
		
		circle.centerXProperty().bind(root.widthProperty().divide(2));
		circle.centerYProperty().bind(root.heightProperty().divide(2));
		
		root.getChildren().add(circle);
		
		Scene scene=new Scene(root,200,200);
		stage.setScene(scene);
		stage.setTitle("javaFX Property");
		stage.show();
	}

}
