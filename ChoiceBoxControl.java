package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ChoiceBoxControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ChoiceBox<String> choice=new ChoiceBox();
		
		ObservableList<String> list=choice.getItems();
		list.addAll("C","C++","Java","Python","PHP","Scala");
		
		
		choice.setOnAction(e->{
			System.out.println(choice.getValue().toString());
		});
		BorderPane root=new BorderPane();
		root.setCenter(choice);
		Scene scene=new Scene(root,300,300);
		stage.setScene(scene);
		stage.setTitle("ChoiceBox Control");
		stage.show();
	}

}
