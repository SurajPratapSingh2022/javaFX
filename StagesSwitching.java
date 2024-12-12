package application;
//switching b/w stages
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StagesSwitching extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	private Stage stage1,stage2;
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage1=createStage1();
		stage2=createStage2();
		
		stage1.show();
		
	}
	private Stage createStage1() {
		Stage stage=new Stage(StageStyle.DECORATED);
		stage.setTitle("Stage 1");
		
		VBox root=new VBox(10);
		Button button=new Button("Close Second Stage");
		button.setOnAction(e->{
			stage2.show();
		});
		root.getChildren().add(button);
		stage.setScene(new Scene(root,400,400));
		return stage;
	}
	private Stage createStage2() {
		Stage stage=new Stage(StageStyle.DECORATED);
		stage.setTitle("Stage 2");
		
		stage.initModality(Modality.NONE);
		stage.initOwner(stage2);
		
		VBox root=new VBox(10);
		Button button=new Button("Close Second Stage");
		button.setOnAction(e->{
			stage2.close();
		});
		root.getChildren().add(button);
		stage.setScene(new Scene(root,300,300));
		return stage;
	}
}
