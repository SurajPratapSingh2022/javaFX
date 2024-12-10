package application;

import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class JavaFxText extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		try {
			BorderPane root=new BorderPane();
			Text text=new Text("This is some long text, that can not wrap in one line.");
			text.setFont(Font.font("Calibri",FontWeight.BOLD,FontPosture.ITALIC,36));
			text.setFill(Color.YELLOW);
			text.setStroke(Color.GREEN);
			text.setStrokeWidth(2);
//			text.setStrikethrough(true);
//			text.setUnderline(true);
			DropShadow shadow=new DropShadow();
			text.setEffect(shadow);
//			text.setEffect(new Reflection());
//			text.setEffect(new BoxBlur());
			text.setWrappingWidth(350);
			text.setTextAlignment(TextAlignment.JUSTIFY);
			
			
			
			root.setCenter(text);
			Scene scene=new Scene(root,400,400);
			stage.setScene(scene);
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
