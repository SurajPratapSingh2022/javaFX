package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ProgressIndicatorControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void 
	start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		
		ProgressIndicator pi=new ProgressIndicator(0.3);
		pi.setProgress(-1);
		root.setCenter(pi);
		root.setPadding(new Insets(10));
		Scene scene=new Scene(root, 400,400);
		stage.setScene(scene);
		stage.setTitle("ProgressIndicator Control");
		stage.show();
	}

}
