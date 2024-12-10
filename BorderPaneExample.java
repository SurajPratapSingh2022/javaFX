package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button top = createButton("Top");
        Button left = createButton("Left");
        Button bottom = createButton("Bottom");
        Button right = createButton("Right");
        Button center = createButton("Center");

        BorderPane root = new BorderPane(); // Correctly using javafx.scene.layout.BorderPane
        root.setTop(top);
        root.setBottom(bottom);
        root.setLeft(left);
        root.setRight(right);
        root.setCenter(center);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("BorderPane Example");
        stage.show();
    }

    private Button createButton(String str) {
        Button button = new Button(str);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setMinSize(100, 100);
        BorderPane.setMargin(button, new Insets(5));
        BorderPane.setAlignment(button, Pos.CENTER);
        return button;
    }
}
