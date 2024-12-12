package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceDialogExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(root,400,300));
		stage.setTitle("ChoiceDialog Example");
		stage.show();
		
		Button button=new Button("Show Days");
		Label label=new Label("Result");
		root.getChildren().addAll(button,label);
		
		button.setOnAction(e->{
			String[] days= {"Monday","Tuesday","Thrusday","Friday","Saturday","Sunday"};
			String defaultValue=days[0];
			
			ChoiceDialog<String> dialog=new ChoiceDialog<>(defaultValue,days);
			dialog.setTitle("Days Selection");
			dialog.setHeaderText("Select a day");
			Optional<String> result=dialog.showAndWait();
			result.ifPresent((item)->{
				label.setText(item);
			});
		
		});
	}
}