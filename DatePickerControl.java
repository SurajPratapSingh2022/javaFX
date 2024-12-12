package application;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DatePickerControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Label label=new Label("Value: ");
		label.setFont(Font.font(20));
		
		DatePicker dp=new DatePicker();
		dp.setValue(LocalDate.now());
		dp.setValue(LocalDate.of(2021, 11, 20));
		dp.setValue(null);
		
		dp.setOnAction(e->{
			label.setText("Value: "+dp.getValue().toString());
		});
		
		VBox root=new VBox();
		root.getChildren().addAll(label,dp);
		Scene scene=new Scene(root,300,300);
		stage.setScene(scene);
		stage.setTitle("DatePicker Control");
		stage.show();
		
	}

}
