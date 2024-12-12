package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TabPaneControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		TabPane tabpane=new TabPane();
		for(int i=1; i<=20; i++) {
			Tab tab=new Tab();
			tab.setText("Tab"+i);
			StackPane pane=new StackPane();
			pane.getChildren().add(new Label("This is Page"+i));
			tab.setContent(pane);
			tabpane.getTabs().add(tab);
			
		}
		
		tabpane.getSelectionModel().selectedItemProperty().addListener((observable,oldVal,newVal)->{
			Tab selectedTab=newVal;
			System.out.println("Selected Tab: "+selectedTab.getText());
		});
		
		
		
		
		BorderPane root=new BorderPane();
		root.setCenter(tabpane);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("TabPane Control");
		stage.show();
	}

}
