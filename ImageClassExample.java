package application;

import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageClassExample extends Application{
	public static void main(String[] args) {
		launch(args);
		
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		//image in web
//		String url="https://letsenhance.io/static/8f5e523ee6b2479e26ecc91b9c25261e/1015f/MainAfter.jpg";
		
		//image in external working directory/folder
//		String url="images/bg.PNG"
		
		//image in current working directory/folder
//		String url="application:bg.PNG";
		
		//image inside a folder in current working directory
//		String url="application:image/bg.PNG"
		
		//image at any location in our pc
		String path="C:\\Users\\suraj\\eclipse-workspace\\javaFX\\src\\application\\rocket.png";	
		FileInputStream url=new FileInputStream(new File(path));
		
		
		Image image=new Image(url,500,400,true,true);
		
		
		ImageView iv=new ImageView(image);
		
		
		Group root=new Group();
		Scene scene=new Scene(root,800,600);
		stage.setScene(scene);
		stage.setTitle("Image Eample");
		stage.show();
	}

}
