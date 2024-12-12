package application;



import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ToolTipControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Button button=new Button("New");
		Font font=Font.font(20);
		button.setFont(font);
		
		Tooltip tooltip=new Tooltip();
		tooltip.setText("Create New Document");
		tooltip.setFont(font);
		
		FileInputStream fis=new FileInputStream("C:\\Users\\suraj\\eclipse-workspace\\javaFX\\src\\application\\img1.png");
		Image image=new Image(fis);
		ImageView imageView=new ImageView(image);
		tooltip.setGraphic(imageView);
		
		button.setTooltip(tooltip);
		root.setCenter(button);
		stage.setScene(new Scene(root,300,300));
		
		stage.show();
	}

}
