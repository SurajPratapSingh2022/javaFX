package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ProgressBarControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		
		ProgressBar progressBar=new ProgressBar();
		progressBar.setPrefSize(300, 20);
		progressBar.setProgress(0.3);
		progressBar.setProgress(-1);
		
		root.setCenter(progressBar);
		root.setPadding(new Insets(10));
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("ProgressBar Control");
		
		stage.show();
	}

}
