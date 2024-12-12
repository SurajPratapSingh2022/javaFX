package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TitledPaneControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		TitledPane tpane=new TitledPane();
		
		tpane.setText("Address");
		tpane.setContent(createGridPane());
		
		//change by default expanded
		tpane.setExpanded(true);
		
		//uncollapsable
		tpane.setCollapsible(true);
	
		//disable animation
		tpane.setAnimated(false);
		
		
		
		VBox root=new VBox();
		root.getChildren().add(tpane);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
	}
	public GridPane createGridPane() {
		GridPane pane=new GridPane();
		pane.add(new Label("Building No: "), 0, 0,1,1);
		pane.add(new Label("Locality/Area: "), 0, 1,1,1);
		pane.add(new Label("City: "), 0, 2,1,1);
		pane.add(new Label("State: "), 0, 3,1,1);
		pane.add(new Label("Country: "), 0, 4,1,1);
		pane.add(new TextField(""), 1, 0,1,1);
		pane.add(new TextField(""), 1, 1,1,1);
		pane.add(new TextField(""), 1, 2,1,1);
		pane.add(new TextField(""), 1, 3,1,1);
		pane.add(new TextField(""), 1, 4,1,1);
		
		return pane;

	}

}
