package application;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ImageViewExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Image image=new Image("application\\bg.PNG");
		ImageView imageView=new ImageView(image);
		
		ImageView imageView2=new ImageView(image);
		imageView2.setFitWidth(100);
		imageView2.setFitHeight(100);
		imageView2.setPreserveRatio(true);
		imageView2.setSmooth(true);
		imageView2.setCache(true);
		
		//setting the viewport (to achieve zoom effect)
		ImageView imageView3=new ImageView(image);
		Rectangle2D viewport=new Rectangle2D(124,22,191,166);
		imageView3.setViewport(viewport);
		
		
		HBox root=new HBox(5);
		root.getChildren().add(imageView);
		root.getChildren().add(imageView2);
		
		Scene scene=new Scene(root,800,600);
		scene.setFill(Color.BLACK);
		stage.setScene(scene);
		stage.setTitle("ImageView Example");
		stage.show();
				
		
		
		
		
	}

}
