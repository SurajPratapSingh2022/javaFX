package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ComboBox<String> combo=new ComboBox();
		
		ObservableList<String> list=combo.getItems();
		list.addAll("C","C++","Java","PHP","Scala");
		
		combo.setEditable(true);
		combo.setPromptText("Type Here");
		combo.setFocusTraversable(false);
		combo.setVisibleRowCount(4);
		
		combo.setOnAction(e->{
			System.out.println(combo.getValue().toString());
		});
		BorderPane root=new BorderPane();
		root.setCenter(combo);
		Scene scene=new Scene(root,300,300);
		stage.setScene(scene);
		stage.setTitle("ComboBox Control");
		stage.show();
	}

}
