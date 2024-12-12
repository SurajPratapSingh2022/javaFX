package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DialogControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage){
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root,400,300);
		stage.setScene(scene);
		stage.setTitle("Dialog Example");
		stage.show();
		
		Button button=new Button("Show Dialog");
		root.setCenter(button);
		
		button.setOnAction(e->{
//			Image image=new Image("application\\img.png",50,50,true,true);
//			ImageView imageView=new ImageView(image);
			
			
//			Dialog dialog=new Dialog();
//			dialog.setTitle("Test Dialog");
//			dialog.setHeaderText("Testing");
//			dialog.setContentText("Hello, This is my test dialog.");
//			dialog.setGraphic(imageView);
//			dialog.getDialogPane().getButtonTypes().addAll(ButtonType.YES,ButtonType.NO,ButtonType.CANCEL);
//			dialog.show();
			
			Dialog dialog=new Dialog();
			dialog.setTitle("My Dialog");
			dialog.setHeaderText("Are you a Player ?");
			dialog.setContentText("Please select an option.");
			dialog.getDialogPane().getButtonTypes().add(ButtonType.YES);
			dialog.getDialogPane().getButtonTypes().add(ButtonType.NO);
			dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
			Optional<ButtonType> result=dialog.showAndWait();
			
			if(result.get()==ButtonType.YES){
				System.out.println("Yes is selected");
			}else if(result.get()==ButtonType.NO) {
				System.out.println("No is selected");
				
			}else if(result.get()==ButtonType.CANCEL) {
				System.out.println("Cancel is selected");
			}else {
				System.out.println("Nothing is selected");
			}
			
			
		});
	}

}
