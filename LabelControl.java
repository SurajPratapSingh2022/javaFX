package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class LabelControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		try {
			BorderPane root=new BorderPane();
			Image img=new Image(getClass().getResourceAsStream("brain.png"));
			
			ImageView iview=new ImageView(img);
			
			
			
			
			Label label=new Label("Hello, There is some error!",iview);
	//			label.setText("Hello, There is some error!");
	//			label.setGraphic(iview);
			label.setGraphicTextGap(50);
			label.setFont(Font.font("Roboto",FontWeight.BOLD,18));
			label.setRotate(90);
			root.setCenter(label);
			
			Scene scene=new Scene(root,400,400);
			stage.setScene(scene);
			stage.show();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
