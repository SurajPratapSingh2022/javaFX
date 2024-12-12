package application;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PaginationExample extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pagination pagination=new Pagination();
		pagination.setPageCount(20);
		pagination.setPageFactory((pageIndex)->{
			Parent page=createPage(pageIndex);
			return page;
		});
		
		pagination.setCurrentPageIndex(4);
		
		BorderPane root=new BorderPane();
		root.setCenter(pagination);
		stage.setScene(new Scene(root,400,400));
		stage.setTitle("Pagination Example");
		stage.show();
	}
		
		
		
		
		
	public Parent createPage(int pageIndex) {
		VBox pane=new VBox();
		pane.setSpacing(10);
		Label label1=new Label("Content for page Index: "+(pageIndex+1));
		Label label2=new Label("This is the content for page index: "+(pageIndex+1));
		label1.setFont(Font.font(18));
		pane.getChildren().addAll(label1,label2);
		return pane;
		
	}

}
