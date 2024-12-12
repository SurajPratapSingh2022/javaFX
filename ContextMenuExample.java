package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ContextMenuExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Label label=new Label("Result Here");
		Circle circle=new Circle();
		circle.setRadius(80);
		circle.setFill(Color.AQUA);
		
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(label,circle);
		stage.setScene(new Scene(root,250,250));
		stage.setTitle("ContextMenu Example");
		stage.show();
		
		ContextMenu contextMenu=new ContextMenu();
		MenuItem menuItem1=new MenuItem("MenuItem1 : RED");
		MenuItem menuItem2=new MenuItem("MenuItem2 : GREEN");
		MenuItem menuItem3=new MenuItem("MenuItem3 : BLUE");
		contextMenu.getItems().addAll(menuItem1,menuItem2,menuItem3);
		
		circle.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
			public void handle(ContextMenuEvent event) {
				contextMenu.show(circle,event.getScreenX(),event.getScreenY());
				
			}
		});
		menuItem1.setOnAction(e->{
			label.setText("MenuItem1 Clicked");
			circle.setFill(Color.RED);
		});
		menuItem2.setOnAction(e->{
			label.setText("MenuItem2 Clicked");
			circle.setFill(Color.GREEN);
		});
		menuItem3.setOnAction(e->{
			label.setText("MenuItem3 Clicked");
			circle.setFill(Color.BLUE);
		});
	}
}
