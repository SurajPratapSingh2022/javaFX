package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
//		ListView listView=new ListView();
//		listView.getItems().add("Ram");
//		listView.getItems().add("Shyam");
//		listView.getItems().add("Rinku");
//		listView.getItems().add("Rakesh");
		ListView listView=new ListView(FXCollections.observableArrayList("Ram","Shyam","Rinku","Rakesh"));
		
		listView.getItems().set(2, "Rohan");
		listView.getItems().remove(3);
		listView.getItems().remove("Rohan");
		listView.setPrefSize(150, 200);
		
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> obj,String oldVal, String newVal) {
				System.out.println("Selected Item: "+newVal);
			}
		});
		
		
		FlowPane root=new FlowPane();
		root.getChildren().add(listView);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("List Control Example");
		stage.show();
	}

}
