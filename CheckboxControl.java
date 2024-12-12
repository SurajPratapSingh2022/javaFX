package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CheckboxControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
//		CheckBox c1=new CheckBox();
//		c1.setText("Piza");
		CheckBox c1=new CheckBox("Pizza");
		c1.setFont(Font.font(20));
		c1.setOnAction(e->{
			if(c1.isSelected()) {
				System.out.println(c1.getText()+" Selected");
			}else {
				System.out.println(c1.getText()+" Not Selected");
			}
		});
		c1.setIndeterminate(true);
		VBox root=new VBox();
		root.setSpacing(10);
		root.setPadding(new Insets(10));
		root.getChildren().add(c1);
		
		Scene scene=new Scene(root,400,400);
		stage.setScene(scene);
		stage.setTitle("CheckBox Example");
		
		stage.show();
	}

}
