package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorPickerControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ColorPicker colorPicker=new ColorPicker();
		colorPicker.setValue(Color.RED);
		
		BorderPane root=new BorderPane();
		root.setCenter(colorPicker);
		Scene scene=new Scene(root,300,300);
		stage.setScene(scene);
		stage.setTitle("ColorPicker Control");
		stage.show();
		
		colorPicker.setOnAction(e->{
			Color color=colorPicker.getValue();
			root.setBackground(new Background(new BackgroundFill(color,null,null)));
			
		});
	}

}
