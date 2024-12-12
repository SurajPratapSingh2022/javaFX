package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceDialogExample2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		VBox root=new VBox(10);
		root.setAlignment(Pos.CENTER);
		stage.setScene(new Scene(root,400,300));
		stage.setTitle("ChoiceDialog Example");
		stage.show();
		
		Button button=new Button("Show Days");
		Label label=new Label("Result");
		root.getChildren().addAll(button,label);
		
		button.setOnAction(e->{
			Book[] books= {
					new Book(1L,"J01","Java Tutorials for beginners"),
					new Book(2L,"P01","Python Tutorials for beginners"),
					new Book(3L,"Cp01","C++ Tutorials for beginners"),
					new Book(4L,"JS01","JavaScript Tutorials for beginners"),
					new Book(5L,"PHP01","PHP Tutorials for beginners"),
					new Book(6L,"G001","Go Tutorials for beginners")
					
			};
			ChoiceDialog<Book> dialog=new ChoiceDialog<>(books[0],books);
			dialog.setTitle("Book Selection");
			dialog.setHeaderText("Select a book");
			Optional<Book> result=dialog.showAndWait();
			result.ifPresent((book)->{
				label.setText(book.getId()+":"+book.getCode()+":"+book.getName());
				
			});
		});
	}
}