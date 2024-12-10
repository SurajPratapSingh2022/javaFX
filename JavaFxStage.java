package application;
//Stage
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
//import javafx.scene.image.Image;
import javafx.stage.Stage;

public class JavaFxStage extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root=new Group();
		Scene scene=new Scene(root);
		stage.setScene(scene);
		stage.setTitle("javaFX Application");
//		Image image=new Image("brain.png");
//		stage.getIcons().add(image);
		stage.setWidth(500);
		stage.setHeight(500);
		stage.setResizable(false);
		stage.setX(50);
		stage.setY(50);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("Press q to exit Full Screen");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		
		
		
		stage.show();
	}
}
