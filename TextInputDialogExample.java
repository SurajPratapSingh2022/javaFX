package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextInputDialogExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(root,400,300));
		stage.setTitle("TextInputDialog Example");
		stage.show();
		
		Button b1=new Button("Take user input");
		Label label=new Label("Name will appear here");
		b1.setOnAction(e->{
			TextInputDialog dialog=new TextInputDialog();
			dialog.setTitle("Name Entry");
			dialog.setHeaderText("Enter Your Name");
			dialog.setContentText("Name: ");
			Optional<String> result=dialog.showAndWait();
			result.ifPresent((name)->{
				label.setText(name);
			});
		});
		root.getChildren().addAll(b1,label);
	}
}
