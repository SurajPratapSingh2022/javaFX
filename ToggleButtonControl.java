package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ToggleButtonControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ToggleButton toggle=new ToggleButton("ON/OFF");
		toggle.setFont(Font.font("Times New Roman",FontWeight.BOLD,20));
		
		Circle circle=new Circle(100);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		toggle.setOnAction(e->{
				if(toggle.isSelected()) {
					circle.setFill(Color.YELLOW);
					circle.setStroke(Color.BLACK);
				}
				else {
					circle.setFill(Color.WHITE);
					circle.setStroke(Color.BLACK);
				}
		});
		
		
		HBox root=new HBox();
		root.setSpacing(10);
		root.setPadding(new Insets(10));
		root.getChildren().addAll(toggle,circle);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("ToggleeButton Example");
		
		stage.show();
	}

}
