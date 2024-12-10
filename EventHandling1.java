package application;
//Event Handling performing through Anonymous inner classes
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class EventHandling1 extends Application{
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
		
		EventHandler<ActionEvent> eventHandler=new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Save button pressed!");
			}
		};
		b1.setOnAction(eventHandler);
		
		
		root.setCenter(b1);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
	}
	

}
