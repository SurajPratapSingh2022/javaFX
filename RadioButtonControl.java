package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RadioButtonControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Label label1=new Label("Select Your Food: ");
		RadioButton r1=new RadioButton("Pizza");
		RadioButton r2=new RadioButton("Burger");
		RadioButton r3=new RadioButton("Pasta");
		Label label2=new Label("Your have selected: ");
		
		r1.setFont(Font.font(20));
		r2.setFont(Font.font(20));
		r3.setFont(Font.font(20));
		label1.setFont(Font.font(20));
		label2.setFont(Font.font(20));
		
		
		ToggleGroup group=new ToggleGroup();
		r1.setToggleGroup(group);
		r2.setToggleGroup(group);
		r3.setToggleGroup(group);
		
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> arg0, Toggle arg1, Toggle arg2) {
				// TODO Auto-generated method stub
				RadioButton radio=(RadioButton)arg2;
				label2.setText("You have Selected:\n"+radio.getText());
				
			}
		});
		VBox root=new VBox();
		root.setSpacing(10);
		root.setPadding(new Insets(10));
		root.getChildren().addAll(label1,r1,r2,r3,label2);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("RadioButton Control");
		
		stage.show();
	}

}
