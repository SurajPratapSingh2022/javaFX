package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SliderControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root=new BorderPane();
		
		Slider slider=new Slider();
		slider.setMin(0);
		slider.setMax(100);
		slider.setValue(40);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		
		slider.setMajorTickUnit(10);
		slider.setMinorTickCount(4);
		
//		slider.setSnapToTicks(true);
		slider.setBlockIncrement(5);
		slider.increment();
		slider.decrement();
		
		Label label=new Label("Value: ");
		label.setFont(Font.font(20));
		label.setText("Value: "+slider.getValue());
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> obs, Number oldVal, Number newVal) {
				// TODO Auto-generated method stub
				label.setText("Value: "+newVal);
				
			}
		});
		
		root.setCenter(slider);
		root.setTop(label);
		root.setPadding(new Insets(10));
		Scene scene=new Scene(root,800,400);
		stage.setScene(scene);
		stage.setTitle("Slider Control");
		
		stage.show();
	}

}
