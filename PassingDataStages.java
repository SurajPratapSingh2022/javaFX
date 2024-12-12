package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PassingDataStages extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	private Stage stage1,stage2;
	private Label labelMessage;
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		stage1=createStage1();
		stage2=createStage2();
		stage1.show();
	}
	private Stage createStage1() {
		// TODO Auto-generated method stub
		Stage stage=new Stage(StageStyle.DECORATED);
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		labelMessage=new Label("Message will appear here");
		
		Button button=new Button("Open Stage 2");
		button.setOnAction(e->{
			stage2.show();
		});
		root.getChildren().add(labelMessage);
		root.getChildren().add(button);
		Scene scene=new Scene(root,300,300);
		stage.setScene(scene);
		stage.setTitle("Stage 1");
		return stage;
	}
	private Stage createStage2() {
		// TODO Auto-generated method stub
		Stage stage=new Stage(StageStyle.DECORATED);
		
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		Label label=new Label("Enter Message");
		final TextField textField=new TextField("");
		Button button=new Button("submit");
		
		button.setOnAction(e->{
			String text=textField.getText().toString();
			labelMessage.setText(text);
			textField.setText("");
			stage2.close();
		});
		
		root.getChildren().addAll(label,textField,button);
		Scene scene=new Scene(root,250,250);
		stage.setScene(scene);
		stage.setTitle("Stage 2");
		return stage;
	}

}
