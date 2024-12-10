package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ButtonControl extends Application implements EventHandler<ActionEvent>{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		//ImageView iview=new ImageView(new Image("application/brain.png"));
//		Button b1=new Button("Save",iview);
		
		Button b1=new Button("Save");
		b1.setFont(Font.font("Arial",FontWeight.SEMI_BOLD, 18));
//		b1.setRotate(270);
		b1.setOnAction(this);
		
		
		root.setCenter(b1);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
	}
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Save button pressed!");
	}

}
