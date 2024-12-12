package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SpinnerControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
//		Spinner<Integer> spinner=new Spinner();
//		SpinnerValueFactory<Integer> valueFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
//		spinner.setValueFactory(valueFactory);
//		spinner.setEditable(true);
//		
//		Label label=new Label();
//		label.setText("Value is: "+spinner.getValue());
//		
//		spinner.valueProperty().addListener(new ChangeListener<Integer>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
//				// TODO Auto-generated method stub
//				label.setText("Value is: "+spinner.getValue());
//			}
//			
//		});
//		valueFactory.setValue(5);
		
		ObservableList<String> list=FXCollections.observableArrayList("January","February","March","April","May","June","July","August","September","October","November","December");
		Spinner<String> spinner=new Spinner();
		SpinnerValueFactory<String> valueFactory=new SpinnerValueFactory.ListSpinnerValueFactory<String>(list);
		spinner.setValueFactory(valueFactory);
		
		Label label=new Label();
		label.setText("Value is: "+valueFactory.getValue());
		spinner.valueProperty().addListener((obs,o,n)->{
			label.setText("Value is: "+valueFactory.getValue());
		});
		
		
		
		HBox root=new HBox(10);
		root.getChildren().addAll(spinner,label);
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.show();
	}

}
