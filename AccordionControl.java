package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Accordion accordion=new Accordion();
		
		TitledPane pane1=new TitledPane("Pane 1",new Label("This is content of panel:\nline1\nline2\nline3\nline4\nline5"));
		TitledPane pane2=new TitledPane("Pane 1",new Label("This is content of panel:\nline1\nline2\nline3\nline4\nline5"));
		TitledPane pane3=new TitledPane("Pane 1",new Label("This is content of panel:\nline1\nline2\nline3\nline4\nline5"));
		
		accordion.getPanes().addAll(pane1,pane2,pane3);
		accordion.setExpandedPane(pane1);
		
		VBox root=new VBox();
		root.getChildren().add(accordion);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
		
	}

}
