package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertDialogExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage){
		// TODO Auto-generated method stub
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(root,400,400));
		stage.show();
		
		Button b1=new Button("Simple");
		Button b2=new Button("Info");
		Button b3=new Button("Warning");
		Button b4=new Button("Error");
		Button b5=new Button("Confirmation");
		
		root.getChildren().addAll(b1,b2,b3,b4,b5);
		b1.setOnAction(e->{showSimpleAlert();});
		b2.setOnAction(e->{showInformationAlert();});
		b3.setOnAction(e->{showWarningAlert();});
		b4.setOnAction(e->{showErrorAlert();});
		b5.setOnAction(e->{showConfirmationAlert();});

//		showInformationAlert();
//		showWarningAlert();
//		showErrorAlert();
//		showConfirmationAlert();
//		showSimpleAlert();
	}
	private void showInformationAlert() {
		Alert alert=new Alert(AlertType.INFORMATION);
		alert.setTitle("Test Connection");
		alert.setHeaderText("Result");
		alert.setContentText("Connected to the database successfully");
		alert.show();
		
		
	}
	private void showErrorAlert() {
		Alert alert=new Alert(AlertType.ERROR);
		alert.setTitle("Error Alert");
		alert.setHeaderText("Can't add the user");
		alert.setContentText("User already exists");
		alert.show();
	}
	private void showWarningAlert() {
		Alert alert=new Alert(AlertType.WARNING);
		alert.setTitle("Warning Alert");
		alert.setHeaderText("Battery Status");
		alert.setContentText("The Battery charge is low!");
		alert.show();
	}
	private void showConfirmationAlert() {
		Alert alert=new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Deletion");
		alert.setHeaderText("Delete File");
		alert.setContentText("Are you sure, you want to delete this file ?");
		Optional<ButtonType> result=alert.showAndWait();
		if(result.get()==ButtonType.OK) {
			System.out.println("File Deleted Successfully");
		}else if(result.get()==ButtonType.CANCEL) {
			System.out.println("Cancelled");
		}
	}
	private void showSimpleAlert() {
		Alert alert=new Alert(AlertType.NONE);
		alert.setTitle("Simple Alert");
		alert.setHeaderText("Simple Demo");
		alert.setContentText("This is my message");
		alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
		alert.show();
	}
	
	
	
	
	
}
