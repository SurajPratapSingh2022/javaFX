package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AddingTab extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		TabPane tabpane=new TabPane();
		
		for(int i=1; i<=3; i++) {
			Tab tab=new Tab("Tab "+i);
			StackPane pane=new StackPane();
			pane.getChildren().add(new Label("This is Page: "));
			tab.setContent(pane);
			tabpane.getTabs().add(tab);
		}
		Tab newTab=new Tab("+");
		tabpane.getTabs().add(newTab);
		
		newTab.setOnSelectionChanged(e->{
			Tab tab=new Tab("Tab"+tabpane.getTabs().size());
			StackPane pane=new StackPane();
			pane.getChildren().add(new Label("This is Page: "+tabpane.getTabs().size()));
			tab.setContent(pane);
			tabpane.getTabs().add(tabpane.getTabs().size()-1,tab);
			tabpane.getSelectionModel().select(tabpane.getTabs().size()-2);
		});
		
		
		
		BorderPane root=new BorderPane();
		root.setCenter(tabpane);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("Adding Tab in TabPane");
		stage.show();
	}

}
