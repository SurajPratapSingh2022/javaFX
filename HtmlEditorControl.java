package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HtmlEditorControl extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		HTMLEditor htmlEditor=new HTMLEditor();
		
		htmlEditor.setHtmlText("Hello,<b>This is my paragraph.</b>");
		Button button=new Button("Get HTML Code");
		button.setOnAction(e->{
			String text=htmlEditor.getHtmlText();
			System.out.println(text);
			
		});
		
		
		BorderPane root=new BorderPane();
		root.setCenter(htmlEditor);
		root.setBottom(button);
		
		Scene scene=new Scene(root,800,400);
		stage.setScene(scene);
		stage.setTitle("HTMLEditor Example");
		stage.show();
	
	}

}
