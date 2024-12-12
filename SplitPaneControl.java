package application;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplitPaneControl extends Application{
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
			
			SplitPane splitPane=new SplitPane();
			VBox pane1=new VBox();
			VBox pane2=new VBox();
			VBox pane3=new VBox();
			
			pane1.getChildren().add(new Label("Side 1"));
			pane2.getChildren().add(new Label("Side 2"));
			pane3.getChildren().add(new Label("Side 3"));
			
			splitPane.getItems().add(pane1);
			splitPane.getItems().add(pane2);
			splitPane.getItems().add(pane3);
			
			splitPane.setDividerPositions(0.33, 0.67);
			splitPane.setOrientation(Orientation.VERTICAL);
			root.setCenter(splitPane);
			stage.setScene(scene);
			stage.show();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
