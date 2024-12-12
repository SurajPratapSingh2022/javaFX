package application;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CustomDialogExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Custom Dialog Example");
        stage.show();

        Button button = new Button("Show Dialog");
        root.setCenter(button);

        button.setOnAction(e -> {
            Dialog dialog = new Dialog();
            dialog.setTitle("Login Form");
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
            dialog.getDialogPane().setContent(createLoginForm());
            dialog.show();
        });
    }

    private Node createLoginForm() {
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Username: "), 0, 0);
        gridPane.add(new Label("Password: "), 0, 1);
        gridPane.add(new TextField(), 1, 0);
        gridPane.add(new TextField(), 1, 1);
        gridPane.add(new Button("Submit"), 0, 2);
        return gridPane;
    }
}
