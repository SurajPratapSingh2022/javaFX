package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CheckboxControl1 extends Application implements EventHandler<ActionEvent>{
	public static void main(String[] args) {
		launch(args);
	}
	private Label label1,label2;
	private CheckBox c1,c2,c3;
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		label1=new Label("Select your foods: ");
		c1=new CheckBox("Pizza");
		c2=new CheckBox("Burger");
		c3=new CheckBox("Pasta");
		label2=new Label("Your have selected: ");
		
		c1.setFont(Font.font(20));
		c2.setFont(Font.font(20));
		c3.setFont(Font.font(20));
		label1.setFont(Font.font(20));
		label2.setFont(Font.font(20));
		
		c1.setOnAction(this);
		c2.setOnAction(this);
		c3.setOnAction(this);
		
		VBox root=new VBox();
		root.setSpacing(10);
		root.setPadding(new Insets(10));
		root.getChildren().addAll(label1,c1,c2,c3,label2);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("CheckBox Example");
		
		stage.show();
	}
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String str="You have selected: \n";
		if(c1.isSelected()) {
			str+=c1.getText()+"\n";
		}
		if(c2.isSelected()) {
			str+=c2.getText()+"\n";
		}
		if(c3.isSelected()) {
			str+=c3.getText()+"\n";
		}
		label2.setText(str);
	}

}
