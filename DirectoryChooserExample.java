package application;

import java.io.File;

import javafx.application.Application;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class DirectoryChooserExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		DirectoryChooser dirChooser=new DirectoryChooser();
		dirChooser.setTitle("Select Your Directory");
		dirChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		
		
		File dir=dirChooser.showDialog(stage);
		if(dir != null) {
			System.out.println("Selected Directory Path: "+dir.getAbsolutePath().toString());
			
		}else {
			System.out.println("No Directory Selected");
		}
	}

}
