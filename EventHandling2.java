package application;
//Event Handling through Lambda Expression

//interface Mobile1{
//	void show(int i);
//}
//public class EventHandling2 {
//	public static void main(String[] args) {
//		Mobile1 mobile=(int i)->System.out.println("Hello"+i);
//		mobile.show(10);
//	}
//}

//Event Handling performing Lambda Expression
import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class EventHandling2 extends Application{
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
		
		b1.setOnAction(e->System.out.println("Save button pressed!"));
		
		
		root.setCenter(b1);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
	}
	

}
