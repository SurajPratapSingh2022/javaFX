package application;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ScrollPaneControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		try {
			BorderPane root=new BorderPane();
			Scene scene=new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			ScrollPane scrollPane=new ScrollPane();
			FileInputStream fis=new FileInputStream("C:\\Users\\suraj\\eclipse-workspace\\javaFX\\src\\application\\lion.jpg");
			Image image=new Image(fis);
			ImageView imageView=new ImageView(image);
			
			scrollPane.setContent(imageView);
			scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
			scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
			scrollPane.setPannable(true);
			root.setCenter(scrollPane);
			stage.setScene(scene);
			stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
