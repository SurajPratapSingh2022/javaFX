package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PanesSwiching extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	private BorderPane borderPane;
	private VBox pane1,pane2;
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		pane1=createPane1();
		pane2=createPane2();
		
		borderPane=new BorderPane();
		borderPane.setTop(createArea("Top Area"));
		borderPane.setLeft(createArea("Left Area"));
		borderPane.setRight(createArea("Right Area"));
		borderPane.setBottom(createArea("Bottom Area"));
		borderPane.setCenter(pane1);
		
		Scene scene=new Scene(borderPane,600,400);
		stage.setScene(scene);
		stage.setTitle("Switching b/w panes");
		
		
		stage.show();
	}
	private VBox createPane1() {
		VBox root=new VBox(20);
		root.setAlignment(Pos.CENTER);
		Label label=new Label("This is Pane1");
		Button button=new Button("Open Pane2");
		button.setOnAction(e->{
			borderPane.setCenter(pane2);
		});
		root.getChildren().addAll(label,button);
		return root;
	}
	private VBox createPane2() {
		VBox root=new VBox(20);
		root.setAlignment(Pos.CENTER);
		Label label=new Label("This is Pane2");
		Button button=new Button("Open Pane1");
		button.setOnAction(e->{
			borderPane.setCenter(pane1);
		});
		root.getChildren().addAll(label,button);
		return root;
	}
	private Button createArea(String str) {
		Button button=new Button(str);
		button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		return button;
	}
}
