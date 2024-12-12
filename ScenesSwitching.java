package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ScenesSwitching extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	private Scene scene1,scene2;
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		scene1=createScene1();
		scene2=createScene2();
		
		stage.setScene(scene1);
		stage.setTitle("Swiching b/w Scenes");
		
		stage.show();
	}
	private Scene createScene1() {
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		Label label=new Label("This is Scene1");
		label.setFont(Font.font(20));
		Button button=new Button("Open Scene2");
		button.setOnAction(e->{
			setScene(scene2,e);
		});
		button.setFont(Font.font(14));
		
		root.getChildren().addAll(label,button);
		Scene scene=new Scene(root,300,300);
		return scene;
	}
	private Scene createScene2() {
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		Label label=new Label("This is Scene2");
		label.setFont(Font.font(20));
		Button button=new Button("Open Scene1");
		button.setOnAction(e->{
			setScene(scene1,e);
		});
		button.setFont(Font.font(14));
		
		root.getChildren().addAll(label,button);
		Scene scene=new Scene(root,250,250);
		return scene;
	}
	private void setScene(Scene scene,ActionEvent e) {
		Node node=(Node)e.getSource();
		Stage stage=(Stage)node.getScene().getWindow();
		stage.setScene(scene);
	}
}
