package application;
//Scene
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFxScene extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		Scene scene=new Scene(root,400,300,Color.RED);
		scene.setCursor(Cursor.HAND);
		stage.setScene(scene);
		
		stage.show();
		
	}
}
