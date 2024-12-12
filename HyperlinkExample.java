package application;



import java.awt.Desktop;
import java.io.FileInputStream;
import java.net.URL;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HyperlinkExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Hyperlink hp1=new Hyperlink("Click Here");
		Font font=new Font(18);
		hp1.setFont(font);
		hp1.setOnAction(e->{
			System.out.println("Link is clicked");
			
		});
		Hyperlink hp2=new Hyperlink("http://www.facebook.com");
		hp2.setFont(font);
		hp2.setOnAction(e->{
			openWebPage("http://www.facebook.com");
			
		});
		
		Hyperlink hp3=new Hyperlink();
		Image image=new Image(getClass().getResourceAsStream("img1.png"));
		ImageView imageView=new ImageView(image);
		hp3.setGraphic(imageView);
		hp3.setOnAction(e->{
			openWebPage("http://www.google.com");
		});
		
		
		
		
		VBox root=new VBox();
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(hp1,hp2);
		Scene scene=new Scene(root,800,600);
		stage.setScene(scene);
		stage.show();
	}
	public static void openWebPage(String urlPath) {
		try {
			Desktop.getDesktop().browse(new URL(urlPath).toURI());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
